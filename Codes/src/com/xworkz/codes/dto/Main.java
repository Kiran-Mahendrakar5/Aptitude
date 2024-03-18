package com.xworkz.codes.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		 List<Resume> list = new ArrayList<Resume>();
		 
		 Resume dto = new Resume("Kiran@gmail.com","kiran");
		 Resume dto1 = new Resume("Ashika@gmail.com","Ashika");
		 Resume dto2 = new Resume("Ramya@gmail.com","Ramya");
		 
		 list.add(dto);
		 list.add(dto1);
		 list.add(dto2);
		 
		 Comparator<Resume> cmr = new Comparator<Resume>() {

			@Override
			public int compare(Resume o1, Resume o2) {
				if(o1.getName().length()<o2.getName().length()) {
					return 1;
				}
				return -1;
			}
			 
		};
//		Collections.sort(list,cmr);
		 
		 Collections.sort(list);
		 list.forEach((ref)->{System.out.println(ref);});
	}
}
