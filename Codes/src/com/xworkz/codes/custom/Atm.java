package com.xworkz.codes.custom;

import com.xworkz.codes.customone.InsufficientCashException;

public class Atm {
	
	public static void withDrow(int balance,Long Amout) throws InsufficientCashException {
		if(balance>=Amout) {
			System.out.println("wait for cash");
		}else {
			System.out.println("No cash");
		}
		throw new InsufficientCashException("No Cash");
	}

}
