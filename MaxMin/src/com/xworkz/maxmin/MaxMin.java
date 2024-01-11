package com.xworkz.maxmin;

public class MaxMin {

	public static void main(String[] args) {
		
		int[] arr= {1,3,5,7,9,8};
		 int ref1 = findmin(arr);
		 int ref2 = findmax(arr);
		
		 
		 System.out.println(ref1);
		 System.out.println(ref2);
	}

	private static int findmin(int[] arr) {
		int minmum = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<minmum) {
				minmum=arr[i];
				
				
			}
		}
		return minmum;
	}

	private static int findmax(int[] arr) {
		int maxmam = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>maxmam) {
				maxmam=arr[i];
				
			}
		}
		return maxmam;
	}
	}

		