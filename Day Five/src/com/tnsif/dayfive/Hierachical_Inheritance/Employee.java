package com.tnsif.dayfive.Hierachical_Inheritance;

public class Employee extends Person{
	private int empid ;
	private double salary ;
	private String Dep ;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDep() {
		return Dep;
	}
	public void setDep(String dep) {
		Dep = dep;
	}
	
	public Employee() {
		this.empid = 12;
		this.salary= 2773478.349 ;
		this.Dep= "CS";
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", Dep=" + Dep 
				+ ", Name=" + getName() + ", City=" + getCity() + "]";
	}
	
	
	
	
}
