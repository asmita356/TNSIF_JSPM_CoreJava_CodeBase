package com.tnsif_Day8_MakerInterface;

public class Demo3 implements ExtendedInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d = new Demo3();
		d.show();
		d.print();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Hii");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

}
