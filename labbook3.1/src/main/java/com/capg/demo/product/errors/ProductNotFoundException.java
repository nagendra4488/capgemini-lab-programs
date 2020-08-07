package com.capg.demo.product.errors;

public class ProductNotFoundException extends Exception{

private static final long serialVersionUID = -6270971342792467425L;
	
	
	public ProductNotFoundException(String message) {
		super(message);
	}
	
}
