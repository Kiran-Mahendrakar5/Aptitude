package com.xworkz.huckerrank.example;

public class Child extends Parent{
	
	@Override
    public void money() {
        System.out.println("Child has its  money.");
        
	
        super.gold();
      
       
    }



    public static void main(String[] args) {
        // Create an object of the Child class
        Child child = new Child();

        // Call the money() method of the Child class
        child.money();
//        child.gold();
    }
}
