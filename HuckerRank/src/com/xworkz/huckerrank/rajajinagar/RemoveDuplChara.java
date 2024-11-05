package com.xworkz.huckerrank.rajajinagar;

import java.util.Scanner;

public class RemoveDuplChara {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word:==");
        String word = scanner.nextLine();
        scanner.close();

        String name = "";
        String charToRemove = "kiran hai hai"; 
        
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            
            if (charToRemove.indexOf(Character.toLowerCase(currentChar)) == -1) {
                name += currentChar; 
            }
        }

        System.out.println("Modified word: " + name);
    }
}
