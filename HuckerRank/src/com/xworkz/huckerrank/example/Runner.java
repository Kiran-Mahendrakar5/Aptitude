package com.xworkz.huckerrank.example;

public class Runner {

	public static void main(String[] args) {
        // Example of using invalid userPin
		
        try {
            Atm.withdrawMoney(8777, 8666);  // User provides an invalid pin here.
        } catch (InvalidUserPin e) {
            // Catching the exception and printing the error message.
            e.printStackTrace();
        }
    }
}
