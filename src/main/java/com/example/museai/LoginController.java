package com.example.museai;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


import java.io.*;
import java.util.Scanner;

public class LoginController {

    @FXML
    private TextField userTF;

    @FXML
    private TextField passTF;

    private static final String FILENAME = "users.csvs";

    public void handleLoginBtn(){
        checkUsers();
    }


    public void checkUsers() {
            String username = userTF.getText();
            String password = passTF.getText();

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
