package com.xworkz.codes.customone;

import com.xworkz.codes.custom.Atm;

public class Main {
	
	public static void main(String[] args) {
		try {
			Atm.withDrow(5000, 6000l);
			System.out.println("try");
		}catch (InsufficientCashException e) {
			e.printStackTrace();
		}
	}

}
