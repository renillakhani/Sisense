
import React, { useEffect, useState } from "react";
import LOGO_KIWIQA from "../Images/kiwiqa-logo.png";
import LOGO_SISENSE from "../Images/Sisense-Logo.svg";
import VIEW_ICON from "../Images/VIEW.png";
import DOWNLOAD_ICON from "../Images/DOWNLOAD.png";

const CSS = `
@import url('https://fonts.googleapis.com/css2?family=JetBrains+Mono:wght@400;600&family=Sora:wght@400;600;700&display=swap');

*{box-sizing:border-box;margin:0;padding:0}

body{
    font-family:'Sora',sans-serif;
    background:#f0f4f0;
    min-height:100vh;
}

.reports-root{
    min-height:100vh;
    background:linear-gradient(135deg,#f0f5f0 0%,#e8f0e8 60%,#f4f8f4 100%);
    display:flex;
    flex-direction:column;
}

/* HEADER */
.dash-header{
    display:flex;
    align-items:center;
    justify-content:space-between;
    padding:14px 40px;
    background:#fff;
    border-bottom:2px solid #d4e8d4;
    box-shadow:0 2px 12px rgba(100,160,100,.10)
}

.kiwi-logo,.sisense-logo{
    height:44px;
    width:150px;
    object-fit:contain
}

.dash-title{
    font-size:18px;
    font-weight:700;
    color:#2d5a2d;
    letter-spacing:1px;
    text-transform:uppercase
}

.reports-body{
    flex:1;
    display:flex;
    flex-direction:column;
    align-items:center;
    padding:36px 0 60px;
    width:100%
}

.back-btn{
    align-self:flex-start;
    margin-left:calc((100% - 780px) / 2);
    margin-bottom:20px;
    border:1.5px solid #b8d8b8;
    border-radius:8px;
    padding:7px 16px;
    font-size:13px;
    font-weight:600;
    color:#5a8a5a;
    cursor:pointer;
    background:none
}

.reports-card{
    background:#fff;
    border:1.5px solid #c8e0c8;
    border-radius:16px;
    width:100%;
    max-width:780px;
    box-shadow:0 4px 20px rgba(100,160,100,.10);
    overflow:hidden
}

.reports-card-header{
    display:flex;
    align-items:center;
    justify-content:space-between;
    padding:20px 28px;
    background:#f4faf4;
    border-bottom:1px solid #e0f0e0
}

.reports-card-title{
    font-size:11px;
    font-weight:700;
    letter-spacing:2px;
    text-transform:uppercase;
    color:#5a8a5a
}

.reports-count-badge{
    background:#e8f5d8;
    border:1.5px solid #b0d8b0;
    border-radius:20px;
    padding:3px 12px;
    font-family:'JetBrains Mono',monospace;
    font-size:11px;
    font-weight:600;
    color:#3a7a10
}

.reports-table{
    width:100%;
    border-collapse:collapse
}

.reports-table th{
    padding:12px 20px;
    font-size:10px;
    letter-spacing:1.5px;
    text-transform:uppercase;
    color:#5a8a5a;
    text-align:left
}

.reports-table td{
    padding:14px 20px;
    font-size:13px;
    color:#2d4a2d
}

.reports-table tbody tr:hover{
    background:#f9fdf9
}

.report-name{
    font-family:'JetBrains Mono',monospace;
    word-break:break-all
}

.action-buttons{
    display:flex;
    gap:8px;
    justify-content:center
}

.btn-view{
    padding:7px 16px;
    background:#fff;
    border:1.5px solid #7CC242;
    border-radius:7px;
    color:#fff;
    font-size:12px;
    font-weight:700;
    cursor:pointer
}

.btn-download{
    padding:7px 16px;
    background:#fff;
    border:1.5px solid #7CC242;
    border-radius:7px;
    color:#3a7a10;
    font-size:12px;
    font-weight:700;
    cursor:pointer
}

/* PAGINATION */
.pagination{
    display:flex;
    justify-content:center;
    align-items:center;
    gap:6px;
    padding:18px;
    border-top:1px solid #eef6ee
}

.page-btn{
    padding:6px 12px;
    border:1.5px solid #7CC242;
    border-radius:6px;
    background:#fff;
    font-size:12px;
    cursor:pointer;
    color:#3a7a10;
    font-weight:600
}

.page-btn:hover{
    background:#edf7ed
}

.page-btn.active{
    background:#7CC242;
    color:#fff
}

.page-btn:disabled{
    opacity:.35;
    cursor:not-allowed
}

.action-icon{
    width: 16px;
    height: 16px
}
`;

function ViewReports() {

    const [reports, setReports] = useState([]);
    const [loading, setLoading] = useState(true);

    const [currentPage, setCurrentPage] = useState(1);
    const reportsPerPage = 5;

    useEffect(() => {
        fetch("http://localhost:8081/api/reports")
            .then(res => res.json())
            .then(data => {
                setReports(data);
                setLoading(false);
            })
            .catch(() => setLoading(false))
    }, []);

    /* PAGINATION LOGIC */
    const totalPages = Math.ceil(reports.length / reportsPerPage);

    const indexOfLast = currentPage * reportsPerPage;
    const indexOfFirst = indexOfLast - reportsPerPage;

    const currentReports = reports.slice(indexOfFirst, indexOfLast);

    const changePage = (page) => {
        if (page < 1 || page > totalPages) return;
        setCurrentPage(page);
    };

    const openReport = (fileName) => {
        window.open(`http://localhost:8081/api/reports/view/${fileName}`, "_blank");
    };

    const downloadReport = (fileName) => {

        const link = document.createElement("a");

        link.href = `http://localhost:8081/api/reports/download/${fileName}`;
        link.setAttribute("download", fileName);

        document.body.appendChild(link);
        link.click();
        document.body.removeChild(link);

    };

    return (
        <>
            <style>{CSS}</style>

            <div className="reports-root">

                <header className="dash-header">
                    <img src={LOGO_KIWIQA} alt="KiwiQA" className="kiwi-logo" />
                    <div className="dash-title">Reports History</div>
                    <img src={LOGO_SISENSE} alt="Sisense" className="sisense-logo" />
                </header>

                <main className="reports-body">

                    <button className="back-btn" onClick={() => window.history.back()}>
                        ← Back to Dashboard
                    </button>

                    <div className="reports-card">

                        <div className="reports-card-header">
                            <span className="reports-card-title">All Reports</span>

                            <span className="reports-count-badge">
                                {loading ? "..." : `${reports.length} reports`}
                            </span>
                        </div>

                        {loading && (
                            <div style={{ padding: "40px", textAlign: "center" }}>
                                Fetching reports...
                            </div>
                        )}

                        {!loading && reports.length === 0 && (
                            <div style={{ padding: "40px", textAlign: "center" }}>
                                No reports available yet.
                            </div>
                        )}

                        {!loading && reports.length > 0 && (
                            <>

                                <table className="reports-table">

                                    <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>Report Name</th>
                                            <th style={{ textAlign: "center" }}>Actions</th>
                                        </tr>
                                    </thead>

                                    <tbody>

                                        {currentReports.map((report, index) => (
                                            <tr key={index}>

                                                <td>{indexOfFirst + index + 1}</td>

                                                <td className="report-name">
                                                    {report}
                                                </td>

                                                <td>

                                                    <div className="action-buttons">

                                                        <button
                                                            className="btn-view"
                                                            onClick={() => openReport(report)}
                                                        >
                                                            <img src={VIEW_ICON} alt="View" className="action-icon"/>
                                                        </button>

                                                        <button
                                                            className="btn-download"
                                                            onClick={() => downloadReport(report)}
                                                        >
                                                            <img src={DOWNLOAD_ICON} alt="Download" className="action-icon"/>
                                                        </button>

                                                    </div>

                                                </td>

                                            </tr>
                                        ))}

                                    </tbody>

                                </table>

                                {/* PAGINATION */}

                                <div className="pagination">

                                    <button
                                        className="page-btn"
                                        onClick={() => changePage(1)}
                                        disabled={currentPage === 1}
                                    >
                                        &laquo;
                                    </button>

                                    <button
                                        className="page-btn"
                                        onClick={() => changePage(currentPage - 1)}
                                        disabled={currentPage === 1}
                                    >
                                        &lsaquo;
                                    </button>

                                    {[...Array(totalPages)].map((_, i) => {

                                        const page = i + 1;

                                        return (
                                            <button
                                                key={page}
                                                className={`page-btn ${currentPage === page ? "active" : ""}`}
                                                onClick={() => changePage(page)}
                                            >
                                                {page}
                                            </button>
                                        );

                                    })}

                                    <button
                                        className="page-btn"
                                        onClick={() => changePage(currentPage + 1)}
                                        disabled={currentPage === totalPages}
                                    >
                                        &rsaquo;
                                    </button>

                                    <button
                                        className="page-btn"
                                        onClick={() => changePage(totalPages)}
                                        disabled={currentPage === totalPages}
                                    >
                                        &raquo;
                                    </button>

                                </div>

                            </>
                        )}

                    </div>

                </main>

            </div>
        </>
    );
}

export default ViewReports;

