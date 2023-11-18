package com.xworkz.maxmin;

public class NegativeElements {

    public static void E(int[] num) {
        int one = num.length;
        int two = 0;

        for (int i = 0; i < one; i++) {
            if (num[i] < 0) {
                // Swap the current element with the first non-negative element
                int ref = num[i];
                num[i] = num[two];
                num[two] = ref;
                two++;
            }
        }
    }

    public static void main(String[] args) {
        int[] number = {1, -2, 3, -4, 5, -6, 7, -8};
        E(number);


        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
        }
    
    }
}
