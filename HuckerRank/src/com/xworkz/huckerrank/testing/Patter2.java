package com.xworkz.huckerrank.testing;

public class Patter2 {
	
	public static void main(String[] args) {
		
		int row =5;
		for(int i=row;i>0;i--) {
			for(int j=0;j<=row-i;j++) {
				System.out.print(" ");
			}
				for(int k=0;k<(2*i-1);k++) {
					System.out.print("*");
				}
				System.out.println();
			}

	
		
	}

}


