package com.xworkz.updatemyself;

public class FindLargestNumber {
	public static void main(String[] args) {

		int one[] = { 1, 2, 3, 4, 5 };
		int count = one[0];
		for (int i = 0; i < one.length; i++) {
			if (one[i] > count) {
				count = one[i];

			}

		}
		System.out.println(count);

	}
}
