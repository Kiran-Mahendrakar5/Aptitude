package com.xworkz.maxmin;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("please enter phone number:");

		String phonenumber = scanner.nextLine();
		
		if(validat(phonenumber)) {
			System.out.println("thanku");
		}else {
			System.out.println("please enter correct number");
		}

	}

	private static boolean validat(String phonenumber) {
	String clean = 	phonenumber.replaceAll("\\D", "");
		return clean.length()==10;
	}
}
