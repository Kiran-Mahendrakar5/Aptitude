package com.xworkz.maxmin;

import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase();

        int vowelCount = countOccurrences(inputString, "aeiou");
        int consonantCount = countOccurrences(inputString, "bcdfghjklmnpqrstvwxyz");

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    public static int countOccurrences(String ref1, String ref2) {
        int count = 0;
        for (char ch : ref1.toCharArray()) {
            if (ref2.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}
