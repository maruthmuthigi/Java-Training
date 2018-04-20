package com.Javatraining.polyfaces;

public interface Automobile {

	// Interface has only Constant - public static final
	public String NAME = "Automobile Quotation Printing";
	// All the method in the interface are implicitly abstract and public
	
	public String getModel();
	public double getPrice();
	public String getColor();
	
	
	
}
