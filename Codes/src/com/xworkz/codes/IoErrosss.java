package com.xworkz.codes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IoErrosss {
    public static void main(String[] args) {
        try {
            // Attempt to open a non-existent file
            BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));
            // Attempting to read from the file
            String line = reader.readLine();
            System.out.println("Line read from file: " + line);
            // Closing the reader
            reader.close();
        } catch (IOException e) {
            // Handle the IOException
            System.out.println("An IOException occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

