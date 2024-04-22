package com.xworkz.maps;

import java.util.HashMap;
import java.util.Map;

public class Hash {
    public static void main(String[] args) {
       
        Map<String, Integer> map = new HashMap<>();

        
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);
        map.put(null, 5);

      
//        System.out.println("Alice's age: " + map.get("Alice"));

       
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + "'s age is " + entry.getValue());
//        }
        
        for(String key :map.keySet()) {
        	System.out.println(key);
        }
        for(Integer value :map.values()) {
        	System.out.println(value);
        }

       
        String name = "Alice";
        if (map.containsKey(name)) {
            System.out.println(name + "'s age is " + map.get(name));
        } else {
            System.out.println(name + " not found in the map.");
        }

       
        map.remove("Bob");
        System.out.println("Bob's information removed.");

       
        System.out.println("Size of the map: " + map.size());

      
        map.clear();
        System.out.println("Map cleared. Size: " + map.size());
    }
}
