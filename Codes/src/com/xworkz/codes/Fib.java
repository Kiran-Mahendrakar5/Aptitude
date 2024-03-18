package com.xworkz.codes;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter num");

		int num = scanner.nextInt();
		System.out.println("fibseq:");
		printfib(num);
		scanner.close();
	}

	public static void printfib(int num) {
		int f = 0, s = 1;
		for (int i = 0; i < num; i++) {

			int t = f + s;
			s = t;

		}
	}

}
