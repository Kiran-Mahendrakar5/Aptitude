package com.xworkz.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class LinkedHashMapp {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding key-value pairs
        linkedHashMap.put("key1", 1);
        linkedHashMap.put("key2", 2);
        linkedHashMap.put("key3", 3);
        linkedHashMap.put(null, 4); // Adding a null key

        // Iterating over the entries
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Additional methods
        // containsKey
        System.out.println("Contains key 'key2': " + linkedHashMap.containsKey("key2"));
        
        // containsValue
        System.out.println("Contains value 3: " + linkedHashMap.containsValue(3));
        
        // size
        System.out.println("Size of the map: " + linkedHashMap.size());
        
        // isEmpty
        System.out.println("Is the map empty? " + linkedHashMap.isEmpty());
        
        // keySet
        Set<String> keySet = linkedHashMap.keySet();
        System.out.println("Key set: " + keySet);
        
        // values
        Collection<Integer> values = linkedHashMap.values();
        System.out.println("Values: " + values);
        
        // remove
        linkedHashMap.remove("key1");
        System.out.println("After removing 'key1': " + linkedHashMap);
        
        // clear
        linkedHashMap.clear();
        System.out.println("After clearing the map: " + linkedHashMap);
    }
}

