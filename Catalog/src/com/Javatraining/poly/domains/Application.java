package com.Javatraining.poly.domains;

import com.Javatraining.polyfaces.Automobile;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int key = Integer.parseInt(args[0]);
		
		ShowRoom SaiAuto = new NewShowRoom();
		
		Automobile auto = SaiAuto.getProduct(key);
		SaiAuto.printQuotation(auto);

	}

}
