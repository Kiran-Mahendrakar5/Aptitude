package com.xworkz.updatemyself;

public class ReverseArray {

	public static void main(String[] args) {         

		int num[] = { 1, 2, 3, 4, 5 };

		int length = num.length;//5
		                            //0 < 2 (True)              //1 < 2 (True)                     2 < 2 (False)
		for(int i=0;i<length/2;i++) {//{5, 2, 3, 4, 1}          //{5, 4, 3, 2, 1}                       
			                 //num[0] = 1 and num[4] = 5        // num[1] = 2 and num[3] = 4   
			
			int all = num[i];  
			
			num[i]=num[length-i-1];
	//      num[0]=num[5-0-1]=4
	//      num[1]=num[5-1-1]=3
	//      2 < 2 (False)		
			num[length-i-1]=all;   
//			num[4] = all;  ->num[4] = 1
//			 ->12345<->54321   == 52341
//			num[3] = all;  ->num[3] = 2
//			->12345<->54321   == 54321
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]);
		}
	}
}
