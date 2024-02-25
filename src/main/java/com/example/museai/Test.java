package com.example.museai;

import java.io.IOException;

public class Test {
     public static void main(String[] args) throws IOException {

         Database d = new Database();
         System.out.println(d.readDatabase());

    }
}
