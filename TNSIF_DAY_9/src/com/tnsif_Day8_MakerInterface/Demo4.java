package com.tnsif_Day8_MakerInterface;

public class Demo4 implements OuterInterface.InnerInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 d = new Demo4();
		d.CalArea();
		d.print();
	}
	public void CalArea() {
		System.out.println("Hi");
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

}
