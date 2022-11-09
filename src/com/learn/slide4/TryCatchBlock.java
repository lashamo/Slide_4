package com.learn.slide4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {

    public static void main(String[] args) {
        System.out.println("1");
        try {
            FileInputStream fileInputStream = new FileInputStream("test");
        } catch (FileNotFoundException | ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("2");

        try {
            int x = 10 / 0;
        } catch (NullPointerException ex) {
            System.out.println("Null");
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("3");

        try {
            int[] arr = new int[3];
            arr[3] = 10;
        } finally {
            System.out.println("4");
        }

        System.out.println("5");
    }
}
