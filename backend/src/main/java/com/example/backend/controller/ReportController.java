package com.example.backend.controller;

import com.example.backend.config.ProjectPaths;
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

    private final String MAIN_REPORT;
    private final String REPORTS_FOLDER;

    public ReportController() {

        MAIN_REPORT = ProjectPaths.mainReport();
        REPORTS_FOLDER = ProjectPaths.reportsFolder();

    }

    @GetMapping("/report/status")
    public Map<String, Object> reportStatus() {

        File file = new File(MAIN_REPORT);

        Map<String, Object> response = new HashMap<>();
        response.put("exists", file.exists());

        return response;
    }

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

            String timeStamp =
                    new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss")
                            .format(new Date());

            String newFileName =
                    "Sisense_Automation_Report_" + timeStamp + ".html";

            File newFile =
                    new File(REPORTS_FOLDER + File.separator + newFileName);

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

    @GetMapping("/reports")
    public ResponseEntity<List<String>> getAllReports() {

        File folder = new File(REPORTS_FOLDER);

        File[] files =
                folder.listFiles((dir, name) -> name.endsWith(".html"));

        List<String> reportNames = new ArrayList<>();

        if (files != null) {
            for (File file : files) {
                reportNames.add(file.getName());
            }
        }

        reportNames.sort(Collections.reverseOrder());

        return ResponseEntity.ok(reportNames);
    }

    @GetMapping("/reports/view/{name}")
    public ResponseEntity<FileSystemResource> viewReport(@PathVariable String name) {

        File file = new File(REPORTS_FOLDER + File.separator + name);

        if (!file.exists()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok()
                .header("Content-Type", "text/html")
                .body(new FileSystemResource(file));
    }

    @GetMapping("/reports/download/{name}")
    public ResponseEntity<FileSystemResource> downloadReport(@PathVariable String name) {

        File file = new File(REPORTS_FOLDER + File.separator + name);

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

        File reportsDir = new File(REPORTS_FOLDER);

        File[] reports =
                reportsDir.listFiles((dir, name) -> name.endsWith(".html"));

        if (reports == null || reports.length == 0) {
            return ResponseEntity.notFound().build();
        }

        File latestReport = Arrays.stream(reports)
                .max(Comparator.comparingLong(File::lastModified))
                .orElse(null);

        return ResponseEntity.ok()
                .header("Content-Type", "text/html")
                .body(new FileSystemResource(latestReport));
    }
}