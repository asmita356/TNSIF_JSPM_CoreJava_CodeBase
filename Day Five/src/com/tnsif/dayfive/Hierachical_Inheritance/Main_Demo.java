package com.tnsif.dayfive.Hierachical_Inheritance;

public class Main_Demo {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
		Employee e = new Employee();
		System.out.println(e);
		Student s;
		s = new Student ("BE_A",90);
		System.out.println(s);
	}
}
