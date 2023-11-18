package com.xworkz.maxmin;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {
	
	public static void main(String[] args) {
		
		String input="programming";
		printduplicatecharcter(input);
	}

	private static void printduplicatecharcter(String input) {
		for(int i=0;i<input.length();i++) {
		char currentchar = 	input.charAt(i);
		
		if(currentchar !='\0') {
			int count=1;
			
			for(int j=i+1;j<input.length();j++) {
				if(currentchar==input.charAt(j)) {
					count ++;
				}
			}
			if (count > 1) {
                System.out.println(currentchar + " - " + count + " times");
            }
		}
		}
		
	}

	
}
