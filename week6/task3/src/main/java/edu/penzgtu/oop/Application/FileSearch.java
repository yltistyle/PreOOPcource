package edu.penzgtu.oop.Application;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;

public class FileSearch {

    public static void main(String[] args) {
        System.out.println("Enter: path\\Enter\\string search");
        Scanner scan = new Scanner(System.in);
        String path = scan.next();


        File directory = new File(path);
        if (!directory.isDirectory()) {
            System.err.println("Error path");
            return;
        }
        String search = scan.next();
        searchFiles(directory, search);
    }

    public static void searchFiles(File directory, String searchQuery) {
        File[] files = directory.listFiles();
        if (files == null) {
            return;
        }
        for (File file : files) {
            if (file.isDirectory()) {
                searchFiles(file, searchQuery);
            } else {
                String fileName = file.getName();
                if (fileName.contains(searchQuery)) {
                    System.out.println("Searched: " + file.getAbsolutePath());
                } else {
                    try {
                        String fileContent = new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8);
                        if (fileContent.contains(searchQuery)) {
                            System.out.println("File by content: " + file.getAbsolutePath());
                        }
                    } catch (IOException e) {
                        System.err.println("File reading error: " + file.getAbsolutePath());
                    }
                }
            }
        }

    }
}

