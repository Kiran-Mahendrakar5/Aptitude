package com.xworkz.codeninja;

public class ReverseInteger {
	public int reverse(int reverse) {
		int result = 0;

		while (reverse != 0) {
			// Extract the last digit
			int digit = reverse % 10;
			reverse /= 10;

			// Update the result by appending the current digit
			result = result * 10 + digit;
		}

		return result;
	}

	public static void main(String[] args) {
		ReverseInteger reverseIntegerSolver = new ReverseInteger();

		// Example usage
		int num1 = 123;
		int num2 = -123;
		int num3 = 120;

		System.out.println(reverseIntegerSolver.reverse(num1));
		System.out.println(reverseIntegerSolver.reverse(num2));
		System.out.println(reverseIntegerSolver.reverse(num3));
	}
}
