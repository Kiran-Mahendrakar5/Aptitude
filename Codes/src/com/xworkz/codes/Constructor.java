package com.xworkz.codes;

public class Constructor {
	
	int no;
	String name;
	
	public Constructor(int no,String name) {
		this.no=no;
		this.name=name;
		
	}
	public static void main(String[] args) {
		Constructor ref = new Constructor(10,"kiran");
		System.out.println(ref.no);
		System.out.println(ref.name);
	}


}
