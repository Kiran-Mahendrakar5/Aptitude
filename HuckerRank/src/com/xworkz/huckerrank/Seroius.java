package com.xworkz.huckerrank;

import java.util.Scanner;

public class Seroius {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:---");
        String word = scanner.nextLine();
        
        // Count total characters (including spaces)
        int counted = word.length();
        System.out.println("Total characters (including spaces): " + counted);

        // Remove spaces manually (without using StringBuilder)
        char[] noSpaces = new char[word.length()];
        int index = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                noSpaces[index] = word.charAt(i);  // Add non-space characters to the new array
                index++;
            }
        }

        // Create the result string from the character array
        String wordWithoutSpaces = "";
        for (int i = 0; i < index; i++) {
            wordWithoutSpaces += noSpaces[i];  // Manually concatenate characters
        }

        // Print the modified string without spaces
        System.out.println("String without spaces: " + wordWithoutSpaces);

        // Print the number of characters after removing spaces
        System.out.println("Total characters (without spaces): " + wordWithoutSpaces.length());

        scanner.close();  // Close the scanner
    }
}
