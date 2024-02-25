package com.example.museai;
import java.io.*;
import java.util.*;

public class UserAuthentication {
    private static final String FILENAME = "users.csv";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user if they want to sign up or log in
        System.out.println("Welcome to User Authentication System!");
        System.out.println("1. Sign up");
        System.out.println("2. Log in");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                signUp();
                break;
            case 2:
                logIn();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                main(args); // Restart the program
                break;
        }
    }

    private static void signUp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a username:");
        String username = scanner.nextLine();
        System.out.println("Enter a password:");
        String password = scanner.nextLine();

        try (FileWriter fw = new FileWriter(FILENAME, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(username + "," + password);
            System.out.println("User signed up successfully!");
        } catch (IOException e) {
            System.out.println("Error occurred while signing up.");
            e.printStackTrace();
        }
    }

    private static void logIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(new File(FILENAME))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
                    System.out.println("Login successful!");
                    return;
                }
            }
            System.out.println("Invalid username or password.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            e.printStackTrace();
        }
    }
}