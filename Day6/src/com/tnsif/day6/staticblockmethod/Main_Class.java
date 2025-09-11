package com.tnsif.day6.staticblockmethod;

public class Main_Class {

	public static void main(String[] args) {
		//static - update
		//nonstatic - new block created
		MyClass.display();
		
		MyClass myclass = new MyClass();
		System.out.println(myclass);
		
		//static method with class name
		MyClass myclass1 = new MyClass();
		System.out.println(myclass1);
		myclass1.display();
		
		MyClass myclass2 = new MyClass();
		System.out.println(myclass2);
		myclass2.display();
	}

}
