package com.xworkz.huckerrank.morning;

import java.util.Scanner;

public class KiranPoistion {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("EnterName:--");
		String name = scanner.nextLine();
		System.out.println("Enter Position:-");
		char digit = scanner.next().charAt(0);
		boolean isPosition = false;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==digit) {
				System.out.println(""+digit+"Position"+i+1);
			}
		}
	}

}
