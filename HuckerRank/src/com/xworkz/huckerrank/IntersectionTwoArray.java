package com.xworkz.huckerrank;

import java.util.ArrayList;
import java.util.List;

public class IntersectionTwoArray {
	
public static void main(String[] args) {
	
	  int[] array1 = {1, 2, 3, 4, 5};
      int[] array2 = {3, 4, 5, 6, 7};
      
      List<Integer> list1 = new ArrayList<>();
      List<Integer> list2 = new ArrayList<>();
      
      for(Integer ref1:array1) {
    	  list1.add(ref1);
    	  
      }
      for(Integer ref2:array2) {
    	  list2.add(ref2);
      }
      list1.retainAll(list2);
      
      
      System.out.println("Intersection: " + list1);
      
      
}	

}