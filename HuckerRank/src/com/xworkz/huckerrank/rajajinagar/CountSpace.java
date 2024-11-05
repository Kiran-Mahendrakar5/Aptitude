package com.xworkz.huckerrank.rajajinagar;

import java.util.Scanner;

public class CountSpace {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word:");
		String word = scanner.nextLine();

		scanner.close();

		String name = "";
		int spaceCount = 0; //1
		for (int i = 0; i < word.length(); i++) {
			name += word.charAt(i);
			if (i == 4) { 
				name += " ";
				spaceCount++; //2
			}
		}
		


		// Output the modified word and the space count
		System.out.println("Modified word: " + name);
		System.out.println("Number of spaces: " + spaceCount);
	}

}
