package com.xworkz.huckerrank.interview;

public class Removespace {

	public static void main(String[] args) {

		String name = "kiran mahendrakar";
		String result = "";

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != ' ') {
				result += name.charAt(i);
			}
			
		}
		System.out.println(result);
	}
}
