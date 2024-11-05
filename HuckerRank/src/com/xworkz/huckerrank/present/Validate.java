package com.xworkz.huckerrank.present;

public class Validate {
	
	
	public static void main(String[] args) {
		
		Long num = 9090909090l;
		
		int count =0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
		if(count==10) {
			System.out.println("correct");
		}else {
			System.out.println("wrong");
		}
		
	}

}
