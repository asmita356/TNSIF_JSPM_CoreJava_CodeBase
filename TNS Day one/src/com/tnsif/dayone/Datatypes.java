package com.tnsif.dayone;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteMax = 127;//1 byte
		byte byteMin = -128;
		System.out.println("byteMax: "+byteMax);
		System.out.println("byteMin: "+byteMin);
		
		short shortMax = 32767; // 2 byte
		short shortMin = -32768;
		System.out.println("shortMax: "+shortMax);
		System.out.println("shortMin: "+shortMin);
		
		int num = 20/3; //4 byte
		//int Max 2147483647    int Min  -2147483648
		System.out.println("int "+num);
		
//		float floatMax =9223372036854775807;
//		float floatMin =9223372036854775808;
		
		float num1 = 8/3f; //4 byte
		System.out.println("float: "+num1);
		
		double num2 = 8/3f; // 8 byte
		System.out.println(num2);
		
		char s = 65;//2 byte
		System.out.println("char: "+s);
		
		boolean result = false; //1 bit
		System.out.println("boolean: "+result);
	}

}
