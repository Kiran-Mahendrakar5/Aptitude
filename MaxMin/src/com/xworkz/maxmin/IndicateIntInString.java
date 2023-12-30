package com.xworkz.maxmin;

import java.util.Scanner;

public class IndicateIntInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        System.out.println("Enter the index to retrieve the character:");
        int index = scanner.nextInt();

        if (index >= 1 && index <= inputString.length()) {
            char character = inputString.charAt(index);
            System.out.println("Character at index " + index + ": " + character);
        } else {
            System.out.println("Invalid index. Please enter a valid index within the string length.");
        }

        scanner.close();
    }
}
