package com.xworkz.collectionssexp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listt {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Fig");
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Date");
		list.add("Fig");

		Iterator<String> ite = list.iterator();
		while (ite.hasNext()) {
			String whi = ite.next();
			System.out.println(whi);
		}

//        for(String ref:list) {
//        	System.out.println(ref);
//        }

//		System.out.println("List: " + list);
//
//		System.out.println("Element at index 2: " + list.get(2));
//
//		System.out.println("Contains 'Banana': " + list.contains("Banana"));
//
//		System.out.println("Size of list: " + list.size());
//
//		list.remove("Cherry");
//		System.out.println("List after removing 'Cherry': " + list);
//
//		list.remove(0);
//		System.out.println("List after removing element at index 0: " + list);
//
//		list.clear();
//		System.out.println("List after clearing: " + list);
//
//		System.out.println("Is list empty? " + list.isEmpty());
	}
}
