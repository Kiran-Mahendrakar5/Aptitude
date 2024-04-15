package com.xworkz.collectionssexp;

import java.util.Hashtable;
import java.util.Map;

public class Hashtables {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Apple", 10);
        hashtable.put("Banana", 20);
        hashtable.put("Cherry", 30);
        hashtable.put("Date", 40);
//        hashtable.put(null, 50);
        
        System.out.println("Hashtable: " + hashtable);
        System.out.println("Value for key 'Banana': " + hashtable.get("Banana"));
        System.out.println("Value for key 'Grape': " + hashtable.get("Grape"));
        System.out.println("Contains key 'Cherry': " + hashtable.containsKey("Cherry"));
        System.out.println("Contains value 30: " + hashtable.containsValue(30));
        System.out.println("Size of Hashtable: " + hashtable.size());
        
        hashtable.remove("Cherry");
        System.out.println("Hashtable after removing key 'Cherry': " + hashtable);
        
        hashtable.clear();
        System.out.println("Hashtable after clearing: " + hashtable);
        
        System.out.println("Is Hashtable empty? " + hashtable.isEmpty());
    }
}
