package com.xworkz.codeninja;

public class MergeSortedArrays {
	public void merge(int[] A, int[] B, int c, int D) {
		int M = c - 1, N = D - 1, e = c + D - 1;

		while (M >= 0 && N >= 0) {
			if (A[M] > B[N]) {
				A[e--] = A[M--];
			} else {
				A[e--] = B[N--];
			}
		}
	}

	public static void main(String[] args) {
		MergeSortedArrays merger = new MergeSortedArrays();

		// Example usage
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		int m = 3, n = 3;

		merger.merge(nums1, nums2, m, n);

		for (int num : nums1) {
			System.out.print(num + " ");
		}
	}
}
