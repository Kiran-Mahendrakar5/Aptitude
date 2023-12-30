package com.xworkz.maxmin;

import java.util.Scanner;

public class DuplicateCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        duplicateAlphabets(input);

        scanner.close();
    }

    private static void duplicateAlphabets(String input) {
        for (int i = 0; i < input.length(); i++) {
        	
            char currentChar = input.charAt(i);

           
            if (currentChar != ' ') {
                int count = 1;

                
                for (int j = i + 1; j < input.length(); j++) {
                    if (currentChar == input.charAt(j)) {
                        count++;

                    }
                }

               
                if (count > 1) {
                    System.out.println(currentChar + " - " + count + " times");
                }
            }
        }
    }
}
