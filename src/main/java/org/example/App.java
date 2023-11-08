package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        User user = new User( " Galyna ", " Gaponova ");

        ObjectMapper om = new ObjectMapper();
        System.out.println("JSON ==> " + om.writeValueAsString(user));
    }
}