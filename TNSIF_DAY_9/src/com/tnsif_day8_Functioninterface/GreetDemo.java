package com.tnsif_day8_Functioninterface;

public class GreetDemo implements GreetInterface{

	@Override
	public void greet() {
		System.out.println("Greet");
		
	}

	@Override
	public void show() {
		System.out.println("Show");
	}
	
}
