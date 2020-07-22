package com.capg.exception;

public class ValidateAge {

	public void valid(int n) throws ValidateException {
	
	if(n<15) {
		
		throw new ValidateException("Age is less than 15");
	
	}
	
}
}
