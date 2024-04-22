package com.xworkz.maps;

import java.util.Hashtable;
import java.util.Map;

public class HashTab {

	public static void main(String[] args) {

		Map<String, Integer> ht = new Hashtable<>();

		ht.put("Kiran", 1);
		ht.put("Kishan", 2);
		ht.put("Deepak", 3);
		ht.put("Arun", 4);
		ht.put(null, 5);

		for (Map.Entry<String, Integer> ref : ht.entrySet()) {

			System.out.println(ref.getKey() + " values " + ref.getValue());

		}

		String name = "Arun";
		if (ht.containsKey(name)) {
			System.out.println(ht.get(name));
		} else {
			System.out.println("name not found");
		}

		Integer name1 = 4;
		if (ht.containsValue(name1)) {
			for (String key : ht.keySet()) {
				if (ht.get(key).equals(name1)) {
					System.out.println("Key for value " + name1 + " is: " + key);
					break;
				}
			}
		} else {
			System.out.println("Value not found");
		}
		
		

	}

}
