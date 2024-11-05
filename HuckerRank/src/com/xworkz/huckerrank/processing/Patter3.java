package com.xworkz.huckerrank.processing;

public class Patter3 {
	public static void main(String[] args) {
		
		int row =5;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<(2*i-1);k++) {
				System.out.println("*");
			}
			System.out.println();
		}
	
	}

}
