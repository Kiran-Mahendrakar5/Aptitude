package com.xworkz.updatemyself;

public class RepaceArrayNumber {
	
	public static void main(String[] args) {
		
		int num[] = {1,2,3,4,5};
		
		for(int i=0;i<num.length;i++) {
			if(num[i]==3) { //  where //i==3
				num[i]=6;       //i=6
			}
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}

}
