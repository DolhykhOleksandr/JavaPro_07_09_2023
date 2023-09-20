package ua.hillel.dolhykh.homeworks.homework7.variant2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static final String LOG_FILE_NAME = "log.txt";

    // Метод для запису лог-повідомлення з вказаним префіксом в файл
    public static void log(String level, String message) {
        try (FileWriter writer = new FileWriter(LOG_FILE_NAME, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(level + ": " + message);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для читання всіх лог-повідомлень з файлу
    public static List<String> readLogs() {
        List<String> logs = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                logs.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return logs;
    }

    // Метод для виведення лог-повідомлень заданого рівня
    public static void printLogsByLevel(String logLevel) {
        List<String> logs = readLogs();
        for (String log : logs) {
            if (log.startsWith(logLevel)) {
                System.out.println(log);
            }
        }
    }

    public static void main(String[] args) {
        // Записуємо лог-повідомлення
        log("INFO", "Starting JuniorCrudServiceApplication using Java 17.0.7");
        log("DEBUG", "User admin created");

        // Виводимо всі лог-повідомлення
        List<String> allLogs = readLogs();
        for (String log : allLogs) {
            System.out.println(log);
        }

        // Виводимо лог-повідомлення заданого рівня (наприклад, INFO)
        System.out.println("INFO логи:");
        printLogsByLevel("INFO");

        // Виводимо лог-повідомлення заданого рівня (наприклад, DEBUG)
        System.out.println("DEBUG логи:");
        printLogsByLevel("DEBUG");
    }
}
