package com.ustglobal.exception.first;

public class BMS {
	public static void main(String[] args) {
		
		System.out.println("bms statrted");
		
		PVR p = new PVR();
		try {
		p.book();
		System.out.println("booking confirmed");
		}catch(ArithmeticException ae) {
			System.out.println("bookong failed");
		}
		System.out.println("bms ended");
	}

}
