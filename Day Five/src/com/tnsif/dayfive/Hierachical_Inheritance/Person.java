package com.tnsif.dayfive.Hierachical_Inheritance;
public class Person{
	/**
	 * @param name
	 * @param city
	 */private String Name ;
		private String City ;
	public Person() {
		Name = "Ash";
		City = "Pune";
	}
	
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", City=" + City + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
}