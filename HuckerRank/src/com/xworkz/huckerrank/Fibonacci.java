package com.xworkz.huckerrank;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Num ==");
		int num = scanner.nextInt();
		System.out.println(num);
		fib(num);
		scanner.close();

	}

	public static void fib(int num) {
		int first = 0, sec = 1;
		for (int i = 0; i <= num; i++) {
			System.out.println(first);
			int next = first + sec;
			first = sec;
			sec = next;
		}

	}
}
