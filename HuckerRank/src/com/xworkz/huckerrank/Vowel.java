package com.xworkz.huckerrank;

public class Vowel {

   public static void main (String[] args) {
        stringContainVowels("kiran");
       
    }

    public static void stringContainVowels(String tv) {
        char[] alpha = {'a', 'e', 'i', 'o', 'u'};
       

        for (int i = 0; i < tv.length(); i++) {
            char ch = tv.charAt(i);
            for (int j = 0; j < alpha.length; j++) {
                if (ch == alpha[j]) {
                    System.out.println(ch+" ");
                    break;
                    
                }
            }
        }
		

    
    }
}
