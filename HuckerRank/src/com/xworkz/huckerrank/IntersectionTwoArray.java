package com.xworkz.huckerrank;

import java.util.ArrayList;
import java.util.List;

public class IntersectionTwoArray {

	public static void main(String[] args) {

		int[] one = { 1, 2, 3, 4, 5 };
		int[] two = { 1, 2, 3, 4, 5 };

		List<Integer> three = new ArrayList<Integer>();
		List<Integer> four = new ArrayList<Integer>();

		for (Integer fr : one) {
			three.add(fr);
		}

		for (Integer fr1 : two) {
			four.add(fr1);
		}

		three.retainAll(four);
	      
	      System.out.println("Intersection: " + three);

	}
}