package com.xworkz.huckerrank;

import sun.applet.Main;

public class Factorial {

	public static void factorial(int start, int end) {
		for (int i = start; i <= end; i++) {
			start = start * i;

		}
		System.out.println(start);

	}
	public static void main(String[] args) {
		
		factorial(1, 5);
	}
	

}
