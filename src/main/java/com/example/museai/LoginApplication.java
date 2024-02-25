package com.example.museai;
import java.util.Scanner;
public class LoginApplication {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

UserDatabase userDatabase = new UserDatabase();

System.out.println("Enter your username:");
String username = scanner.nextLine();

System.out.println("Enter your password:");
        String password = scanner.nextLine();

    if (userDatabase.authenticate(username, password)){
        System.out.println("Welcome");
        }
    else
        System.out.println("Log in failed.");

    }
}


