package com.xworkz.huckerrank;

import java.util.Arrays;

public class SortArray {
	
	
	public static void main(String[] args) {
		
		String [] fruits = {"Apple","Dragon","PineApple","Banana"};
		Arrays.sort(fruits,String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(fruits));
		
		int[] num = {3,5,6,9,1,2};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
	}

}
