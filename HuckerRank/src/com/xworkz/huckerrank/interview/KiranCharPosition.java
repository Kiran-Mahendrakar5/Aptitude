package com.xworkz.huckerrank.interview;

import java.util.Scanner;

public class KiranCharPosition {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String:--");
		String word = scanner.nextLine();
		System.out.println("Enter Digit:-");
		char digit = scanner.next().charAt(0);
		boolean found = false;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == digit) {
				System.out.println("'" + digit + "'foundposition" + (i + 1));
				found = true;

			}

		}

	}

}
