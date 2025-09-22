package com.tnsif.day8.abstract_demo;

public abstract class Shape {
	protected  float area;
	
	//abstract method
	public abstract void calArea();
	
	//solid method
	public void show(){
		System.out.println("Area: "+area);
	}
	
}
