import React, { useEffect, useState } from "react";
import LOGO_KIWIQA from "../Images/kiwiqa-logo.png";
import LOGO_SISENSE from "../Images/Sisense-Logo.svg";

const CSS = `
  @import url('https://fonts.googleapis.com/css2?family=JetBrains+Mono:wght@400;600&family=Sora:wght@400;600;700&display=swap');

  *, *::before, *::after { box-sizing: border-box; margin: 0; padding: 0; }

  body {
    font-family: 'Sora', sans-serif;
    background: #f0f4f0;
    min-height: 100vh;
  }

  /* ── ROOT ── */
  .reports-root {
    min-height: 100vh;
    background: linear-gradient(135deg, #f0f5f0 0%, #e8f0e8 60%, #f4f8f4 100%);
    display: flex;
    flex-direction: column;
  }

  /* ── HEADER ── */
  .dash-header {
    display: flex;
    align-items: center;
    justify-content: space-between;
    padding: 14px 40px;
    background: #ffffff;
    border-bottom: 2px solid #d4e8d4;
    box-shadow: 0 2px 12px rgba(100,160,100,0.10);
  }
  .dash-header .kiwi-logo,
  .dash-header .sisense-logo {
    height: 44px;
    width: 150px;
    object-fit: contain;
  }
  .dash-title {
    font-size: 18px;
    font-weight: 700;
    color: #2d5a2d;
    letter-spacing: 1px;
    text-transform: uppercase;
  }

  /* ── MAIN BODY ── */
  .reports-body {
    flex: 1;
    display: flex;
    flex-direction: column;
    align-items: center;
    padding: 36px 0 60px;
    width: 100%;
  }

  /* ── BACK BUTTON ── */
  .back-btn {
    align-self: flex-start;
    margin-left: calc((100% - 780px) / 2);
    margin-bottom: 20px;
    display: flex;
    align-items: center;
    gap: 6px;
    background: none;
    border: 1.5px solid #b8d8b8;
    border-radius: 8px;
    padding: 7px 16px;
    font-family: 'Sora', sans-serif;
    font-size: 13px;
    font-weight: 600;
    color: #5a8a5a;
    cursor: pointer;
    transition: all 0.18s;
  }
  .back-btn:hover {
    border-color: #7CC242;
    color: #3a7a10;
    background: #edf7ed;
  }

  /* ── REPORTS CARD ── */
  .reports-card {
    background: #ffffff;
    border: 1.5px solid #c8e0c8;
    border-radius: 16px;
    width: 100%;
    max-width: 780px;
    box-shadow: 0 4px 20px rgba(100,160,100,0.10);
    overflow: hidden;
  }

  /* ── CARD HEADER ── */
  .reports-card-header {
    display: flex;
    align-items: center;
    justify-content: space-between;
    padding: 20px 28px;
    background: #f4faf4;
    border-bottom: 1px solid #e0f0e0;
  }
  .reports-card-header-left {
    display: flex;
    align-items: center;
    gap: 10px;
  }
  .reports-count-badge {
    background: #e8f5d8;
    border: 1.5px solid #b0d8b0;
    border-radius: 20px;
    padding: 3px 12px;
    font-family: 'JetBrains Mono', monospace;
    font-size: 11px;
    font-weight: 600;
    color: #3a7a10;
  }
  .reports-card-title {
    font-size: 11px;
    font-weight: 700;
    letter-spacing: 2px;
    text-transform: uppercase;
    color: #5a8a5a;
  }

  /* ── EMPTY STATE ── */
  .empty-state {
    padding: 60px 28px;
    text-align: center;
    color: #aac8aa;
    font-style: italic;
    font-size: 14px;
  }

  /* ── TABLE ── */
  .reports-table {
    width: 100%;
    border-collapse: collapse;
  }
  .reports-table thead tr {
    background: #f4faf4;
    border-bottom: 1.5px solid #e0f0e0;
  }
  .reports-table thead th {
    padding: 12px 20px;
    font-size: 10px;
    font-weight: 700;
    letter-spacing: 1.5px;
    text-transform: uppercase;
    color: #5a8a5a;
    text-align: left;
  }
  .reports-table thead th:first-child {
    width: 50px;
    text-align: center;
  }
  .reports-table thead th:last-child {
    width: 180px;
    text-align: center;
  }
  .reports-table tbody tr {
    border-bottom: 1px solid #eef6ee;
    transition: background 0.15s;
  }
  .reports-table tbody tr:last-child {
    border-bottom: none;
  }
  .reports-table tbody tr:hover {
    background: #f9fdf9;
  }
  .reports-table tbody td {
    padding: 14px 20px;
    font-size: 13px;
    color: #2d4a2d;
  }
  .reports-table tbody td:first-child {
    text-align: center;
    font-family: 'JetBrains Mono', monospace;
    font-size: 12px;
    color: #8aaa8a;
    font-weight: 600;
  }
  .reports-table tbody td.report-name {
    font-family: 'JetBrains Mono', monospace;
    font-size: 12px;
    color: #3a5a3a;
    word-break: break-all;
  }
  .reports-table tbody td:last-child {
    text-align: center;
  }

  /* ── ACTION BUTTONS ── */
  .action-buttons {
    display: flex;
    gap: 8px;
    justify-content: center;
  }
  .btn-view {
    padding: 7px 16px;
    background: linear-gradient(135deg, #7CC242, #5a9e20);
    border: none;
    border-radius: 7px;
    color: #fff;
    font-family: 'Sora', sans-serif;
    font-size: 12px;
    font-weight: 700;
    cursor: pointer;
    transition: opacity 0.18s, transform 0.15s;
  }
  .btn-view:hover {
    opacity: 0.88;
    transform: translateY(-1px);
  }
  .btn-download {
    padding: 7px 16px;
    background: #fff;
    border: 1.5px solid #7CC242;
    border-radius: 7px;
    color: #3a7a10;
    font-family: 'Sora', sans-serif;
    font-size: 12px;
    font-weight: 700;
    cursor: pointer;
    text-decoration: none;
    display: inline-flex;
    align-items: center;
    transition: background 0.18s, transform 0.15s;
  }
  .btn-download:hover {
    background: #edf7ed;
    transform: translateY(-1px);
  }

  /* ── LOADING STATE ── */
  .loading-state {
    padding: 60px 28px;
    text-align: center;
    font-family: 'JetBrains Mono', monospace;
    font-size: 12px;
    color: #7CC242;
    animation: pulse-text 1.2s ease-in-out infinite;
  }
  @keyframes pulse-text {
    0%, 100% { opacity: 1; }
    50%       { opacity: 0.4; }
  }

  /* ── STATUS BAR ── */
  .status-bar {
    margin-top: 14px;
    width: 100%;
    max-width: 780px;
    display: flex;
    justify-content: flex-end;
    gap: 16px;
  }
  .status-pill {
    font-family: 'JetBrains Mono', monospace;
    font-size: 11px;
    color: #8aaa8a;
    display: flex;
    align-items: center;
    gap: 5px;
  }
  .status-pill span { color: #7CC242; font-weight: 600; }
  .btn-remove {
  padding: 7px 16px;
  background: #ffeaea;
  border: 1.5px solid #ff6b6b;
  border-radius: 7px;
  color: #c0392b;
  font-family: 'Sora', sans-serif;
  font-size: 12px;
  font-weight: 700;
  cursor: pointer;
  transition: background 0.18s, transform 0.15s;
}

.btn-remove:hover {
  background: #ffdede;
  transform: translateY(-1px);
}
`;

function ViewReports() {

    const [reports, setReports] = useState([]);
    const [loading, setLoading] = useState(true);

    // Fetch reports list
    useEffect(() => {

        fetch("http://localhost:8081/api/reports")
            .then(res => res.json())
            .then(data => {
                setReports(data);
                setLoading(false);
            })
            .catch(err => {
                console.error(err);
                setLoading(false);
            });

    }, []);


    // View Report
    const openReport = (fileName) => {

        window.open(
            `http://localhost:8081/api/reports/view/${fileName}`,
            "_blank"
        );

    };


    // Download Report
    // const downloadReport = (fileName) => {
    //
    //     window.open(
    //         `http://localhost:8081/api/reports/download/${fileName}`
    //     );
    //
    // };

    const downloadReport = (fileName) => {

        const link = document.createElement("a");

        link.href = `http://localhost:8081/api/reports/download/${fileName}`;
        link.setAttribute("download", fileName);

        document.body.appendChild(link);

        link.click();

        document.body.removeChild(link);
    };

    // Delete Report
    // const deleteReport = (fileName) => {
    //
    //     const confirmDelete = window.confirm(
    //         "Are you sure you want to delete this report?"
    //     );
    //
    //     if (!confirmDelete) return;
    //
    //     fetch(`http://localhost:8081/api/reports/delete/${fileName}`, {
    //         method: "DELETE"
    //     })
    //         .then(res => res.text())
    //         .then(() => {
    //
    //             // Remove deleted report from UI
    //             setReports(prev => prev.filter(r => r !== fileName));
    //
    //         })
    //         .catch(err => console.error(err));
    //
    // };

    return (
        <>
            <style>{CSS}</style>

            <div className="reports-root">

                {/* HEADER */}
                <header className="dash-header">
                    <img src={LOGO_KIWIQA} alt="KiwiQA" className="kiwi-logo" />
                    <div className="dash-title">Reports History</div>
                    <img src={LOGO_SISENSE} alt="Sisense" className="sisense-logo" />
                </header>

                <main className="reports-body">

                    {/* BACK BUTTON */}
                    <button
                        className="back-btn"
                        onClick={() => window.history.back()}
                    >
                        ← Back to Dashboard
                    </button>

                    {/* REPORT CARD */}
                    <div className="reports-card">

                        <div className="reports-card-header">

                            <div className="reports-card-header-left">
                                <span className="reports-card-title">
                                    All Reports
                                </span>
                            </div>

                            <span className="reports-count-badge">
                                {loading
                                    ? "..."
                                    : `${reports.length} report${reports.length !== 1 ? "s" : ""}`}
                            </span>

                        </div>


                        {/* LOADING */}
                        {loading && (
                            <div className="loading-state">
                                Fetching reports...
                            </div>
                        )}


                        {/* EMPTY */}
                        {!loading && reports.length === 0 && (
                            <div className="empty-state">
                                No reports available yet.
                            </div>
                        )}


                        {/* TABLE */}
                        {!loading && reports.length > 0 && (

                            <table className="reports-table">

                                <thead>
                                <tr>
                                    <th>#</th>
                                    <th>Report Name</th>
                                    <th>Actions</th>
                                </tr>
                                </thead>

                                <tbody>

                                {reports.map((report, index) => (

                                    <tr key={index}>

                                        <td>{index + 1}</td>

                                        <td className="report-name">
                                            {report}
                                        </td>

                                        <td>

                                            <div className="action-buttons">

                                                <button
                                                    className="btn-view"
                                                    onClick={() => openReport(report)}
                                                >
                                                    View
                                                </button>

                                                <button
                                                    className="btn-download"
                                                    onClick={() => downloadReport(report)}
                                                >
                                                    Download
                                                </button>

                                                {/*<button*/}
                                                {/*    className="btn-remove"*/}
                                                {/*    onClick={() => deleteReport(report)}*/}
                                                {/*>*/}
                                                {/*    Remove*/}
                                                {/*</button>*/}

                                            </div>

                                        </td>

                                    </tr>

                                ))}

                                </tbody>

                            </table>

                        )}

                    </div>


                    {/* STATUS BAR */}
                    <div className="status-bar">

                        <div className="status-pill">
                            total <span>{reports.length}</span>
                        </div>

                        <div className="status-pill">
                            status <span>{loading ? "loading" : "ready"}</span>
                        </div>

                    </div>

                </main>

            </div>
        </>
    );
}

export default ViewReports;
