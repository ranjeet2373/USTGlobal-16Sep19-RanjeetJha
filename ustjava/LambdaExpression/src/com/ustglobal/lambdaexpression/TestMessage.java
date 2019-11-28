package com.ustglobal.lambdaexpression;

public class TestMessage {
	public static void main(String[] args) {
		MessageInterface mes = (message)->{
								System.out.print("hello ");
								return message;
								
		};
		
		String message = mes.message("hi");
		System.out.println(message);
		
	}

}
