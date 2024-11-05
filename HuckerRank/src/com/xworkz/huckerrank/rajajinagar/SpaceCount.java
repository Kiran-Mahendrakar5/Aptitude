package com.xworkz.huckerrank.rajajinagar;

import java.util.Scanner;

public class SpaceCount {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word:");
		String word = scanner.nextLine();

		scanner.close();

		String name = "";
		for (int i = 0; i < word.length(); i++) {
			name += word.charAt(i);
			if(i==4) {
				name+=" ";
			}
		}
		System.out.println(name);
		
//		Enter word:
//			kiranmahendrakar
//			kiran mahendrakar
	}
}
