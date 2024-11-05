package com.xworkz.huckerrank;

import java.util.Scanner;

public class LengthWord {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word");
		String words = scanner.nextLine();
		int result = words.length();
		System.out.println(result);

	}
}
