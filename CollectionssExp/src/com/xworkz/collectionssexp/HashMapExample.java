package com.xworkz.collectionssexp;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {

		Map<String, Integer> hashMap = new HashMap<>();

		hashMap.put("Apple", 10);
		hashMap.put("Banana", 20);
		hashMap.put("Cherry", 30);
		hashMap.put("Date", 40);
//		hashMap.put("Apple", 50); // Replaces the previous value for the key "Apple"

//		System.out.println("HashMap: " + hashMap);
		
		  hashMap.entrySet().stream()
          .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
  
//
//
//		for (String key : hashMap.keySet()) {
//			System.out.println(key);
//		}
//		for (Integer value : hashMap.values()) {
//			System.out.println(value);
//		}
//		
//		
//
//		System.out.println("Value for key 'Banana': " + hashMap.get("Banana"));
//		System.out.println("Value for key 'Grape': " + hashMap.get("Grape")); // Returns null
//
//		System.out.println("Contains key 'Cherry': " + hashMap.containsKey("Cherry"));
//
//		System.out.println("Contains value 30: " + hashMap.containsValue(30));
//
//		System.out.println("Size of HashMap: " + hashMap.size());
//
//		hashMap.remove("Cherry");
//		System.out.println("HashMap after removing key 'Cherry': " + hashMap);
//
//		hashMap.clear();
//		System.out.println("HashMap after clearing: " + hashMap);
//
//		System.out.println("Is HashMap empty? " + hashMap.isEmpty());
	}
}
