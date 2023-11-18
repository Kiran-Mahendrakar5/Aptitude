package com.xworkz.maxmin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionTwoArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

    
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int num : array1) {
            list1.add(num);
        }

        for (int num : array2) {
            list2.add(num);
        }

        // Find the intersection of the two lists
        list1.retainAll(list2);

        // Convert the intersection back to an array
        int[] intersection = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            intersection[i] = list1.get(i);
        }

        // Print the intersection
        System.out.print("Intersection of the two arrays: ");
        System.out.println(Arrays.toString(intersection));
    }
}

