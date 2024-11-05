package com.xworkz.huckerrank.rajajinagar;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the input number

        // Call the method to check if the number is a perfect square
        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }

        scanner.close(); // Close the scanner
    }

    // Method to check if a number is a perfect square
    public static boolean isPerfectSquare(int num) {
        if (num < 0) return false; // Negative numbers are not perfect squares
        
        // Initialize a variable to check for the square
        int count = 0;

        // Loop until i^2 is less than or equal to num
        while (count * count <= num) {
            if (count * count == num) {
                return true; // Return true if a perfect square is found
            }
            count++; // Increment i
        }

        return false; // Return false if no perfect square is found
    }
} 


