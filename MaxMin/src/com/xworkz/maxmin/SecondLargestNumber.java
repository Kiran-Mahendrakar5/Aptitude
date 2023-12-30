package com.xworkz.maxmin;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 15};
        int secondLargest = findSecondLargest(numbers);
        System.out.println("The second largest number is: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
      
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
