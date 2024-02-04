package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Bike {
	
	Engine engine;
	
	
	
	public Bike(Engine engine) {
		super();
		this.engine = engine;
	}



	void bikeDetails() {
	engine.engineDetails();
	System.out.println("engine is fixed to bike");
	}
}
