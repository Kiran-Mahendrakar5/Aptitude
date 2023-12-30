package com.xworkz.codeninja;

import java.util.Scanner;

public class IntToRoman {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scan.nextInt();

        String value = IntToRoman(num);
        System.out.println("Roman numeral representation: " + value);

        scan.close();
    }

    public static String IntToRoman(int num) {
        String[] thousand = {"", "M", "MM", "MMM"};
        String[] hundred = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] ten = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] one = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousand[num / 1000] + hundred[(num % 1000) / 100] + ten[(num % 100) / 10] + one[num % 10];
    }
}

