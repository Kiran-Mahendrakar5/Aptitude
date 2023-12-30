package com.xworkz.maxmin;

import java.util.Scanner;

public class InputStreamToString {

    public static String convertToString() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder resultStringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            resultStringBuilder.append(scanner.nextLine()).append("\n");
        }
        return resultStringBuilder.toString();
    }

    public static void main(String[] args) {
        // Example: Convert System.in (standard input) to String
        try {
            String inputString = convertToString();
            System.out.println("Input as String:\n" + inputString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

