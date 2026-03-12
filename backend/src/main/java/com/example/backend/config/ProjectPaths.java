package com.example.backend.config;

import java.io.File;

public class ProjectPaths {

    private static String SISENSE_MAIN;

    static {

        File current = new File(System.getProperty("user.dir"));

        File sisenseMain = new File(current, "Sisense-main");

        if (!sisenseMain.exists()) {
            sisenseMain = new File(current.getParentFile(), "Sisense-main");
        }

        SISENSE_MAIN = sisenseMain.getAbsolutePath();

        System.out.println("Resolved Sisense-main Path: " + SISENSE_MAIN);
    }

    public static String sisenseMain() {
        return SISENSE_MAIN;
    }

    public static String buildFolder() {
        return SISENSE_MAIN + File.separator + "Build";
    }

    public static String reportsFolder() {
        return SISENSE_MAIN + File.separator + "Reports";
    }

    public static String mainReport() {
        return SISENSE_MAIN + File.separator + "Sisense Automation Report.html";
    }
}