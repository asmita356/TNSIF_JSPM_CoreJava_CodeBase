package com.tnsif_day8_Functioninterface;
public class Demo{
	public static void main(String[] args) {
		GreetInterface g = new GreetDemo();
		g.greet();
		g.show();
	}
}