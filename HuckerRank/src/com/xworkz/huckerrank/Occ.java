package com.xworkz.huckerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Occ {
	public static void occ(String a) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		String[] word = a.split(" ");
		for (String words : word) {
			String word1 = words.toLowerCase();
			if (map.containsKey(word1)) {
				map.put(word1, map.get(word1) + 1);
			} else {
				map.put(word1, 1);

			}
		}
		for(Map.Entry<String, Integer> Entry:map.entrySet()) {
			System.out.println(Entry.getKey()+":"+Entry.getValue());
		}
	}
	public static void main(String[] args) {
		occ("kiran kishan kiran mahen mahendrakar");
	}
}
