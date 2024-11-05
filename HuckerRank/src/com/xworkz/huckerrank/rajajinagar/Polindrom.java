package com.xworkz.huckerrank.rajajinagar;

import java.util.Scanner;

public class Polindrom {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name:--");

		String word = scanner.nextLine();
		if(polindrom(word)) {
			System.out.println("Correct");
		}else {
			System.out.println("NO");
		}
		scanner.close();

	}
	public static boolean polindrom(String word) {
	int length =	word.length();
	for(int i=0;i<length/2;i++) {
		if(word.charAt(i)!=word.charAt(length-1-i)) {
			return false;
		}
		
	}
	return true;
	}
	

}
