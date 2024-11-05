package com.xworkz.huckerrank.testing;

import java.util.Scanner;

public class Polindrom {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String:--");
		int word = scanner.nextInt();
		if (polindrom(word)) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}
	}

	public static boolean polindrom(int num) {
		int number = num;
		int reverse = 0;

		while (num > 0) {
			int modulas = num % 10;
			reverse = reverse*10+modulas;
			num/=10;
		}
		return number==reverse;
	}

}
