package com.xworkz.huckerrank.present;

import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word");
		String word = scanner.nextLine();
		int result = word.length();
		System.out.println(result);
		
		
		int spacecount = 0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==' ') {
				spacecount++;
			}
			
		}
		
		System.out.println(spacecount);
		scanner.close();

	}

}
