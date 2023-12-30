package com.xworkz.maxmin;

public class ReverseString {

	public static void main(String[] args) {

		String Str = "kiran";

		System.out.println(reverse(Str));
	}

	private static String reverse(String in) {
		StringBuilder out = new StringBuilder();
		char[] chars = in.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]);
		return out.toString();
	}
	
}
