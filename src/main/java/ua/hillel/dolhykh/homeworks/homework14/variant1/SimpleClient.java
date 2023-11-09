package ua.hillel.dolhykh.homeworks.homework14.variant1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8081)) {
            // Get input and output streams for communication with the server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Receive server's greeting
            String serverGreeting = in.readLine();
            System.out.println("Server greeted: " + serverGreeting);

            // Exchange greetings
            System.out.print("Your greeting: ");
            String clientGreeting = new Scanner(System.in).nextLine();
            out.println(clientGreeting);

            // Receive server's response
            String serverResponse = in.readLine();
            System.out.println("Server response: " + serverResponse);

            // If the server asks about "palyanytsia," provide the answer
            if (serverResponse.equals("What is palyanytsia? Or Що таке паляниця?")) {
                System.out.print("Your answer: ");
                String clientAnswer = new Scanner(System.in).nextLine();
                out.println(clientAnswer);

                // Receive the final response from the server
                String finalResponse = in.readLine();
                System.out.println("Server response: " + finalResponse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
