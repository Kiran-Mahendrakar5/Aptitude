package com.xworkz.huckerrank.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Practice {

	public static void fruitss(String[] fruit) {

		

		System.out.println("==========================================");

		String temp = fruit[0];
		fruit[0] = fruit[1];
		fruit[1] = temp;

		System.out.println("hai"+Arrays.toString(fruit));

		

	}

	public static void main(String[] args) {// static method

//		String one = "kiran";
//		String two = "kishan";

//		String temp = one;
//		one = two;
//		two = temp;

//		System.out.println(one);

		String[] fruits = { "Apple", "pineapple", "mango", "banana" };
//		int[] fruits = { 1, 2, 3, 4 };   
		fruitss(fruits);

	}

}
