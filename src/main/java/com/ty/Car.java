package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	MymusicSystem mymusicSystem;
@Autowired
	public void setMymusicSystem(MymusicSystem mymusicSystem) {
		this.mymusicSystem = mymusicSystem;
	}
	
    void carDetails() {
    	mymusicSystem.play();
    	System.out.println("music playing in car");
    }
}
