package com.xworkz.collectionssexp;

import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        // Original array
        String[] originalArray = {"John", "Doe", "Alice"};

        
        String[] newArray = new String[originalArray.length + 1];

       
        System.arraycopy(originalArray, 0, newArray, 0, originalArray.length);

    
        newArray[newArray.length - 1] = "kiran";

        
        System.out.println("New array: " + Arrays.toString(newArray));
    }
}
