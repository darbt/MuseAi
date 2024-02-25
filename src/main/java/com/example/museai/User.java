package com.example.museai;

public class User {
    private String name;
    private String username;
    private String password;

    public User (String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password  = password;

    }

    public String getname(){
        return name;
    }
    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }
}

