package com.xworkz.huckerrank;

import java.util.Scanner;

public class ArrayEqual {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String:--");
		String word = scanner.nextLine();
		String result = "";
		for(int i=0;i<word.length();i++){
			if(i!=0&&i==5) {
				result+=" ";
			}
			result+=word.charAt(i);
		}
		System.out.println(result);
		scanner.close();
	}
}
