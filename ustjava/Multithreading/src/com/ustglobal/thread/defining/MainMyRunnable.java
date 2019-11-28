package com.ustglobal.thread.defining;

public class MainMyRunnable {
	public static void main(String[] args) {
		
		System.out.println("main started");
		MyRunnable mr = new MyRunnable();
//		mr.start(); start() is undefined MyRunnable
		
		Thread t = new Thread(mr);
		t.start();
		System.out.println("main ended");
		
		
		
	}

}
