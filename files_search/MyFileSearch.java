package com.alex.algorithms.files_search;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyFileSearch {
    public static void main(String[] args) {
        List<File> files = new ArrayList<>();
        filesSearch(new File("X:\\"), files, "txt");
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }

    }

    public static void filesSearch(File path, List<File> filesList, String fileType) {
        if (path.isDirectory()) {
            File[] dir = path.listFiles();
            if (dir != null) {
                for (File file : dir) {
                    if (file.isDirectory()) {
                        filesSearch(file, filesList, fileType);
                    } else {
                        if (file.getName().toLowerCase().endsWith(fileType)) {
                            filesList.add(file);
                        }
                    }
                }
            }
        }
    }

}
