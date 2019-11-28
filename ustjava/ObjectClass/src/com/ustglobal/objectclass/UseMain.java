package com.ustglobal.objectclass;

public class UseMain {
	public static void main(String[] args) {
		Pendrive p = new Pendrive();
		USBPort.connect(p);
		Mouse m = new Mouse();
		USBPort.connect(m);
		System.out.println(p);
		System.out.println(p.hashCode());
	}

}
