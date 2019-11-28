package com.ustglobal.typecasting.reference;

public class TestA {
	public static void main(String[] args) {
		Pen p = new Marker(); //UP-CASTING
		System.out.println(p.cost);
		p.write();
//		System.out.println(p.size); NOT POSSIBLE
//		p.color();  NOT POSSIBLE
		Marker m = new Marker();
		p.write();
		m.write();
		Marker m1 = (Marker)p;  //DOWN-CASTING
		m.color();
		m.write();
		
	}

}
