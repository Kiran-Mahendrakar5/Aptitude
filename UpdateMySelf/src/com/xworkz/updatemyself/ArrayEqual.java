package com.xworkz.updatemyself;

public class ArrayEqual {

	public static void main(String[] args) {

		int one[] = { 1, 2, 3, 4, 5 };
		int two[] = { 1, 2, 3, 4, 5 };
		
	boolean result = isEqual(one, two);
		System.out.println(result);

	}

public static boolean isEqual(int[] one,int [] two) {
	for(int i=0;i<one.length;i++) {
		if(one.length!=two.length) {
		}else if (one[i]!=two[i]) {
			return false;
		}
		}
	return true;
}
}


