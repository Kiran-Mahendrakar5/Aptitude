package com.xworkz.huckerrank.practice;

public class SubString {
	
	public static String sunString(String name,int start,int end) {
		
		String count = "";
		for(int i=start;i<end;i++) {
		count+=	name.charAt(i);
		
		}
		return count;
	}
	public static void main(String[] args) {
		
	String result =	sunString("kiranmahendrakar", 0, 5);
	System.out.println(result);
	}

}
