package com.tnsif.day8.abstract_demo;

public class Square extends Shape{

private float side ;
	
	
	public Square(float side) {
		this.side = side;
	}
	

	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		this.area= side*side;
	}

}
