package com.xworkz.updatemyself;

public class ThreeElementsRemoveing {
	
	public static void main(String[] args) {
		
		int num [] = {1,2,3,4,5};
		
		int count = 0;
		 System.out.print("[");
		for(int i=0;i<num.length;i++) {
			if(num[i]!=4 &&num[i]!=5) {
				num[count]=num[i];
				count++;
			}
		}
		for(int i=0;i<count;i++) {
			System.out.print(num[i]+" ");
		}
		 System.out.print("]");
	}

}
