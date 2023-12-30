package com.xworkz.maxmin;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Get input string from the user
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Count the number of characters
        int characterCount = userInput.length();

        // Print the result
        System.out.println("The number of characters in the string is: " + characterCount);
    }
}

