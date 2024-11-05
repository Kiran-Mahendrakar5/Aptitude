package com.xworkz.huckerrank.rajajinagar;

public class ReverseString {

	public static void main(String[] args) {

		String name = "kiran";
		String reverse = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			reverse += name.charAt(i);
		}
		System.out.println(reverse);

	}

}
