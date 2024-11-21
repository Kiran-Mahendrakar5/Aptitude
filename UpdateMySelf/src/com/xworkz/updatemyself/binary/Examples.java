package com.xworkz.updatemyself.binary;

public class Examples {

    // Instance variable
    int instanceVar = 10;

    // Static variable
    static int staticVar = 20;

    // Instance method
    void instanceMethod() {
        System.out.println("Instance method called");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method called");
    }

    // Static block
    static {
        // Attempting to access instance variables and methods (This will cause an error)
        // System.out.println(instanceVar);  // Error: Cannot make a static reference to the non-static field instanceVar
        // instanceMethod();  // Error: Cannot make a static reference to the non-static method instanceMethod() from the type Example

        // Correct way: Access static variables and methods
        System.out.println("Static variables: " + staticVar);
        staticMethod();  // Static method can be called
    }

    public static void main(String[] args) {
        // Creating an object to call the instance method
        Examples obj = new Examples();
        System.out.println("Instance variable: " + obj.instanceVar);  // Accessing instance variable via object
        obj.instanceMethod();  // Calling instance method via object
    }
}

