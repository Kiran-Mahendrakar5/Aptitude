package com.xworkz.huckerrank.interview;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = sc.nextInt();
		int result =1;
		for(int i=0;i<number;i++) {
			result*=2;
		}
		System.out.println(number+"="+result);
	}
}
