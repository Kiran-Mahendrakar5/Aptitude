package com.xworkz.updatemyself;

public class HideElement {
	
	public static void main(String[] args) {
		
		int num [] = {1,2,3,4,5};
		
		for(int i=0;i<num.length;i++) {
			if(num[i]!=3) {
				System.out.print(num[i]);
			}
		}
	}

}
