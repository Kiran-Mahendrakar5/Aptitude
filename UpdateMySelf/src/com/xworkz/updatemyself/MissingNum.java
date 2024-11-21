package com.xworkz.updatemyself;

public class MissingNum {
    
    public static void main(String[] args) {
    	
    	int num [] = {1,2,3,4,6,7};
    	
    	int target = 7;
    	
    	int formula = target*(target+1)/2;
    	
    	int count = 0;
    	
    	for(int i=0;i<num.length;i++) {
    		count+=num[i];
    	}
    	
    	int missing = formula-count;
    	System.out.println(missing);
        
    }
}

























//package com.xworkz.updatemyself;

//
//public class MissingNum {
//	
//	public static void main(String[] args) {
//		
//		int [] num = {1, 2, 4, 6, 3, 7, 8,9};
//		
//		int n=9;
//		
//		int formula = n * (n + 1) / 2;
////		int expectedSum = 8 * (8 + 1) / 2;  //90/2=45
//		
//		int count=0;
//		for(int i=0;i<num.length;i++) {
//			count+=num[i];
//		}
//		
//		int missing =formula-count;
//		System.out.println(missing);
//	}
//
//}
