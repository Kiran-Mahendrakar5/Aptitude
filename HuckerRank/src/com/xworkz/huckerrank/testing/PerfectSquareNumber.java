package com.xworkz.huckerrank.testing;

import java.util.Scanner;

public class PerfectSquareNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = scanner.nextInt();
		if (perfect(number)) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}
	}

	public static boolean perfect(int num) {
		if (num < 0) {
			return false;
		}
		int count =0;
		while(count*count<=num) {
			if(count*count==num) {
				return true;
			}
			count++;
		}
		return false;
	}

}
