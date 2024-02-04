package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private String name;
	private double salary;
	
	@Value(value = "09")
	public void setId(int id) {
		this.id = id;
	}
	@Value(value = "sufi")
	public void setName(String name) {
		this.name = name;
	}
	@Value(value = "85.02")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	void employeeDetails() {
		System.out.println("id is " + id);
		System.out.println("id is " + name);
		System.out.println("id is " + salary);

	}

}
