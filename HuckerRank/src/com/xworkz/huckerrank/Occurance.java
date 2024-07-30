package com.xworkz.huckerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import sun.applet.Main;

public class Occurance {

	public static void occurance(int[] a) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int n : a) {
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
			} else {
				map.put(n, 1);
			}
		}
		for(Map.Entry<Integer, Integer> m:map.entrySet()) {
			System.out.println(m.getKey()+";"+m.getValue());
		}
	}
	public static void main(String[] args) {
		
		int [] num = {1,2,3,4,5,6,1,2,3,4};
		occurance(num);
	}

//1:3
//2:4		

}
