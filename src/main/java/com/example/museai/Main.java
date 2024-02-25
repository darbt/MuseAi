package com.example.museai;
import java.util.Scanner;
import java.io.FileReader;

//import org.json.simple.JSONObject;
//import org.json.simple.JSONArray;
//import org.json.simple.parser.ParseException;
//import org.json.simple.parser.JSONParser;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Muse! Please enter your details to log in");

        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Username: ");
        String username = scanner.nextLine();

        System.out.println("Password: ");
        String password = scanner.nextLine();




        // User object with entered details
        //User user = new User(name, username, password);

        // Display user's information
        //System.out.println("\nThank you! Here are your login details:");
        //System.out.println("First Name: " + user.getName());
        //System.out.println("Username: " + user.getUsername());
        //System.out.println("Password: " + user.getPassword());

        //close scanner
        scanner.close();

    }

}
