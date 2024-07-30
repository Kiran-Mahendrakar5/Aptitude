package com.xworkz.huckerrank;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number:--");
		int n = scanner.nextInt();
		System.out.println("Fibonacci Series up to " + n + " terms:");
		fibonacci(n);
		scanner.close();
	}

	public static void fibonacci(int n) {
		int firstTerm = 0, secondTerm = 1;
		for (int i = 0; i < n; i++) {
			System.out.println(firstTerm + " ");

			int nextterm = firstTerm + secondTerm;
			firstTerm = secondTerm;//1
			secondTerm = nextterm;//1

		}

	}

}
