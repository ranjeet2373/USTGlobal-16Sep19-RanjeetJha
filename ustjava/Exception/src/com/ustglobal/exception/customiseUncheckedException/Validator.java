package com.ustglobal.exception.customiseUncheckedException;

public class Validator {
	void verify(int age) {
		if(age<18) {
			throw new InvalidAgeException("try again next time!");
		}
	}

}
