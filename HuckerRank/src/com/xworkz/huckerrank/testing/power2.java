package com.xworkz.huckerrank.testing;

import java.util.Scanner;

public class power2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number :--");
		int num = scanner.nextInt();
		int result = 1;
		for(int i=0;i<num;i++) {
			result*=2;
		}
		System.out.println(num +"="+result);
	}

}
