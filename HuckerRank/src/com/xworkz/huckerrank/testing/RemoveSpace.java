package com.xworkz.huckerrank.testing;

public class RemoveSpace {
	
	public static void main(String[] args) {
		
		String name = "Kiran mahendrakar";
		String result = "";
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!=' ') {
				result+=name.charAt(i);
			}
		}
		System.out.println(result);
	}

}
