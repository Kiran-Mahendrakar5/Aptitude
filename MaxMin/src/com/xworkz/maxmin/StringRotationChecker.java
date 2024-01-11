package com.xworkz.maxmin;

import java.util.Scanner;

public class StringRotationChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (areRotations(str1, str2)) {
            System.out.println("Yes, " + str2 + " is a rotation of " + str1);
        } else {
            System.out.println("No, " + str2 + " is not a rotation of " + str1);
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    public static boolean areRotations(String str1, String str2) {
        // Check if lengths of both strings are the same and not empty
        if (str1.length() != str2.length() || str1.isEmpty() || str2.isEmpty()) {
            return false;
        }

        // Concatenate str1 with itself
        String third = str1 + str1;

        // Check if str2 is a substring of the concatenated string
        return third.contains(str2);
    }
}

