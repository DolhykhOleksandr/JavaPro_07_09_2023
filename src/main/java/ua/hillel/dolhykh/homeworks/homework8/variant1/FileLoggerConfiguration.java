package ua.hillel.dolhykh.homeworks.homework8.variant1;
public class FileLoggerConfiguration {


    private String fileName = "C:\\Users\\User\\IdeaProjects\\JavaPro_07_09_2023\\src\\main\\java\\ua\\hillel\\dolhykh\\homeworks\\homework8\\variant1\\log.txt";
    private LoggingLevel currentLoggingLevel = LoggingLevel.DEBUG;
    private double maxSizeByte = 5000;
    private String formatWrite = "[CURRENT_TIME][DEBUG] Massage: [STRING_MESSAGE]";

    public String getFileName() {
        return fileName;
    }

    public LoggingLevel getCurrentLoggingLevel() {
        return currentLoggingLevel;
    }

    public double getMaxSizeByte() {
        return maxSizeByte;
    }
}