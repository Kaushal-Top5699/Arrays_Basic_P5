package com.kaushaltop;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = new int[5];

        for (int i=0; i<myArray.length; i++) {

            System.out.println("Enter "+i+" elements: ");

            myArray[i] = scanner.nextInt();

        }

        MyMethods.getArrayEleMidValue(myArray);
    }
}
