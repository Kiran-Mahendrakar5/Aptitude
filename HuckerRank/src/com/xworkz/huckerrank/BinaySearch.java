package com.xworkz.huckerrank;

public class BinaySearch {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int target = 5;

        int result = binarySearch(num, target);
        if (result == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;  // Target found
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                // If target is smaller, ignore the right half
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }
}
