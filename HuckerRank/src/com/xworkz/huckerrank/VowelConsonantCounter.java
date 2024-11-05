package com.xworkz.huckerrank;

import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine(); // Read input from user

        int vowels = 0;
        int consonants = 0;

        for (char ch : input.toCharArray()) {
            if (isVowel(ch)) {
                vowels++;
            } else if (isConsonant(ch)) {
                consonants++;
            }
        }

        System.out.println("In the word '" + input + "':");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        
        scanner.close(); // Close the scanner
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static boolean isConsonant(char ch) {
        return (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') && !isVowel(ch);
    }
}

