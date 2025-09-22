package com.tnsif.day8.abstract_demo;



public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s = new Square(6.7f);
		s.calArea();
		s.show();
		
		s= new Rectangle();
		s.calArea();
		s.show();
		
	}

}
