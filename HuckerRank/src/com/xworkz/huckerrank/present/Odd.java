package com.xworkz.huckerrank.present;

import java.util.Scanner;

public class Odd {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int number = scanner.nextInt();
		int result = oddNumberCount(number);
		System.out.println("Sum of odd digits: " + result);
		
		scanner.close();
	}
	
	public static int oddNumberCount(int num) {
		int sum = 0;
		while(num != 0) {
			int digit = num % 10;  // Get the last digit
			if(digit % 2 != 0) {   // Check if the digit is odd
				sum += digit;
			}
			num /= 10;  // Remove the last digit
		}
		return num;
	}

}
