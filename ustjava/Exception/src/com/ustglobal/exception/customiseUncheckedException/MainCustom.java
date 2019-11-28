package com.ustglobal.exception.customiseUncheckedException;

public class MainCustom {
	public static void main(String[] args) {
		System.out.println("main started");
		Validator v = new Validator();
		try {
		v.verify(20);
		}catch(InvalidAgeException i) {
			System.out.println("exception occured");
		}
		System.out.println("hello");
		v.verify(13);
		System.out.println("main ended");
	}

}
