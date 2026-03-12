package com.example.backend.controller;

import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class BuildFileController {

    private final String buildPath;

    public BuildFileController() {

        String userDir = System.getProperty("user.dir");
       System.out.println("Backend running from: " + userDir);

        buildPath = userDir
                + File.separator + ".."
                + File.separator + "Sisense-main"
                + File.separator + "Build";

       System.out.println("Resolved Build Path: " + buildPath);
    }

    @GetMapping("/files")
    public List<String> getBuildFiles() {

        // Files that should NOT appear in frontend
        List<String> excludedFiles = List.of(
                "GraphQL.xml",
                "OrangeRecruitment.xml",
                "SOAPAPI.xml",
                "Users.xml"
        );

        File folder = new File(buildPath);

        if (!folder.exists() || !folder.isDirectory()) {
           System.out.println("Build folder not found: " + buildPath);
            return new ArrayList<>();
        }

        File[] files = folder.listFiles();

        if (files == null) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();

        // sort alphabetically
        Arrays.sort(files);

        for (File file : files) {

            String name = file.getName();

            if (file.isFile()
                    && name.endsWith(".xml")
                    && !excludedFiles.contains(name)) {

                // remove .xml before sending to frontend
                result.add(name.replace(".xml", ""));
            }
        }

        return result;
    }
}