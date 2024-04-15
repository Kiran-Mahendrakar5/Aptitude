package com.xworkz.collectionssexp;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class ArrayListss {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Date");
		list.add("Fig");
		

		System.out.println("List: " + list);
		
//		List<String> retainList = new ArrayList<>();
//        retainList.add("Apple");
//        retainList.add("Date");
//        
//        list.retainAll(retainList);
//
//        System.out.println("List after retaining elements: " + list);
//
//		System.out.println("Element at index 2: " + list.get(2));
//
//		System.out.println("Contains 'Banana': " + list.contains("Banana"));
//
//		System.out.println("Size of list: " + list.size());
//
//		list.remove("Cherry");
//		System.out.println("List after removing 'Cherry': " + list);
////		
//		 System.out.println("Using Stream to print elements of the list:");
//	        list.stream().forEach(System.out::println);
//
//		list.remove(0);
//		System.out.println("List after removing element at index 0: " + list);
//
//		list.clear();
//		System.out.println("List after clearing: " + list);
//
//		System.out.println("Is list empty? " + list.isEmpty());
		
		
//		 System.out.println("Using Spliterator to print elements of the list:");
//	        Spliterator<String> spliterator = list.spliterator();
//	        spliterator.forEachRemaining(System.out::println);
//	
		
		
		
	}

}
