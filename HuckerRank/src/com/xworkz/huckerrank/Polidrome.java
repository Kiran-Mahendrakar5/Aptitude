package com.xworkz.huckerrank;

import java.util.Scanner;

public class Polidrome {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word");
		String word = scanner.nextLine();
		if(polidrom(word)) {
			System.out.println("yes");
		}else {
			System.out.println("wrong");
		}

	}
	public static boolean polidrom(String word) {
	int length =	word.length();
		for(int i=0;i<length/2;i++) {
			if(word.charAt(i)!=word.charAt(length-i-1)) {
				return false;
			}
		}
		return true;
	}

}
