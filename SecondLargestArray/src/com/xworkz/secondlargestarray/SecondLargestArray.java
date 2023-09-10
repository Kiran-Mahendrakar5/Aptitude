package com.xworkz.secondlargestarray;

public class SecondLargestArray {

	public static void main(String[] args) {

		int array[] = { 2, 10, 6, 19, 77, 55, 12, 3, 95, 1 };
		int largestValue = 0;
		int secondLargestValue = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largestValue) {
				secondLargestValue = largestValue;
				largestValue = array[i];
				
				
			} else if (array[i] > secondLargestValue) {
				secondLargestValue = array[i];
			}
		}
		System.out.println(secondLargestValue);
		}

	

}
