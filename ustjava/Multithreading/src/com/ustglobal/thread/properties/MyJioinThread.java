package com.ustglobal.thread.properties;

public class MyJioinThread extends Thread {
	
	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}


