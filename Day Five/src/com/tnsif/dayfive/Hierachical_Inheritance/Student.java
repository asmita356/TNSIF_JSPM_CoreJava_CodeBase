package com.tnsif.dayfive.Hierachical_Inheritance;

public class Student extends Person{
	private String Class1 ;
	private int rollNo ;
	public String getClass1() {
		return Class1;
	}
	public void setClass(String class1) {
		Class1 = class1;
	}
	public int getRollNo() {
		return rollNo;
	}
	
	
	public Student(String string, int i) {
		this.Class1 = "BE_B";
		this.rollNo = 23;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [Class1=" + Class1 + ", rollNo=" + rollNo  + ", Name="
				+ getName() + ", City=" + getCity() + "]";
	}
	
	
	
}
