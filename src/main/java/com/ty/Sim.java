package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sim {
	@Value(value = "idea")
	private String name;
	void simDetails() {
		System.out.println("sim name is "+name);
	}
	

}
