package com.xworkz.secondlargestarray;

public class Second {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int secondLargestValue = 0;
		int largestValue = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > secondLargestValue) {
				secondLargestValue = largestValue;
				largestValue = array[i];
			} else {
				if (array[i] > largestValue) {
					secondLargestValue = array[i];
				}
			}
		}
		System.out.println(largestValue);
	}

}
