package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private int id;
	private String name;
	private double salary;
	public Person(@Value(value = "89") int id,@Value(value = "loki") String name,@Value(value = "569.0") double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void personDetails() {
		System.out.println("id is " + id);
		System.out.println("id is " + name);
		System.out.println("id is " + salary);

	}
	

}
