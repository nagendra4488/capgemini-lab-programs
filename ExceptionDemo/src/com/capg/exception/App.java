package com.capg.exception;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		 ValidateAge va = new ValidateAge();
		 try {
			 
			 va.valid(n);
			 System.out.println("Age is valid");
			 
		 }
		 catch(ValidateException e){
			 
			e.printStackTrace(); 
		 }
		 
		
		
	}

}
