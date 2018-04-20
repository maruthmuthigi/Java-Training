package com.Javatraining.poly.domains;

import com.Javatraining.polyfaces.Automobile;

public class NewShowRoom extends ShowRoom {

	@Override
	public Automobile getProduct(int key) {
		if(key ==3){
			return new Tractor();
		}
		else
		{
			return super.getProduct(key);
		}
		
	}

}
