package com.xworkz.huckerrank.example;

public class Atm {
    public static void withdrawMoney(long pin, int userPin) throws InvalidUserPin {
        // Check if the user pin matches the correct pin
        if (userPin == pin) {
            System.out.println("User pin is valid.");
        } else {
            // Throw an exception if the pin doesn't match
            throw new InvalidUserPin("User pin is not valid.");
        }
    }
}
