package com.xworkz.codes;

public class Mletter {
	
	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++){
			for(int j=0;j<=5;j++) {
				
				if(j==5 || j==1 ||(i==2 && (j==2||j==4))||(i==3&&j==3)) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

}
