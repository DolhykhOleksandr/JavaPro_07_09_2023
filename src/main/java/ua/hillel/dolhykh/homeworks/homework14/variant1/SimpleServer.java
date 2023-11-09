package ua.hillel.dolhykh.homeworks.homework14.variant1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8081)) {
            System.out.println("Server is running. Waiting for client connection...");

            // Wait for a client to connect
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");

            // Get input and output streams for communication with the client
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Server generates its own greeting
            String serverGreeting = "Hello from the Server!";
            out.println(serverGreeting);

            // Receive client's greeting
            String clientGreeting = in.readLine();
            System.out.println("Client greeted: " + clientGreeting);

            // Check for Russian letters in the client's greeting
            if (containsSpecificRussianLetters(clientGreeting)) {
                out.println("What is palyanytsia? Or Що таке паляниця?");

                // Receive client's answer
                String clientAnswer = in.readLine();

                // Check the correctness of the answer
                if (clientAnswer.equalsIgnoreCase("a type of ukrainian bread") || clientAnswer.equalsIgnoreCase("Різновид українського хліба")) {
                    // Send the current date and time
                    String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    out.println("Current date and time: " + dateTime + ". Goodbye!");

                    // Say goodbye and close the connection
                    System.out.println("Automatic farewell sent.");
                    clientSocket.close();
                } else {
                    // Disconnect the client
                    out.println("Incorrect answer RUSSIAN PIG. Disconnecting.");
                    System.out.println("Client disconnected due to incorrect answer.");
                    clientSocket.close();
                }
            } else {
                // Send the current date and time
                String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                out.println("Current date and time: " + dateTime + ". Goodbye!");
                System.out.println("Automatic farewell sent.");
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to check for the presence of Russian letters in the text
    private static boolean containsSpecificRussianLetters(String text) {
        return text.matches(".*[эЭёЁыЫъЪ].*");
    }
}
