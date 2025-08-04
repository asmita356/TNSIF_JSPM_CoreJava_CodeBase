package com.tnsif.dayone;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit type casting - Widening
		
		byte b = 10;
		int  i = b;
		System.out.println(i);
		
		float f = 12.004f;
		double d = f;
		System.out.println(d);
		
		char c = 'A';
		int I = c;
		System.out.println(I);
		
		
		//explicit type casting -Narrowing
		double D = 10.4752672d;
		long l = (long) D;
		System.out.println(l);
		
		int i1 = 130;
		byte B = (byte) i1;
		System.out.println(B);
	}

}
