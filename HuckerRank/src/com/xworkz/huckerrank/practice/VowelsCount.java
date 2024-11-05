package com.xworkz.huckerrank.practice;

import java.util.HashMap;
import java.util.Map;

public class VowelsCount {
	
	public static void vowelCount(String kiran) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char [] vowel  = {'a','i','o','e','u'};
		for(char fr:vowel) {
			map.put(fr, 0);
		}
		for(char frr:kiran.toCharArray()) {
			if(map.containsKey(frr)) {
				map.put(frr, map.get(frr)+1);
			}
		}
		
	       for(Map.Entry<Character, Integer> m:map.entrySet()) {
	    	   System.out.println(m.getKey()+":"+m.getValue());
	       }
	        
	}
	public static void main(String[] args) {
		
		vowelCount("Kiran");
	}

}
