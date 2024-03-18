package com.xworkz.codes;

import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("EnterString");

		String words = scanner.nextLine();

		int counted = words.length();
		
		System.out.println(counted);
	}

}
