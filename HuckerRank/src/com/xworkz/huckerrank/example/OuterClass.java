package com.xworkz.huckerrank.example;

public class OuterClass {
	  static int outerStaticVar = 50;

    // Static nested class
	  public static class InnerStaticClass {
        void display() {
            System.out.println("Outer static variable: " + outerStaticVar);
        }
    }



    public static void main(String[] args) {
        // Accessing static nested class
        OuterClass.InnerStaticClass innerObj = new OuterClass.InnerStaticClass();
        innerObj.display();
    }
}


