package com.learn.slide4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckAndUnchecked {

    public static void main(String[] args) throws FileNotFoundException {
        //Unchecked exception
        System.out.println("1");
        int x = 10 / 0;
        System.out.println("2");


        //Checked exception
        FileInputStream fileInputStream = new FileInputStream("afa");
    }
}
