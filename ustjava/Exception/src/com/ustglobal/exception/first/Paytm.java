package com.ustglobal.exception.first;

public class Paytm {
	void book() {
		System.out.println("paytm started");
		IRCTC ir = new IRCTC();
		ir.confirm();
		System.out.println("paytm ended");
	}

}
