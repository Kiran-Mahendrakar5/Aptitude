package com.xworkz.huckerrank.morning;

import java.util.Scanner;

public class powe2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Nmber:--");

		int num = scanner.nextInt();
		int result = 1;
		for(int i=0;i<num;i++) {
			result*=2;//1*=2
			
		}
		System.out.println(result);
	}

}
