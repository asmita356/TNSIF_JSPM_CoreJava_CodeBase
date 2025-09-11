package com.tnsif.day6.staticblockmethod;

public class Employee {
	private String name;
	private int id;
	
	
	//TNS which is common for all the objects
	static String companyName = "TNS";


	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Employee [name = " + name + ", id = " + id + ", Company = " + companyName +"]";
	}
	
	
}
