package com.xworkz.huckerrank.testing;

public class SpaceCount {
	
	public static void main(String[] args) {
		
		String name = "Kiran mahendrakar";
		int spaceCount = 0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==' ') {
				spaceCount++;
			}
		}
		System.out.println(spaceCount);
	}

}
