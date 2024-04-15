package com.xworkz.collectionssexp;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {
	
	public static void main(String[] args) {
		
		Map<Integer, String> ref = new LinkedHashMap<Integer, String>();
		ref.put(1, "kiran");
		ref.put(2, "kishan");
		ref.put(3, "deepu");
		ref.put(4, "Aishu");
		
		for(Map.Entry<Integer, String> ref1:ref.entrySet() ) {
			System.out.println("Keys"+ref1.getKey()+"values"+ref1.getValue());
		}
	System.out.println(ref.replace(1, "KiranM.S"));
	}

}
