package com.xworkz.codes;

import java.util.HashMap;
import java.util.Map;

public class Hshmap {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map =new  HashMap<Integer, String>();
		map.put(1, "kiran");
		map.put(2, "kishan");
		
		System.out.println(map);
		
		for(Integer key:map.keySet()) {
			System.out.println(key);
		}
		for(String value:map.values()) {
			System.out.println(value);
		}
		
		int replace =2;
		String Newname = "kishanmahendrakar";
		if(map.replace(replace, "kishan", Newname)) {
			System.out.println("succefully");
		}else {
			System.out.println("no");
		}
		System.out.println(map);

}
}
