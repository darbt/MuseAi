package com.example.museai;
import java.util.ArrayList;
import java.util.List;
public class UserDatabase {

    private List<User> users;

    public UserDatabase() {
        users = new ArrayList<>();
        users.add(new User("Neha", "neehaw", "123"));
    }

    public boolean authenticate(String userName, String password) {
        for (User user : users) {
            if (user.getUsername().equals(userName) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;

    }
}


