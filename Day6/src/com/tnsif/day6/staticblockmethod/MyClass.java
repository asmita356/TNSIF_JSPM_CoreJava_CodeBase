package com.tnsif.day6.staticblockmethod;

public class MyClass {
	private int section; //Non Static variable
	private static int srNo;  //Static variable
	
	//static block
	static {
		System.out.println("------Within static block------");
		srNo = 1000;
	}
	
	MyClass(){
		System.out.println("------Within Default constructor------");
		srNo++;
		section++;
	}

	@Override
	public String toString() {
		return "MyClass [section=" + section + ",srNo= "+ srNo +"]";
	}
	
	//static method
	static void display()
	{
		System.out.println("Serial No: "+srNo);
	}
	

}
