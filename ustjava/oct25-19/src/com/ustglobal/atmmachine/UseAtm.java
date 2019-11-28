package com.ustglobal.atmmachine;

public class UseAtm {
	public static void main(String[] args) {
		HDFC h = new HDFC();
		Machine m = new Machine();
		m.slot(h);
		System.out.println("****************");
		ICICI i = new ICICI();
		m.slot(i);
		
		System.out.println("*******************");
		SBI s = new SBI();
		m.slot(s);
	}

}
