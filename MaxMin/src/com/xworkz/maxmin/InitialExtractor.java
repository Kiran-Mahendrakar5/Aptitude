package com.xworkz.maxmin;

import java.util.Scanner;

public class InitialExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        String initials = extractInitials(fullName);

        if (!initials.isEmpty()) {
            System.out.println("Your initials are: " + initials);
        } else {
            System.out.println("Invalid input. Please enter a valid full name.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    public static String extractInitials(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) {
            return ""; // Return an empty string for invalid input
        }

        // Split the full name into words
        String[] names = fullName.split("\\s+");

        // Extract the first character from each name component after the first one
        StringBuilder initials = new StringBuilder();
        for (int i = 1; i < names.length && i <= 2; i++) {
            if (!names[i].isEmpty()) {
                initials.append(names[i].charAt(0));
            }
        }

        return initials.toString();
    }
}
