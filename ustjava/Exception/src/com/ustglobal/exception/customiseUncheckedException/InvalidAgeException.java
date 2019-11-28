package com.ustglobal.exception.customiseUncheckedException;

public class InvalidAgeException  extends RuntimeException{
	String message = "invalid age below 18 yrs not allowed";
	@Override
	public String getMessage() {
		return message;
	}
	
	public InvalidAgeException() {
		
	}
	public InvalidAgeException(String message) {
		this.message = message;
	}

}
