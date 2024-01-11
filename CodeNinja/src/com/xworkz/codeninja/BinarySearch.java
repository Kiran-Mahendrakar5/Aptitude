package com.xworkz.codeninja;

public class BinarySearch {
    public int binarySearch(int[] Binary, int Search) {
        int left = 0, right = Binary.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (Binary[mid] == Search) {
                return mid;
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
        int target = 5;
        int result = searcher.binarySearch(num, target);

        System.out.println("Index of " + target + ": " + result);
    }
}

