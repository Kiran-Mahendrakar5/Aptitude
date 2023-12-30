package com.xworkz.codeninja;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > nums.length / 2) {
                return num;
            }
        }

        throw new IllegalArgumentException("No majority element found");
    }

    public static void main(String[] args) {
        MajorityElement finder = new MajorityElement();

        // Example usage
        int[] array = {3, 1,3,3,3, 4, 2};
        int majority = finder.majorityElement(array);

        System.out.println("Majority Element: " + majority);
    }
}

