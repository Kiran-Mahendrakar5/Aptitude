package com.xworkz.huckerrank.rajajinagar;

import java.util.Scanner;

public class NumberPosition {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		String number = scanner.nextLine();

		System.out.print("Enter the digit to find: ");
		char digit = scanner.next().charAt(0);

		boolean found = false;

		for (int i = 0; i < number.length(); i++) {
			if (number.charAt(i) == digit) {

				System.out.println("'" + digit + "' found at position: " + (i + 1));
				found = true;
			}
		}

		if (!found) {
			System.out.println("The digit '" + digit + "' is not present in the number.");
		}

		scanner.close();
	}
}
