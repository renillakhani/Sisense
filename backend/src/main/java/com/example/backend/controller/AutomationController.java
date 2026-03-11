package com.example.backend.controller;

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

    String automationProjectPath = "D:/IDE/Sisense/Sisense-main";

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

                while ((line = reader.readLine()) != null) {

                    emitter.send("LOG:" + line + "\n");

                    // Detect total tests
                    if (line.contains("Total tests run:")) {

                        String number = line.replaceAll("[^0-9]", "");
                        totalTests = Integer.parseInt(number);

                        emitter.send("TOTAL:" + totalTests + "\n");
                    }

                    // Detect test result
                    if (line.contains("PASSED") ||
                            line.contains("FAILED") ||
                            line.contains("SKIPPED")) {

                        executedTests++;

                        if (totalTests > 0) {

                            int progress =
                                    (int) (((double) executedTests / totalTests) * 100);

                            emitter.send("PROGRESS:" + progress + "\n");
                        }
                    }
                }

                process.waitFor();

                emitter.send("PROGRESS:100\n");
                emitter.send("COMPLETE\n");

                emitter.complete();

            } catch (Exception e) {

                try {
                    emitter.send("LOG:ERROR:" + e.getMessage());
                } catch (Exception ignored) {}

                emitter.completeWithError(e);
            }

        }).start();

        return emitter;
    }

    // Report endpoint
    @GetMapping(value="/report", produces = MediaType.TEXT_HTML_VALUE)
    public FileSystemResource getReport() {

        File report = new File(
                automationProjectPath + "/Sisense Automation Report.html"
        );

        return new FileSystemResource(report);
    }
}