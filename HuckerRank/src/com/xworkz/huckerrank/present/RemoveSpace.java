package com.xworkz.huckerrank.present;

import java.util.Scanner;

public class RemoveSpace {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = scanner.nextLine();
        scanner.close();

        // Initialize a variable to store the result without spaces
        String result = "";                                        //same for adding

        // Loop through each character and skip spaces
        for (int i = 0; i < word.length(); i++) {                    //same for adding
//        	                                               if(i!=0&&i==5){
//        	                                                return +=" ";
            if (word.charAt(i) != ' ') {
                result += word.charAt(i);                             //same for adding
            }
        }

        // Print the result without spaces
        System.out.println(result);                                   //same for adding  
    }
}
