package com.xworkz.testtwo;

public class Intersection {
	
	public static void main(String[] args){
		int[] page1={12,56,88,99,31};
		int[] page2={33,66,89,98,12};
		
		
		for(int i=0; i<page1.length;i++)
		for(int j=0; j<page2.length;j++)
		if(page1[i]==page2[j]){
			System.out.println(page2[j]);
		}
		
		
	}

}
