package com.xworkz.codes;

import java.time.LocalDate;
import java.time.LocalTime;

public class RemoveSpace {
    
    public static void main(String[] args) {
        
        String name = "Kiran mahendrakar";
        
        String word = remove(name);
        
        System.out.println(word);
        
     LocalDate date =    LocalDate.now();
     System.out.println(date);
     
     LocalTime time =     LocalTime.now();
     System.out.println(time);
    }
        
    public static String remove(String ref) {
        return ref.replaceAll("\\s", "");
    }
}
