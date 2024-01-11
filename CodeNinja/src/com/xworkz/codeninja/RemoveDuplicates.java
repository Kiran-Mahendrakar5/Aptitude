package com.xworkz.codeninja;

public class RemoveDuplicates {
    public int removeDuplicates(int[] Dup) {


        int zero = 0;

        for (int i = 1; i < Dup.length; i++) {
            if (Dup[i] != Dup[zero]) {
                // Move the unique element to the next position
            	Dup[++zero] = Dup[i];
            }
        }

        return zero + 1;
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

