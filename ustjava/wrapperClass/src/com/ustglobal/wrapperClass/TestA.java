package com.ustglobal.wrapperClass;

public class TestA {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a is "+a);
		Integer i = a;//Boxing or Auto boxing
		System.out.println("i is "+i);
		
		Integer x = 10;
		Integer z = new Integer(20);
		System.out.println("x is "+x);
		int y = x;// unboxing auto 
		System.out.println("y is "+y);
		
		boolean result = Boolean.parseBoolean("false");
		System.out.println("Result is "+result);
		
		int value1 = Integer.parseInt("123");
		System.out.println(value1);
		
		int value2 = Integer.parseInt("123string");//number format
		System.out.println(value2);
	}

}
