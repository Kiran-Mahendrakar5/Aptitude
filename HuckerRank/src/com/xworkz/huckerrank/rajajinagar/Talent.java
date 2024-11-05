package com.xworkz.huckerrank.rajajinagar;

import java.util.Scanner;

public class Talent {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number:==");
		String number = scanner.nextLine();
		String Result = validate(number);
		System.out.println(Result);
	}
	public static String validate(String number) {
		if(number.matches("\\d{10}")) {
			System.out.println("Correct");
		}else {
			System.out.println("Wrong");
		}
		return number;
		
	}

}
