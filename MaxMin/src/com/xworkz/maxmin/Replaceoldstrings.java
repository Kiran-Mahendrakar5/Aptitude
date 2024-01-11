package com.xworkz.maxmin;

import java.util.Scanner;

public class Replaceoldstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the original string:");
        String originalString = scanner.nextLine();

        System.out.println("Enter the substring to be replaced:");
        String oldSubstring = scanner.nextLine();

        System.out.println("Enter the new substring:");
        String newSubstring = scanner.nextLine();

        // Replace occurrences of oldSubstring with newSubstring
        String modifiedString = originalString.replace(oldSubstring, newSubstring);

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }
}

