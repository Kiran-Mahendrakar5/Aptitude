package com.xworkz.updatemyself;

import java.util.HashSet;

public class FindDuplicate {

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 1, 2 };
        findDuplicate(num);
    }

    public static void findDuplicate(int[] num) {
    	
    	HashSet<Integer> set = new HashSet<Integer>();
    	HashSet<Integer> duplicate = new HashSet<Integer>();
    	
    	for(int fr:num) {
    		if(!set.add(fr)) {
    			duplicate.add(fr);
    		}
    	}
    	System.out.println(duplicate);
    	
    }
     
}
