package com.xworkz.maxmin;
import java.util.Scanner;

public class OppositeLetter {
    public static String alternateCase(String input) {
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalStr = scanner.nextLine();

        String transformedStr = alternateCase(originalStr);
        System.out.println("Transformed String: " + transformedStr);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
