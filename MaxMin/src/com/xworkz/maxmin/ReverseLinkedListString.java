package com.xworkz.maxmin;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseLinkedListString {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("kiran");
		list.add("kishan");
		list.add("deepu");

		System.out.println("Original String:" + list);

		ListIterator<String> iterator = list.listIterator(list.size());
		
		List<String> list1 = new ArrayList<String>();
		
		while(iterator.hasPrevious()) {
			list1.add(iterator.previous());
		}
		System.out.println("ReveseString:"+list1);

	}
}
