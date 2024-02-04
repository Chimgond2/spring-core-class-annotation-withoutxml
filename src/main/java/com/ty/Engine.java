package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Engine {
	@Value(value = "50cc")
	private String cc;
	
	void engineDetails() {
		System.out.println("engine cc is "+cc);
	}
	

}
