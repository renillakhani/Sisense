import React, { useState, useEffect } from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";

import AutomationDashboard from "./components/AutomationDashboard";
import ViewReports from "./components/ViewReports";

function App() {

  const [environment, setEnvironment] = useState("QA");
  const [browser, setBrowser] = useState("Chrome");
  const [mode, setMode] = useState("Headless");

  const [file, setFile] = useState("");
  const [buildFiles, setBuildFiles] = useState([]);

  const [logs, setLogs] = useState([]);
  const [loading, setLoading] = useState(false);

  const [reportReady, setReportReady] = useState(false);

  const [progress, setProgress] = useState(0);
  const [steps, setSteps] = useState(0);

  const TOTAL_ESTIMATED_STEPS = 40;

  // Load build files
  useEffect(() => {
    fetch("http://localhost:8081/api/files")
        .then((res) => res.json())
        .then((data) => setBuildFiles(data))
        .catch((err) => console.log(err));
  }, []);

  const runTest = async () => {

    if (!file) {
      alert("Please select a build file");
      return;
    }

    setLogs([]);
    setLoading(true);
    setReportReady(false);
    setProgress(0);
    setSteps(0);

    try {

      const response = await fetch("http://localhost:8081/api/run", {
        method: "POST",
        headers: {
          "Content-Type": "application/json"
        },
        body: JSON.stringify({
          browser: browser.toLowerCase(),
          fileName: file,
          mode: mode.toLowerCase()
        })
      });

      const reader = response.body.getReader();
      const decoder = new TextDecoder("utf-8");

      while (true) {

        const { done, value } = await reader.read();
        if (done) break;

        const text = decoder.decode(value);
        const lines = text.split("\n");

        lines.forEach((line) => {

          if (line.trim() !== "") {

            setLogs(prev => [...prev, line]);

            setSteps(prev => {

              const newSteps = prev + 1;

              const percent = Math.min(
                  Math.floor((newSteps / TOTAL_ESTIMATED_STEPS) * 100),
                  95
              );

              setProgress(percent);

              return newSteps;

            });

          }

        });

      }

      setProgress(100);
      setLoading(false);

      // 🔥 Move + rename report
      await saveReport();

      // 🔥 Enable View Report button
      setReportReady(true);

    } catch (error) {

      setLogs(prev => [...prev, "❌ Execution Failed"]);
      setLoading(false);

    }

  };

  const saveReport = async () => {

    try {

      const response = await fetch("http://localhost:8081/api/report/save", {
        method: "POST"
      });

      const data = await response.text();

      console.log("Report saved:", data);

    } catch (error) {

      console.error("Error saving report:", error);

    }

  };

  return (

      <BrowserRouter>

        <Routes>

          <Route
              path="/"
              element={
                <AutomationDashboard
                    environment={environment}
                    setEnvironment={setEnvironment}

                    browser={browser}
                    setBrowser={setBrowser}

                    mode={mode}
                    setMode={setMode}

                    file={file}
                    setFile={setFile}

                    buildFiles={buildFiles}

                    logs={logs}

                    loading={loading}

                    reportReady={reportReady}

                    progress={progress}

                    steps={steps}

                    onExecute={runTest}
                />
              }
          />

          <Route
              path="/reports"
              element={<ViewReports />}
          />

        </Routes>

      </BrowserRouter>

  );

}

export default App;