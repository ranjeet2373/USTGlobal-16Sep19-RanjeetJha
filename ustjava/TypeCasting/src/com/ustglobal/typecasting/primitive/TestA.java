package com.ustglobal.typecasting.primitive;

public class TestA {
	public static void main(String[] args) {
		byte a = 10;
		int b =a;//Implicit casting
		System.out.println("value of b is "+b);
		int p=20;
		double q = p;
		System.out.println("value of q is "+q);
		
		System.out.println("*********************");
		
		double x = 20.67;
		int y = (int)x;
		System.out.println("value of y is "+y);
		
		char c ='a';
		int n = c;
		System.out.println(n);
		
		long l = 1245678l;
		int z = (int)l;
		System.out.println(z);
	}

}
