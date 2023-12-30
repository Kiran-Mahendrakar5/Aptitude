package com.xworkz.maxmin;

public class ProblemRotateArray {
	
	 public static void rotateArray(int[] nums, int k) {
	        int n = nums.length;
	        
	        // Calculate the effective rotation steps
	        k = k % n;
	        
	        // Create a new array to store the rotated elements
	        int[] rotatedArray = new int[n];
	        
	        // Copy the last k elements to the rotatedArray
	        System.arraycopy(nums, n - k, rotatedArray, 0, k);
	        
	        // Copy the remaining elements to the rotatedArray
	        System.arraycopy(nums, 0, rotatedArray, k, n - k);
	        
	        // Copy the rotatedArray back to the original array
	        System.arraycopy(rotatedArray, 0, nums, 0, n);
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 4, 5, 6, 7};
	        int k = 3;
	        
	        rotateArray(nums, k);
	        
	        // Print the rotated array
	        for (int num : nums) {
	            System.out.print(num + " ");
	        }
	        // Output: 5 6 7 1 2 3 4
	    }

}
