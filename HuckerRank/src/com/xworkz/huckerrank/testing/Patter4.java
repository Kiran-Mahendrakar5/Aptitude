package com.xworkz.huckerrank.testing;

public class Patter4 {
	
	public static void main(String[] args) {
		
		int row =5;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=(row-i)*2;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
