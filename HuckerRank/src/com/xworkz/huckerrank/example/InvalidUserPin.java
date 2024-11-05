package com.xworkz.huckerrank.example;

public class InvalidUserPin extends Exception {
	
	public InvalidUserPin() {
        System.out.println("Default constructor");
    }
    
    public InvalidUserPin(String message) {
        super(message);
    }
}
