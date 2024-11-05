package com.xworkz.huckerrank;

public class PowerEvaluator {
    public static void main(String[] args) {
        int base = 2; // hard-coded base value
        int exponent = 2; // hard-coded exponent value
        
        System.out.println(base + "^" + exponent + " = " + power(base, exponent));
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++)
            result *= base;
        return result;
    }
}
