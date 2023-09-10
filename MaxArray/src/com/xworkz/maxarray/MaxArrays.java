package com.xworkz.maxarray;

public class MaxArrays {
	
	public static void main(String[] args) {
		
		int array[] = {22,4,6,8,9,10};
		int max=0;
		
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.println(max);
	}

}
