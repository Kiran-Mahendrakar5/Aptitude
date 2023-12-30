package com.xworkz.maxmin;

import java.util.Arrays;
import java.util.Comparator;

public class Test4 {

    public static void main(String[] args) {
        String[] fruits = {"Grapes", "Apple", "banana"};

        Arrays.sort(fruits, String.CASE_INSENSITIVE_ORDER);

        System.out.println(Arrays.toString(fruits));
    }
}
