package com.example.backend.controller;

import com.example.backend.config.ProjectPaths;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/reports-folder")
@CrossOrigin
public class ReportsFolderController {

    private final String REPORTS_FOLDER_PATH;

    public ReportsFolderController() {

<<<<<<< HEAD
        REPORTS_FOLDER_PATH = ProjectPaths.reportsFolder();
=======
        String userDir = System.getProperty("user.dir");
       System.out.println("Backend running from: " + userDir);

        REPORTS_FOLDER_PATH = userDir
                + File.separator + "Sisense-main"
                + File.separator + "Reports";

       System.out.println("Resolved Reports Folder Path: " + REPORTS_FOLDER_PATH);
>>>>>>> 2f29a81000843fc05ddf1b601b3f6ccdff51f99c
    }

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