package com.xworkz.maxmin;

public class ArrayEqualityCheck {

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        // Check if arrays are of the same length
        if (arr1.length != arr2.length) {
            return false;
        }

        // Compare each element at corresponding positions
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        if (areArraysEqual(array1, array2)) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}
