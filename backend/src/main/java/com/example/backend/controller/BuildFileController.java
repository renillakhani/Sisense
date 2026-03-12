package com.example.backend.controller;

import com.example.backend.config.ProjectPaths;
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

        buildPath = ProjectPaths.buildFolder();
    }

    @GetMapping("/files")
    public List<String> getBuildFiles() {

        List<String> excludedFiles = List.of(
                "GraphQL.xml",
                "OrangeRecruitment.xml",
                "SOAPAPI.xml",
                "Users.xml"
        );

        File folder = new File(buildPath);

        if (!folder.exists() || !folder.isDirectory()) {
            return new ArrayList<>();
        }

        File[] files = folder.listFiles();

        if (files == null) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();

        Arrays.sort(files);

        for (File file : files) {

            String name = file.getName();

            if (file.isFile()
                    && name.endsWith(".xml")
                    && !excludedFiles.contains(name)) {

                result.add(name.replace(".xml", ""));
            }
        }

        return result;
    }
}