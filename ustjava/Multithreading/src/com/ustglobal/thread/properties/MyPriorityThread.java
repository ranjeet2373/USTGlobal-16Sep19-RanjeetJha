package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread {
	
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		int p = Thread.currentThread().getPriority();
		System.out.println("main thread priority "+p);
		
		MyPriorityThread t = new MyPriorityThread();
		int q = t.getPriority();
		System.out.println("mypriority thread priority "+q);
		
		t.setPriority(1);
		System.out.println("mythread thread priority "+t.getPriority());
		
		
		System.out.println("main ended ");
		
		
	}

}
