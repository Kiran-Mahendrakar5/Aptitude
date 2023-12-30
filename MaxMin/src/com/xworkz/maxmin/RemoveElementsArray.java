package com.xworkz.maxmin;

import java.util.Arrays;

public class RemoveElementsArray {
	
	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5};
		int remove = 3;
		
		int [] array1 = removeArray(array , remove);
		
		System.out.println("originalArray="+Arrays.toString(array));
		System.out.println("New Array ="+Arrays.toString(array1));

	}
	
	public static int[] removeArray(int[]ref1,int ref2) {
		int [] array1 = new int[ref1.length-1];
		int index=0;
		for(int i=0;i<ref1.length;i++) {
			if(ref1[i]!=ref2) {
				array1[index]=ref1[i];
				index++;
				
			}
		}
		return array1;
		
	}

	

}
