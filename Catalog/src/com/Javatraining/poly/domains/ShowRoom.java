package com.Javatraining.poly.domains;

import com.Javatraining.polyfaces.Automobile;

public class ShowRoom {
	// Instance Factory method pattern
	public Automobile getProduct(int key){
		
		switch (key) {
		case 1:
				return new MarutiCar();
		case 2:
				return new BajajBike();
		
			
		default:
			return null;
		
		}
	}
	// The polyAuto will exhibit run time polymorphism - it calls the methods in the object what it is referring and not the type
	public void printQuotation(Automobile polyAuto){
		if(polyAuto != null){		
		
			System.out.println(Automobile.NAME);
			System.out.println(polyAuto.getModel());
			System.out.println(polyAuto.getColor());
			System.out.println(polyAuto.getPrice());
		}
		else
		{
			System.out.println("Invalid choice: Select either 1 or 2");
		}
	}

}
