package com.xworkz.maxarray;

public class MaxNum {
	
	public static void main(String[] args) {
		
		int array[]= {78,3,9,52,6};
		int max =0;
		
		for (int i = 0; i < array.length; i++) {
			if(max<array[i]) {
				max=array[i];
				
			}
		}
		System.out.println(max);
	}

}
