package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Autowired
	Sim sim;
	void moblieDetails() {
		sim.simDetails();
		System.out.println("mobile had sim");
	}

}
