package com.xworkz.huckerrank.present;

import java.util.Scanner;

public class Polidrome {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter String:---");
		
	String word =	scanner.nextLine();
	
	if(isPolidrom(word)) {
		System.out.println("coorect");
	}else {
		System.out.println("no");
	}
	scanner.close();
		
	}
	public static boolean isPolidrom(String word) {
	int length=	word.length();
	for(int i=0;i<length/2;i++) {
		if(word.charAt(i)!=word.charAt(length-i-1)) {
			return false;
		}
	}
	return true;
	}
	
	

}
