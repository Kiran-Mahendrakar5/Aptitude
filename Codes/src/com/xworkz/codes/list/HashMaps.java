package com.xworkz.codes.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {
        
        Map<Integer, String> map = new HashMap<>();
        
        // Now you can use the HashMap object 'map'
        // For example:
        map.put(1, "Kiran");
        map.put(2, "Kishan");
        
        System.out.println(map);
        
        for(String value: map.values()) {
            System.out.println(value);
        }
        for(Integer key :map.keySet()) {
        	System.out.println(key);
        }
        
        int search = 3;
       if( map.containsKey(search)) {
    	   System.out.println(search);
       }else {
    	   System.out.println("not ");
       }
       String remove = "Kishan";
       map.remove(remove);
       System.out.println(remove);
       
       map.forEach((key, value) -> {
           System.out.println("Key: " + key + ", Value: " + value);});
    }
}
