package com.xworkz.huckerrank.present;

public class ArrayEqual {
	
	public static void main(String[] args) {
		
		int[] one = {1,2,3,4,5};
		int[] two = {1,2,3,4,5};
		
		boolean arequal=true;
		
		
			for(int i=0;i<one.length;i++) {
				if(one[i]!=two[i]) {
					arequal=false;
					break;
				}
			}
			System.out.println(arequal);
		}
		
	}

