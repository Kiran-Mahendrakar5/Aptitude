package com.xworkz.huckerrank;

import java.util.Scanner;

public class TalentQuest {
	
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for user input
	        
	        System.out.print("Enter a 10-digit phone number: ");
	        String numb = scanner.nextLine();  // Read user input
	        
	        boolean isValid = validate(numb);  // Validate the input
	        
	        // Print the validation result
	        System.out.println("Validation result: " + isValid);
	        
	        scanner.close();  // Close the scanner
	    }

    public static boolean validate(String num) {
        if (num.matches("\\d{10}")) {
            System.out.println("Correct");
            return true;
        } else {
            System.out.println("Wrong");
            return false;
        }
    }

}
