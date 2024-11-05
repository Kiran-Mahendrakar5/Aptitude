package com.xworkz.huckerrank.morning;

public class Pattern4 {
	
	public static void main(String[] args) {
		
		int row=5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=(row-i)*2;k++) {
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
