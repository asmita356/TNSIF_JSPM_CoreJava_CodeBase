package com.tnsif.day8.abstract_demo;

public class Rectangle extends Shape{

	float width;
	float height;
	
	public Rectangle() {
		width=23.45f;
		height=34.5f;
		
	}

	public Rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}



	@Override
	public void calArea() {
		this.area=width*height;
		
	}

}
