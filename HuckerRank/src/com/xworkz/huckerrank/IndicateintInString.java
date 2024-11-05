package com.xworkz.huckerrank;

import java.util.Scanner;

public class IndicateintInString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String:--");

		String word = scanner.nextLine();
		System.out.println("Enter Index");

		int index = scanner.nextInt();

		if ((index) >= 1 && index < word.length()) {
			char charater = word.charAt(index);
			
			 System.out.println(charater);
		}else {
			System.out.println("Invalid");
		}
	}

}
