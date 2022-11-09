package com.learn.slide4.custom;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter personal Id");
        String personalId = scanner.next();

        try {
            User user = new User(personalId);
            System.out.println("User has been created successfully");
        } catch (NotValidPersonalIdException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
