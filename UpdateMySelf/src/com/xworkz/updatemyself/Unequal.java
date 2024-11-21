package com.xworkz.updatemyself;

import java.util.ArrayList;

public class Unequal {
	
	public static void main(String[] args) {
		
		int one[] ={1,2,3,4,5};
		int two[] ={1,2,6,4,5};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<one.length;i++) {
			if(one[i]!=two[i]) {
				list.add(one[i]);
				list.add(two[i]);
				
			}
		}
		for(Integer ref:list) {
			System.out.println(ref);
		}
			
		
		
		
	}

}
