import LOGO_KIWIQA from "../Images/kiwiqa-logo.png";
import LOGO_SISENSE from "../Images/Sisense-Logo.svg";
import CHROME_LOGO from "../Images/CHROME_LOGO.png";
import FIREFOX_LOGO from "../Images/FIREFOX_LOGO.png";
import EDGE_LOGO from "../Images/EDGE_LOGO.png";
import SAFARI_LOGO from "../Images/SAFARI_LOGO.png";
import { Link } from "react-router-dom";
import { useEffect, useRef, useState } from "react";

const CSS = `
  @import url('https://fonts.googleapis.com/css2?family=JetBrains+Mono:wght@400;600&family=Sora:wght@400;600;700&display=swap');

  *, *::before, *::after { box-sizing: border-box; margin: 0; padding: 0; }

  body {
    font-family: 'Sora', sans-serif;
    background: #f0f4f0;
    min-height: 100vh;
  }

  .dash-root {
    min-height: 100vh;
    background: linear-gradient(135deg, #f0f5f0 0%, #e8f0e8 60%, #f4f8f4 100%);
    display: flex;
    flex-direction: column;
  }

  /* ── HEADER ── */
  .dash-header {
  position: sticky;
  top: 0;
  z-index: 1000;

  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 14px 40px;
  background: #ffffff;
  border-bottom: 2px solid #d4e8d4;
  box-shadow: 0 2px 12px rgba(100,160,100,0.10);
}
  
  .dash-header .kiwi-logo , .dash-header .sisense-logo {
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
 
  /* ── MAIN LAYOUT ── */
  .dash-body {
    flex: 1;
    display: flex;
    flex-direction: column;
    align-items: center;
    padding: 36px 0 60px;
    width: 100%;
  }

  /* ── CONTROLS CARD ── */
  .controls-card {
    background: #ffffff;
    border: 1.5px solid #c8e0c8;
    border-radius: 16px;
    padding: 36px 48px;
    width: 100%;
    max-width: 780px;
    display: grid;
    grid-template-columns: 1fr 1fr;
    gap: 28px 48px;
    align-items: start;
    box-shadow: 0 4px 20px rgba(100,160,100,0.10);
  }

  .field-group {
    display: flex;
    flex-direction: column;
    gap: 10px;
  }
  .field-group.full-width { grid-column: 1 / -1; }

  .field-label {
    font-size: 11px;
    font-weight: 700;
    letter-spacing: 1.5px;
    text-transform: uppercase;
    color: #5a8a5a;
  }

  /* Dropdowns */
  .dash-select {
    background: #f4faf4;
    border: 1.5px solid #b8d8b8;
    border-radius: 8px;
    color: #2d4a2d;
    font-family: 'Sora', sans-serif;
    font-size: 14px;
    padding: 10px 14px;
    width: 100%;
    appearance: none;
    background-image: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='12' height='8' viewBox='0 0 12 8'%3E%3Cpath fill='%235a8a5a' d='M1 1l5 5 5-5'/%3E%3C/svg%3E");
    background-repeat: no-repeat;
    background-position: right 14px center;
    cursor: pointer;
    transition: border-color 0.2s, background-color 0.2s;
  }
  .dash-select:focus { outline: none; border-color: #7CC242; background-color: #edf7ed; }
  .dash-select option { background: #fff; color: #2d4a2d; }

  /* Radio chips */
  .radio-row {
    display: flex;
    gap: 8px;
    flex-wrap: wrap;
  }
  .report-row {
  grid-column: 1 / -1;
  display: flex;
  gap: 12px;
  width: 100%;
  }

  .report-row button,
  .report-row a {
    flex: 1;
  }
  
  .radio-chip {
    display: flex;
    align-items: center;
    gap: 6px;
    padding: 8px 16px;
    border-radius: 8px;
    border: 1.5px solid #c8e0c8;
    background: #f4faf4;
    cursor: pointer;
    font-size: 13px;
    font-weight: 500;
    color: #5a8a5a;
    transition: all 0.18s;
    user-select: none;
    flex: 1;  
  }
  .radio-chip:hover { border-color: #7CC242; color: #3a6a3a; background: #edf7ed; }
  .radio-chip.active {
    border-color: #7CC242;
    background: #e8f5d8;
    color: #3a7a10;
  }
  .radio-chip input { display: none; }
  .radio-dot {
    width: 8px; height: 8px;
    border-radius: 50%;
    border: 2px solid currentColor;
    transition: background 0.18s;
  }
  .radio-chip.active .radio-dot { background: currentColor; }

  /* Execute button */
  .execute-btn {
    grid-column: 1 / -1;
    background: linear-gradient(135deg, #7CC242 0%, #5a9e20 100%);
    border: none;
    border-radius: 10px;
    color: #fff;
    font-family: 'Sora', sans-serif;
    font-size: 15px;
    font-weight: 700;
    letter-spacing: 0.5px;
    padding: 8px;
    width: 100%;
    cursor: pointer;
    transition: opacity 0.2s, transform 0.15s, box-shadow 0.2s;
    box-shadow: 0 4px 16px rgba(124,194,66,0.30);
    text-transform: uppercase;
  }
  .execute-btn:hover { opacity: 0.92; transform: translateY(-1px); box-shadow: 0 6px 24px rgba(124,194,66,0.40); }
  .execute-btn:active { transform: translateY(0); }
  .execute-btn:disabled { opacity: 0.5; cursor: not-allowed; transform: none; }
  .execute-btn.running {
    background: linear-gradient(135deg, #f59e0b 0%, #d97706 100%);
    box-shadow: 0 4px 16px rgba(245,158,11,0.28);
    animation: pulse-btn 1.2s ease-in-out infinite;
  }
  @keyframes pulse-btn {
    0%, 100% { box-shadow: 0 4px 16px rgba(245,158,11,0.28); }
    50% { box-shadow: 0 4px 28px rgba(245,158,11,0.50); }
  }

  /* ── LOGS PANEL ── */
  .logs-card {
    margin-top: 24px;
    width: 100%;
    max-width: 780px;
    background: #ffffff;
    border: 1.5px solid #c8e0c8;
    border-radius: 16px;
    overflow: hidden;
    box-shadow: 0 4px 20px rgba(100,160,100,0.08);
  }
  .logs-header {
    display: flex;
    align-items: center;
    justify-content: space-between;
    padding: 12px 20px;
    border-bottom: 1px solid #e0f0e0;
    background: #f4faf4;
  }
  .logs-header-left {
    display: flex;
    align-items: center;
    gap: 10px;
  }
  .logs-dot { width: 8px; height: 8px; border-radius: 50%; background: #7CC242; }
  .logs-dot.active { animation: blink 1s step-start infinite; }
  @keyframes blink { 50% { opacity: 0.2; } }
  .logs-title {
    font-size: 11px;
    font-weight: 700;
    letter-spacing: 2px;
    text-transform: uppercase;
    color: #5a8a5a;
  }
  .logs-clear-btn {
    background: none;
    border: 1px solid #c8e0c8;
    border-radius: 5px;
    color: #7a9a7a;
    font-family: 'Sora', sans-serif;
    font-size: 11px;
    padding: 3px 10px;
    cursor: pointer;
    transition: all 0.15s;
  }
  .logs-clear-btn:hover { border-color: #7CC242; color: #3a7a10; background: #edf7ed; }

  .log-box {
    padding: 16px 20px;
    height: 260px;
    overflow-y: auto;
    font-family: 'JetBrains Mono', monospace;
    font-size: 12.5px;
    line-height: 1.7;
    background: #fafffe;
  }
  .log-box::-webkit-scrollbar { width: 5px; }
  .log-box::-webkit-scrollbar-track { background: transparent; }
  .log-box::-webkit-scrollbar-thumb { background: #c8e0c8; border-radius: 3px; }

  .empty-log { color: #aac8aa; font-style: italic; }

  .log-line { color: #4a6a4a; }
  .log-line.info    { color: #2A9BA8; }
  .log-line.warn    { color: #b57b00; }
  .log-line.error   { color: #cc3333; }
  .log-line.success { color: #3a8a10; }

  /* Status bar */
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
  /* Popup overlay */
.confirm-overlay {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: rgba(0,0,0,0.35);
  display: flex;
  align-items: center;
  justify-content: center;
  z-index: 2000;
}

/* Popup box */
.confirm-modal {
  background: #ffffff;
  border: 1.5px solid #c8e0c8;
  border-radius: 14px;
  padding: 28px 32px;
  width: 360px;
  text-align: center;
  box-shadow: 0 6px 28px rgba(0,0,0,0.15);
}

/* Title */
.confirm-title {
  font-size: 16px;
  font-weight: 700;
  color: #2d5a2d;
  margin-bottom: 12px;
}

/* Text */
.confirm-text {
  font-size: 13px;
  color: #5a8a5a;
  margin-bottom: 22px;
}

/* Buttons container */
.confirm-actions {
  display: flex;
  gap: 10px;
  justify-content: center;
}

/* Cancel button */
.confirm-cancel {
  padding: 7px 18px;
  border: 1.5px solid #c8e0c8;
  border-radius: 8px;
  background: #fff;
  color: #5a8a5a;
  cursor: pointer;
}

/* Execute button */
.confirm-run {
  padding: 7px 18px;
  border: none;
  border-radius: 8px;
  background: linear-gradient(135deg,#7CC242,#5a9e20);
  color: #fff;
  font-weight: 700;
  cursor: pointer;
}
`;

export default function AutomationDashboard({
  environment, setEnvironment,
  browser, setBrowser,
  mode, setMode,
  file, setFile,
  buildFiles = [],
  logs = [],
  loading = false,
  reportReady = false,
  progress = 0,
  steps = 0,
  onExecute,
}) {
  // aliases so the JSX below stays unchanged
  const env = environment;
  const setEnv = setEnvironment;
  const execMode = mode;
  const setExecMode = setMode;
  const [showLogs, setShowLogs] = useState(false);
  const [showConfirm, setShowConfirm] = useState(false);
  const logRef = useRef(null);

  useEffect(() => {
    if (logRef.current) logRef.current.scrollTop = logRef.current.scrollHeight;
  }, [logs]);

  return (
    <>
      <style>{CSS}</style>
      <div className="dash-root">
        <header className="dash-header">
          <img src={LOGO_KIWIQA} alt="KiwiQA" className="kiwi-logo" />
          <div className="dash-title">Automation Dashboard</div>
          <img src={LOGO_SISENSE} alt="Sisense" className="sisense-logo" />
        </header>

        <main className="dash-body">
          <div className="controls-card">
            <div className="field-group">
              <label className="field-label">Environment</label>
              <select className="dash-select" value={env} onChange={e => setEnv(e.target.value)}>
                {["QA", "Staging", "Production", "Dev"].map(e => <option key={e}>{e}</option>)}
              </select>
            </div>

            <div className="field-group">
              <label className="field-label">Test Suite</label>
              <select className="dash-select" value={file} onChange={e => setFile(e.target.value)}>
                <option value="" disabled={true}>Select Test Suite</option>
                {buildFiles.map(f => <option key={f}>{f}</option>)}
              </select>
            </div>

            <div className="field-group full-width">
              <label className="field-label">Browser</label>
              <div className="radio-row">
                {[
                  { name: "Chrome", logo: CHROME_LOGO },
                  { name: "Firefox", logo: FIREFOX_LOGO },
                  { name: "Edge", logo: EDGE_LOGO },
                  { name: "Safari", logo: SAFARI_LOGO },
                ].map(b => (
                  <label key={b.name} className={`radio-chip ${browser === b.name ? "active" : ""}`}>
                    <input
                      type="radio"
                      value={b.name}
                      checked={browser === b.name}
                      onChange={() => setBrowser(b.name)}
                    />
                    <img
                      src={b.logo}
                      alt={b.name}
                      style={{ width: "16px", height: "16px", objectFit: "contain" }}
                    />
                    {b.name}
                  </label>
                ))}
              </div>
            </div>

              <button
                  className={`execute-btn ${loading ? "running" : ""}`}
                  onClick={() => {

                      if (!file) {
                          alert("⚠️ Please select a Test Suite before executing.");
                          return;
                      }

                      setShowConfirm(true);

                  }}
                  disabled={loading}
              >
              {loading ? "⏳  Running..." : "▶  Execute"}
            </button>

            {/* Progress bar */}
            {loading && (
              <div className="field-group full-width" style={{ marginTop: "12px" }}>
                <div style={{ display: "flex", justifyContent: "space-between", marginTop: "6px", fontFamily: "'JetBrains Mono',monospace", fontSize: "11px", color: "#5a8a5a" }}>

                  <span>Execution in Process...</span>

                </div>
                <div style={{ background: "#d4ecd4", borderRadius: "8px", overflow: "hidden", height: "10px" }}>
                  <div style={{ width: `${progress}%`, height: "100%", background: "linear-gradient(90deg,#7CC242,#5a9e20)", transition: "width 0.4s ease" }} />
                </div>

                <div style={{ display: "flex", justifyContent: "space-between", marginTop: "6px", fontFamily: "'JetBrains Mono',monospace", fontSize: "11px", color: "#5a8a5a" }}>
                  <span>Steps executed: <strong>{steps}</strong></span>
                  <span><strong>{progress}%</strong> completed</span>
                </div>
              </div>
            )}

            {/* Report section */}
            <div className="report-row" style={{ display: "flex", gap: "10px" }}>

              {/* View Report */}
              <button
                onClick={() => {

                  if (loading) {
                    alert("⚠️ Execution is still in progress. Please wait.");
                    return;
                  }

                  if (!reportReady) {
                    alert("⚠️ Please execute the test suite first.");
                    return;
                  }

                  window.open("http://localhost:8081/api/report/latest", "_blank");

                }}
                style={{
                  flex: 1,
                  padding: "8px",
                  background: "#fff",
                  border: "1.5px solid #7CC242",
                  borderRadius: "8px",
                  color: "#3a7a10",
                  fontFamily: "'Sora',sans-serif",
                  fontWeight: 700,
                  fontSize: "13px",
                  textAlign: "center",
                  display: "flex",
                  alignItems: "center",
                  justifyContent: "center",
                  cursor: "pointer"
                }}
              >
                View Report
              </button>

              {/* View Reports History */}
              <Link
                to="/reports"
                style={{
                  flex: 1,
                  padding: "8px",
                  background: "#fff",
                  border: "1.5px solid #7CC242",
                  borderRadius: "8px",
                  color: "#3a7a10",
                  fontFamily: "'Sora',sans-serif",
                  fontWeight: 700,
                  fontSize: "13px",
                  textAlign: "center",
                  textDecoration: "none",
                  display: "flex",
                  alignItems: "center",
                  justifyContent: "center"
                }}
              >
                View Reports History
              </Link>

              {/* View Execution Logs */}
              <button
                onClick={() => setShowLogs(!showLogs)}
                style={{
                  flex: 1,
                  padding: "8px",
                  background: "#fff",
                  border: "1.5px solid #7CC242",
                  borderRadius: "8px",
                  color: "#3a7a10",
                  fontFamily: "'Sora',sans-serif",
                  fontWeight: 700,
                  fontSize: "13px",
                  textAlign: "center",
                  display: "flex",
                  alignItems: "center",
                  justifyContent: "center",
                  cursor: "pointer"
                }}
              >
                {showLogs ? "Hide Execution Logs" : "View Execution Logs"}
              </button>

            </div>
          </div>

          {showLogs && (
            <div className="logs-card">
              <div className="logs-header">
                <div className="logs-header-left">
                  <div className={`logs-dot ${loading ? "active" : ""}`} />
                  <span className="logs-title">Execution Logs</span>
                </div>
              </div>
              <div className="log-box" ref={logRef}>
                {logs.length === 0
                  ? <p className="empty-log">Execution logs.....</p>
                  : logs.map((log, i) => (
                    <div key={i} className="log-line">
                      {typeof log === "string" ? log : log.text}
                    </div>
                  ))
                }
              </div>
            </div>
          )}

          <div className="status-bar">
            <div className="status-pill">env <span>{env}</span></div>
            <div className="status-pill">browser <span>{browser}</span></div>
            <div className="status-pill">mode <span>{execMode}</span></div>
          </div>
        </main>
        {showConfirm && (
          <div className="confirm-overlay">

            <div className="confirm-modal">

              <div className="confirm-title">
                Confirm Execution
              </div>

              <div className="confirm-text">
                Are you sure you want to execute this test suite?
              </div>

              <div className="confirm-actions">

                <button
                  className="confirm-cancel"
                  onClick={() => setShowConfirm(false)}
                >
                  Cancel
                </button>

                <button
                  className="confirm-run"
                  onClick={() => {
                    setShowConfirm(false);
                    onExecute();
                  }}
                >
                  Execute
                </button>

              </div>

            </div>

          </div>
        )}
      </div>
    </>
  );
}
