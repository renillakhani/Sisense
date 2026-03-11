package com.example.backend.controller;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ReportController {

    private final String PROJECT_PATH = "D:/IDE/Sisense/Sisense-main";

    private final String MAIN_REPORT =
            PROJECT_PATH + "/Sisense Automation Report.html";

    private final String REPORTS_FOLDER =
            PROJECT_PATH + "/Reports";


    // 1. Check if report exists
    @GetMapping("/report/status")
    public Map<String, Object> reportStatus() {

        File file = new File(MAIN_REPORT);

        Map<String, Object> response = new HashMap<>();
        response.put("exists", file.exists());

        return response;
    }


    // 2. Move + rename report after execution
    @PostMapping("/report/save")
    public ResponseEntity<String> saveReport() {

        try {

            File reportFile = new File(MAIN_REPORT);

            if (!reportFile.exists()) {
                return ResponseEntity.ok("Report not found");
            }

            File reportsDir = new File(REPORTS_FOLDER);

            if (!reportsDir.exists()) {
                reportsDir.mkdirs();
            }

            String timeStamp = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss")
                    .format(new Date());

            String newFileName =
                    "Sisense_Automation_Report_" + timeStamp + ".html";

            File newFile =
                    new File(REPORTS_FOLDER + "/" + newFileName);

            Files.move(
                    reportFile.toPath(),
                    newFile.toPath(),
                    StandardCopyOption.REPLACE_EXISTING
            );

            return ResponseEntity.ok("Report saved: " + newFileName);

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().body("Error saving report");
        }
    }


    // 3. Get all reports
    @GetMapping("/reports")
    public ResponseEntity<List<String>> getAllReports() {

        File folder = new File(REPORTS_FOLDER);

        if (!folder.exists()) {
            return ResponseEntity.ok(new ArrayList<>());
        }

        File[] files = folder.listFiles((dir, name) -> name.endsWith(".html"));

        List<String> reportNames = new ArrayList<>();

        if (files != null) {
            for (File file : files) {
                reportNames.add(file.getName());
            }
        }

        // 🔥 Sort newest first
        reportNames.sort(Collections.reverseOrder());

        return ResponseEntity.ok(reportNames);
    }


    // 4. View report
    @GetMapping("/reports/view/{name}")
    public ResponseEntity<FileSystemResource> viewReport(
            @PathVariable String name) {

        File file = new File(REPORTS_FOLDER + "/" + name);

        if (!file.exists()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok()
                .header("Content-Type", "text/html")
                .body(new FileSystemResource(file));
    }


    // 5. Download report
    @GetMapping("/reports/download/{name}")
    public ResponseEntity<FileSystemResource> downloadReport(
            @PathVariable String name) {

        File file = new File(REPORTS_FOLDER + "/" + name);

        if (!file.exists()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok()
                .header("Content-Disposition",
                        "attachment; filename=\"" + file.getName() + "\"")
                .body(new FileSystemResource(file));
    }


    @GetMapping("/report/latest")
    public ResponseEntity<FileSystemResource> getLatestReport() {

        try {

            File reportsDir = new File(REPORTS_FOLDER);

            if (!reportsDir.exists()) {
                return ResponseEntity.notFound().build();
            }

            File[] reports = reportsDir.listFiles((dir, name) -> name.endsWith(".html"));

            if (reports == null || reports.length == 0) {
                return ResponseEntity.notFound().build();
            }

            // Find latest report
            File latestReport = reports[0];

            for (File file : reports) {
                if (file.lastModified() > latestReport.lastModified()) {
                    latestReport = file;
                }
            }

            return ResponseEntity.ok()
                    .header("Content-Type", "text/html")
                    .body(new FileSystemResource(latestReport));

        } catch (Exception e) {

            e.printStackTrace();
            return ResponseEntity.internalServerError().build();

        }
    }

}