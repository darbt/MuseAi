package com.example.museai;

import java.util.Scanner;

public class SignUpApplication {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        UserDatabase userDatabase = new UserDatabase();

        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        System.out.println("Confirm your password:");
        String verifiedpassword = scanner.nextLine();

        if (verifiedpassword.equals(password)) {

        }
        else
            System.out.println("Re-enter the password.");

    }
}

