package com.xworkz.huckerrank.rajajinagar;

import java.util.Scanner;

public class polindromInt {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number:-");
		int number = scanner.nextInt();
		if (polindrom(number)) {
			System.out.println("correct");

		} else {
			System.out.println("NO");
		}

	}

	public static boolean polindrom(int num) {

		int original = num;
		int reverse = 0;

		while (num>0) {
			int modulas = num % 10;
			reverse = reverse * 10 + modulas;
			num/=10;
			
		}
		return original==reverse;
	}

}
