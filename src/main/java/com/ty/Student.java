package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value(value = "5")
	private int id;
	@Value(value = "karthik")
	private String name;
	@Value(value = "80.36")
	private double percentage;

	void studentDetails() {
		System.out.println("id is " + id);
		System.out.println("id is " + name);
		System.out.println("id is " + percentage);

	}

}
