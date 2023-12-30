package com.xworkz.maxmin;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TodayDate {

	public static void main(String[] args) {
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		System.out.println(date); // 06-23-2020
	}
}
