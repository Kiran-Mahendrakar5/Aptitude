package com.xworkz.codeninja;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
//        if (nums == null || nums.length == 0) {
//            return 0;
//        }

        int uniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                // Move the unique element to the next position
                nums[++uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicates remover = new RemoveDuplicates();

        // Example usage
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = remover.removeDuplicates(nums);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

