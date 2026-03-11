package com.example.backend.controller;

import org.springframework.web.bind.annotation.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/reports-folder")
@CrossOrigin
public class ReportsFolderController {

    private final String REPORTS_FOLDER_PATH =
            "D:/IDE/Sisense/Sisense-main/Reports";

    // Fetch all files from Reports folder
    @GetMapping("/files")
    public List<String> getReportsFiles() {

        File folder = new File(REPORTS_FOLDER_PATH);
        List<String> reportFiles = new ArrayList<>();

        if (folder.exists() && folder.isDirectory()) {

            File[] files = folder.listFiles();

            if (files != null) {
                for (File file : files) {

                    if (file.isFile()) {
                        reportFiles.add(file.getName());
                    }

                }
            }
        }

        return reportFiles;
    }

}