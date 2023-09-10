package com.xworkz.secondlargestarray;

public class Practice {
	
	public static void main(String[] args) {
		
		int array[] = {153,7676,387698,1};
		int secondLargestValue=0;
		int largestValue=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>largestValue) {
				largestValue=array[i];
			}else {
				if(array[i]>secondLargestValue) {
					secondLargestValue=array[i];
				}
			}
		}
//		System.out.println(secondLargestValue);
		System.out.println(largestValue);
	}

}
