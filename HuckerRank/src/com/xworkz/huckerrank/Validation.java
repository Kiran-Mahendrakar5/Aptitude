package com.xworkz.huckerrank;

import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		scanner.close();
		Long num = 9090909090L;
		
		
		int ref = 0;
		while(num>0) {
		num=num/10;
		ref++;
		}
		System.out.println(ref);
		if(ref>=10) {
			System.out.println("correct");
		}else {
			System.out.println("wrong");
		}
		
	}
	
}
