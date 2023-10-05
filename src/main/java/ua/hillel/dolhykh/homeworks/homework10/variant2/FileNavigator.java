package ua.hillel.dolhykh.homeworks.homework10.variant2;

import java.util.*;

public class FileNavigator {
    private Map<String, List<FileData>> files = new HashMap<>();

    public void add(FileData file, String targetPath) {
        if (!file.getPath().equals(targetPath)) {
            System.out.format("%s contains different path and cannot be added to the list\n", file.getName());
        } else {
            if (files.containsKey(targetPath)) {
                files.get(targetPath).add(file);
            } else {
                List<FileData> fileList = new ArrayList<>();
                fileList.add(file);
                files.put(targetPath, fileList);
            }
        }
    }

    public List<FileData> find(String path) {
        if (files.containsKey(path)) {
            return files.get(path);
        }
        return null;
    }

    public List<FileData> filterBySize(int limitValue) {
        List<FileData> filteredFiles = new ArrayList<>();
        for (List<FileData> filesValue : files.values()) {
            for (FileData file : filesValue) {
                if (file.getByteSize() <= limitValue) {
                    filteredFiles.add(file);
                }
            }
        }
        return filteredFiles;
    }

    public void remove(String path) {
        files.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> sortedFiles = new ArrayList<>();
        for (List<FileData> filesValue : files.values()) {
            for (FileData file : filesValue) {
                sortedFiles.add(file);
            }
        }

        Collections.sort(sortedFiles, new Comparator<FileData>() {
            @Override
            public int compare(FileData file1, FileData file2) {
                return file1.getByteSize() - file2.getByteSize();
            }
        });
        return sortedFiles;
    }
}