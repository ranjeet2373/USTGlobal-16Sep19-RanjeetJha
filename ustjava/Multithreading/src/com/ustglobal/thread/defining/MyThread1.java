package com.ustglobal.thread.defining;

public class MyThread1 extends Thread {
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		String tname = Thread.currentThread().getName();
		System.out.println("current thread "+tname);
		
		MyThread1 mt = new MyThread1();
		String mname = mt.getName();
		System.out.println("MyThread name is "+mname);
		mt.setName("golu");
		System.out.print(mt.getName());
		
		Thread.currentThread().setName("Bala");
		
		System.out.println(10/0);
		
		
		
	}

}
