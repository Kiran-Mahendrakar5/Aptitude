package com.xworkz.huckerrank.present;

import java.util.Scanner;

public class Phone {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number:==");

		String number = scanner.nextLine();

		isvalidate(number);
		scanner.close();
	}

	public static boolean isvalidate(String number) {
		
		if(number.matches("\\d{10}")) {
			System.out.println("Correct");
		}else {
			System.out.println("Wrong");
		}
		return true;

	}
}
