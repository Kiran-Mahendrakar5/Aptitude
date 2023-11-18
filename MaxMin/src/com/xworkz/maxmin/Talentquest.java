package com.xworkz.maxmin;

import java.util.Scanner;

public class Talentquest {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your phone number:");
	        String phoneNumber = scanner.nextLine();

	        if (isValidPhoneNumber(phoneNumber)) {
	            System.out.println("Thank you for providing a valid phone number.");
	        } else {
	            System.out.println("Please enter a 10-digit phone number.");
	        }

	        scanner.close();
	    }

	    public static boolean isValidPhoneNumber(String phoneNumber) {
	        // Remove non-digit characters from the input
	        String cleanedPhoneNumber = phoneNumber.replaceAll("\\D", "");

	        // Check if the cleaned number is exactly 10 digits
	        return cleanedPhoneNumber.length() == 10;
	    }
	}


