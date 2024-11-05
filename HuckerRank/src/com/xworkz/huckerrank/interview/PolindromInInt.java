package com.xworkz.huckerrank.interview;

import java.util.Scanner;

public class PolindromInInt {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number:---");
		int number = scanner.nextInt();
		if (isPolidrom(number)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static boolean isPolidrom(int num) {
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
