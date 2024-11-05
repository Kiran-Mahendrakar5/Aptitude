 package com.xworkz.huckerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import sun.applet.Main;

public class Occurance {

	public static void occurance(int[] num) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer fr : num) {
			if (map.containsKey(fr)) {
				map.put(fr, map.get(fr) + 1);
			} else {
				map.put(fr, 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}
	
	public static void main(String[] args) {
		
		int [] num = {1,1,1,2,3,4,5,6,8};
		occurance(num);
	}

//1:3
//2:4		

}
