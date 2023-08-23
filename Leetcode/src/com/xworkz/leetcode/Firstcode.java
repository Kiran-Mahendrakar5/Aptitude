package com.xworkz.leetcode;

public class Firstcode {

	public int firstcode(String f) {
		int len = 0;
		f = f.trim();
		for (int i = f.length() - 1; i >= 0; i--) {
			if (f.charAt(i) == ' ') {
				break;

			}else {
				len ++;
			}
		}
		return len;

	}
	public static void main(String[] args) {
		String input ="i am Kiran";
		Firstcode first = new Firstcode();
		System.out.println(" the length of last word is "+first.firstcode(input));first = new Firstcode();
	}

}
