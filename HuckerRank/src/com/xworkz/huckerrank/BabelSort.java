package com.xworkz.huckerrank;

public class BabelSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // Get the length of the array
        for (int i = 0; i < n - 1; i++) { // Outer loop
            for (int j = 0; j < n - i - 1; j++) { // Inner loop
                if (arr[j] > arr[j + 1]) { // Compare adjacent elements
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90}; // Example array
        System.out.println("Unsorted array:");
        for (int i : arr) { // Print unsorted array
            System.out.print(i + " ");
        }
        System.out.println();

        bubbleSort(arr); // Call bubble sort

        System.out.println("Sorted array:");
        for (int i : arr) { // Print sorted array
            System.out.print(i + " ");
        }
    }
}

