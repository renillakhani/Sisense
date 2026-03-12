package com.example.backend.controller;

import com.example.backend.config.ProjectPaths;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

import java.io.*;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class AutomationController {

    private final String automationProjectPath;

    public AutomationController() {

        automationProjectPath = ProjectPaths.sisenseMain();
        System.out.println("Resolved Automation Path: " + automationProjectPath);

    }

    @PostMapping("/run")
    public ResponseBodyEmitter runSuite(@RequestBody Map<String, String> request) {

        ResponseBodyEmitter emitter = new ResponseBodyEmitter(0L);

        new Thread(() -> {

            try {

                String fileName = request.get("fileName");
                String browser = request.get("browser");
                String mode = request.get("mode");

                if (!fileName.endsWith(".xml")) {
                    fileName += ".xml";
                }

                boolean headless = !"headed".equalsIgnoreCase(mode);

                ProcessBuilder builder = new ProcessBuilder(
                        "cmd.exe",
                        "/c",
                        "mvn clean test " +
                                "-Dsurefire.suiteXmlFiles=Build/" + fileName +
                                " -Dbrowser=" + browser +
                                " -Dheadless=" + headless
                );

                builder.directory(new File(automationProjectPath));
                builder.redirectErrorStream(true);

                Process process = builder.start();

                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(process.getInputStream()));

                String line;

                int totalTests = 0;
                int executedTests = 0;
                boolean totalCaptured = false;

                while ((line = reader.readLine()) != null) {

                    emitter.send("LOG:" + line + "\n");

    /* ----------------------------------
       Capture total test count ONCE
    ---------------------------------- */
                    if (!totalCaptured && line.contains("Tests run:")) {

                        try {

                            String[] parts = line.split(",");
                            totalTests = Integer.parseInt(parts[0].replaceAll("[^0-9]", ""));

                            totalCaptured = true;

                            emitter.send("TOTAL:" + totalTests + "\n");

                        } catch (Exception ignored) {}

                    }

    /* ----------------------------------
       Count only REAL test results
    ---------------------------------- */
                    if (line.matches(".*\\b(PASSED|FAILED|SKIPPED)\\b.*") &&
                            !line.contains("Configuration") &&
                            !line.contains("Time elapsed") &&
                            !line.contains("Tests run:")) {

                        executedTests++;

                        if (totalTests > 0) {

                            int progress = (int) ((executedTests * 100.0) / totalTests);

                            if (progress > 100) {
                                progress = 100;
                            }

                            emitter.send("PROGRESS:" + progress + "\n");
                            emitter.send("STEPS:" + executedTests + "\n");
                        }
                    }
                }

                process.waitFor();

                // ensure progress completes
                emitter.send("PROGRESS:100\n");

                // notify frontend execution finished
                emitter.send("COMPLETE\n");

                emitter.complete();

            } catch (Exception e) {

                try {
                    emitter.send("LOG:ERROR: " + e.getMessage() + "\n");
                } catch (Exception ignored) {}

                emitter.completeWithError(e);
            }

        }).start();

        return emitter;
    }

    /* =====================================
       VIEW AUTOMATION REPORT
    ===================================== */

    @GetMapping(value = "/report", produces = MediaType.TEXT_HTML_VALUE)
    public FileSystemResource getReport() {

        return new FileSystemResource(ProjectPaths.mainReport());
    }
}