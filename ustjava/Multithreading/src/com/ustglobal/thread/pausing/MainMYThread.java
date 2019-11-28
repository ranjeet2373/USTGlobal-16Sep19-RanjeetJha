package com.ustglobal.thread.pausing;

public class MainMYThread {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		MyThread my = new MyThread();
		my.start();
		for(int i= 0;i<10;i++) {
			System.out.println("mai thread");
		}
		System.out.println("main end");
	}

}
