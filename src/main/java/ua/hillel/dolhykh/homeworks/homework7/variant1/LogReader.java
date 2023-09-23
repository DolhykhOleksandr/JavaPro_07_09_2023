package ua.hillel.dolhykh.homeworks.homework7.variant1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LogReader {
    private static final String LOG_FILE_PATH = "log.txt";

    public static void main(String[] args) {
        createEmptyLogFile();

        writeLogMessage("INFO", "Starting JuniorCrudServiceApplication using Java 17.0.7");
        writeLogMessage("DEBUG", "User admin created");

        List<String> logMessages = readLogMessages();

        displayLogMessagesByLevel(logMessages, "DEBUG");
        displayLogMessagesByLevel(logMessages, "INFO");
    }

    private static void createEmptyLogFile() {
        try {
            File logFile = new File(LOG_FILE_PATH);
            if (!logFile.exists()) {
                logFile.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeLogMessage(String level, String message) {
        try (FileWriter fileWriter = new FileWriter(LOG_FILE_PATH, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(level + ": " + message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readLogMessages() {
        List<String> logMessages = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(LOG_FILE_PATH))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                logMessages.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return logMessages;
    }

    private static void displayLogMessagesByLevel(List<String> logMessages, String logLevel) {
        System.out.println("Messages with log level " + logLevel + ":");
        for (String message : logMessages) {
            if (message.startsWith(logLevel + ":")) {
                System.out.println(message);
            }
        }
    }
}
