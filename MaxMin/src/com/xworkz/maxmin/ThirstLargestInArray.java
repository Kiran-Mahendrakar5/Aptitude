package com.xworkz.maxmin;

public class ThirstLargestInArray {
	public static void main(String[] args) {
		int[] numbers = { 10, 5, 8, 20, 15 };
		int thirdLargest = findThirdLargest(numbers);
		System.out.println("The third largest number is: " + thirdLargest);
	}

	public static int findThirdLargest(int[] arr) {
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > firstLargest) {
				thirdLargest = secondLargest;
				secondLargest = firstLargest;
				firstLargest = num;
			} else if (num > secondLargest) {
				thirdLargest = secondLargest;
				secondLargest = num;
			} else if (num > thirdLargest) {
				thirdLargest = num;
			}
		}

		return thirdLargest;
	}
}
