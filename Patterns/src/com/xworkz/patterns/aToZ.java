package com.xworkz.patterns;

public class aToZ {

    public static void main(String[] args) {

        int n = 5;
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(ch + " ");
                if (ch < 'Z') {
                    ch++;
                } else {
                    ch = 'A';
                }
            }
            System.out.println();  // Move the println statement outside of the inner loop to print a newline after each row
        }
    }
}
