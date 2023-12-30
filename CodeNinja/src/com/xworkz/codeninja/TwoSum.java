package com.xworkz.codeninja;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complement of each number and its index
        HashMap<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (complementMap.containsKey(complement)) {
                // Return the indices of the two numbers that add up to the target
                return new int[]{complementMap.get(complement), i};
            }

            // Put the current number and its index into the map
            complementMap.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum twoSumSolver = new TwoSum();

        // Example usage
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumSolver.twoSum(nums, target);

        System.out.print("Indices of the two numbers: ");
        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}

