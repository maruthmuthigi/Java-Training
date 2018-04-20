package com.Javatraining.Exceptions;

public class RangeCheckedException extends Exception {
	
	private String message;
	
	
	// Restric to create the object in only one way
	public RangeCheckedException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;		
	}
	
	

}
