package com.xworkz.collectionssexp.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<ResumeDto> list = new ArrayList<>();
		
		 List<String> branches1 = new ArrayList<>();
	        branches1.add("Chetana");
	        branches1.add("vidyaspoorthi");

	        List<String> branches2 = new ArrayList<>();
	        branches2.add("Trio");
	        branches2.add("Maharani");
	        
	        List<String> branches3 = new ArrayList<>();
	        branches3.add("Reva");
	        branches3.add("Raman");
	        
	        List<String> branches4 = new ArrayList<>();
	        branches4.add("presidency");
	        branches4.add("techno");

		ResumeDto dto = new ResumeDto("kiran", "kiran@gmail.com",branches1);
		ResumeDto dto1 = new ResumeDto("Akishan", "mahendrakar@gmail.com",branches2);
		ResumeDto dto2 = new ResumeDto("deepu", "deepu@gmail.com",branches3);
		ResumeDto dto3 = new ResumeDto("Ishu", "ishu@gmail.com",branches4);

		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		
		
	Comparator<ResumeDto>com = new Comparator<ResumeDto>() {

		@Override
		public int compare(ResumeDto arg0, ResumeDto arg1) {
			if(arg0.getBranches().size()<arg0.getBranches().size()) {
				return -1;
			 } else if (arg0.getBranches().size() > arg1.getBranches().size()) {
				 return 1;
			 }
			return 0;
		           
		}
	};
	
	Collections.sort(list,com);
//	Collections.sort(list);
	list.forEach((ref) -> {
		System.out.println(ref);
	});
	}

}
