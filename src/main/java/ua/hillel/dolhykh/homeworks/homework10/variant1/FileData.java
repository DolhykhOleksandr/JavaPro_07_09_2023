package ua.hillel.dolhykh.homeworks.homework10.variant1;

public class FileData implements Comparable<FileData> {
    private String fileName;
    private int fileSize;
    private String filePath;

    public FileData(String fileName, int fileSize, String filePath) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public String getFilePath() {
        return filePath;
    }


    @Override
    public int compareTo(FileData fd) {
        return this.getFileSize() - fd.getFileSize();
    }
}