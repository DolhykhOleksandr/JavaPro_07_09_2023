package ua.hillel.dolhykh.homeworks.homework10.variant1;

import java.util.*;


public class FileNavigator {

    private Map<String, List<FileData>> Mapp;

    public FileNavigator() {
        this.Mapp = new HashMap<>();
    }

    public void add(FileData fileData) {
        if (!Mapp.containsKey(fileData.getFilePath())) {
            List<FileData> list = new ArrayList<>();
            list.add(fileData);
            Mapp.put(fileData.getFilePath(), list);
        } else {
            List<FileData> list = Mapp.get(fileData.getFilePath());
            list.add(fileData);
        }
    }

    public List<String> find(String path) {
        List<String> fileList = new ArrayList<>();
        if (Mapp.containsKey(path)) {
            List<FileData> files = Mapp.get(path);
            for (FileData file : files) {
                fileList.add(file.getFileName());
            }
        }
        return fileList;
    }

    public List<String> filterBySize(long size) {
        List<String> fileList = new ArrayList<>();
        for (Map.Entry<String, List<FileData>> entry : Mapp.entrySet()) {
            List<FileData> files = entry.getValue();
            for (FileData file : files) {
                if (file.getFileSize() <= size) {
                    fileList.add(file.getFileName());
                }
            }
        }
        return fileList;
    }


    public String remove(String path) {
        Iterator<Map.Entry<String, List<FileData>>> iterator = Mapp.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<FileData>> entry = iterator.next();
            if (Objects.equals(entry.getKey(), path)) {
                iterator.remove();
                return path;
            }
        }
        return "Не має такого шляху";
    }

}