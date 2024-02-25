package com.example.museai;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class User {

    private String name;
    private String username;
    private String password;

    // Default constructor
    public User() {
        this.name = "";
        this.username = "";
        this.password = "";
    }

    // Parameterized constructor
    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    // Copy constructor
    public User(User user) {
        this.name = user.name;
        this.username = user.username;
        this.password = user.password;
    }

    // Get methods
    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Set methods
    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // Read JSON file and map to User object
            User user = mapper.readValue(new File("test.json"), User.class);
            System.out.println("Name: " + user.getName());
            System.out.println("Username: " + user.getUsername());
            System.out.println("Password: " + user.getPassword());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}