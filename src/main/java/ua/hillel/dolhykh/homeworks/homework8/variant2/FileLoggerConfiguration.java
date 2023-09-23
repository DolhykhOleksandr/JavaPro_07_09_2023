package ua.hillel.dolhykh.homeworks.homework8.variant2;

import java.io.*;

public class FileLoggerConfiguration {
    private static LoggingLevel level;
    private static String filePath;
    private static int size = 1;


    public FileLoggerConfiguration(LoggingLevel level, String filePat) {
        this.level = level;
        this.filePath = filePath;
    }


    public static LoggingLevel getLevel() {
        return level;
    }

    public String getFilePath() {
        return filePath;
    }

    public static String writeFile(String a) throws Exception {
        File file = new File("logger");
        PrintWriter printWriter = new PrintWriter("logger");

        if (size <= file.length()) throw new
                FileMaxSizeReachedException();
        printWriter.println(a);
        printWriter.close();
        return a;



    }
}