package com.xworkz.updatemyself.binary;

public class BinarySearch {

	public static void main(String[] args) {

		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int target = 5;

		int result = binarySeach(num, target);
		System.out.println(result);
	}

	public static int binarySeach(int[] num, int target) {

		int low = 0;
		int high = num.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (num[mid] == target) {
				return mid;
			}
			if (num[mid] > target) {
				high = mid - 1;
			}
		}
		return -1;
	}
}
