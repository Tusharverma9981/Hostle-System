package com.example.demo.util;

public class FileUploadUtil {

    public static boolean isValidImage(String fileName) {
        if (fileName == null) {
            return false;
        }

        String name = fileName.toLowerCase();
        return name.endsWith(".jpg")
                || name.endsWith(".jpeg")
                || name.endsWith(".png");
    }
}
