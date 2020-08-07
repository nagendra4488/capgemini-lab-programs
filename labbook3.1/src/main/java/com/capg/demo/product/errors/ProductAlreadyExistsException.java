package com.capg.demo.product.errors;

public class ProductAlreadyExistsException extends Exception {

private static final long serialVersionUID = -6270971342792467425L;
	
	
	public ProductAlreadyExistsException(String message) {
		super(message);
	}
	
}
