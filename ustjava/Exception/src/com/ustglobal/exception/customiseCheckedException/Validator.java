package com.ustglobal.exception.customiseCheckedException;

public class Validator {
	
	void checkAmount(int amount) throws InvalidAmountException {
		if(amount>40000) {
			throw new InvalidAmountException();
	}

	
		
	}

}
