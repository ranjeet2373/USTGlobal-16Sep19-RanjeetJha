package com.ustglobal.thread.properties;

public class Counter {
	int v;
	
	public void increment() {
		v++;
	}
	
	public void decrement() {
		v--;
	}
	
	public void showValue() {
		System.out.println("V value is "+v);
	}

}
