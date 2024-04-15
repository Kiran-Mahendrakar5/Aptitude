package com.xworkz.collectionssexp;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        // Create a Hashtable with String keys and Integer values
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Add elements to the Hashtable
        hashtable.put("apple", 10);
        hashtable.put("banana", 20);
        hashtable.put("orange", 30);

        // Retrieve and print the elements of the Hashtable
//        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }
        
//        for(Map.Entry<String, Integer> ref :hashtable.entrySet()){
//        	System.out.println("key:"+ref.getKey()+"value:"+ref.getValue());
//        
//        }                                         
        	
        	for(Integer value:hashtable.values()) {
        		System.out.println(value);
        	}
        	for(String keys:hashtable.keySet()) {
        		System.out.println(keys);
        	}
        

//        // Update the value associated with the key "apple"
        hashtable.put("apple", 15);
//
//        // Remove the element with the key "banana"
//        hashtable.remove("banana");
//
//        // Check if the Hashtable contains a key
//        boolean containsKey = hashtable.containsKey("orange");
//        System.out.println("Contains key 'orange': " + containsKey);
//
//        // Check if the Hashtable contains a value
//        boolean containsValue = hashtable.containsValue(20);
//        System.out.println("Contains value 20: " + containsValue);
//
//        // Get the size of the Hashtable
//        int size = hashtable.size();
//        System.out.println("Size of Hashtable: " + size);
        
        for(Integer value:hashtable.values()) {
    		System.out.println(value);
    	}
    	for(String keys:hashtable.keySet()) {
    		System.out.println(keys);
    	}
    }
}

