package com.xworkz.huckerrank.interview;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = scanner.nextInt();
		if(perfectSquare(number)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
	public static boolean perfectSquare(int num) {
		if(num<0) {
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
