package com.ustglobal.thread.properties;

public class MainMyJoinMethod {
	
	public static void main(String[] args) {
		
		System.out.println("main started ");
		MyJioinThread t = new MyJioinThread();
		t.start();
//		try {
//			t.join(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for(int i = 0;i<10;i++) {
			System.out.println("main thread ");
		}
		System.out.println("main ended");
		
	}

}
