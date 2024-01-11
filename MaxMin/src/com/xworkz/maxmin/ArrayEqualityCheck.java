 package com.xworkz.maxmin;

public class ArrayEqualityCheck {

  public static boolean equal(int[] arr1,int[] arr2) {
	
	  for(int i=0;i<arr1.length;i++) {
		  if(arr1[i]!=arr2[i]) {
			  return false;
		  }
	  }
	  return true;
	  
  }
  public static void main(String[] args) {
	int [] array1 = {1,2,3,4,5};
	int [] array2 = {1,2,3,4,5};
	if(equal(array1, array2)) {
		System.out.println("Array is equal");
	}else {
		System.out.println("Array is not equal");
	}
}
}
