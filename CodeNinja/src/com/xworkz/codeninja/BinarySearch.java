package com.xworkz.codeninja;

public class BinarySearch {
    public int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        BinarySearch searcher = new BinarySearch();

        // Example usage
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 6;
        int result = searcher.binarySearch(num, target);

        System.out.println("Index of " + target + ": " + result);
    }
}

