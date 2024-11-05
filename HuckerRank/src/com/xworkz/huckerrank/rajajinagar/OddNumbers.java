package com.xworkz.huckerrank.rajajinagar;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number:");

		int number = scanner.nextInt();
		int result = odd(number);
		System.out.println("Sum of odd digits: " + result);

		scanner.close();
	}

	public static int odd(int num) {
		int count = 0;
		while (num != 0) {
			int modulas = num % 10;
			if (modulas % 2 != 0) {
				count += modulas;
			}
			num /= 10;
		}
		return num;
	}

}
