package com.xworkz.huckerrank.testing;

public class NumberReverse {

	public static void main(String[] args) {

		int num = 123;
		int reverse = 0;
		while (num > 0) {
			int modulas = num % 10;
			reverse = reverse * 10 + modulas;
			num= num/=10;
		}
		System.out.println(reverse);
	}

}
