package com.xworkz.huckerrank;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(4);
		list.add(9);
		list.add(3);
		list.add(8);
		list.add(1);

		// Using lambda expression for sorting
//		Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
		Collections.sort(list, Integer::compareTo);

		// Alternatively, you can simply use method reference for natural ordering
		// Collections.sort(list, Integer::compareTo);

		for (Integer fr : list) {
			System.out.println(fr);
		}
	}
}
