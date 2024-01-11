package com.xworkz.maxmin;

import java.util.Scanner;

public class InitialExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        String lastNameInitials = extractLastNameInitials(fullName);

        System.out.println("Last name initials are: " + lastNameInitials);

        scanner.close();
    }

    public static String extractLastNameInitials(String fullName) {
        String[] names = fullName.split("\\s+");

        // Assuming the last name is at the end of the full name
        if (names.length > 1) {
            String lastName = names[names.length - 1];
            return lastName.toUpperCase();
        }

        // Return an empty string if last name is not found
        return "";
    }
}
