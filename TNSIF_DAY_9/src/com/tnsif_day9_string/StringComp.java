package com.tnsif_day9_string;

public class StringComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "TNSIF";
		String s2 = "TNSIF";
		
		String s3 = new String("TNSIF");
		String s4 = new String("TNSIF");
		
		System.out.println(s1.equals(s2));//match character
		System.out.println(s3.equals(s4));//data
		System.out.println(s1.equals(s4));
		
		System.out.println(s1==s2);//reference
		System.out.println(s1==s3);//different reference
		System.out.println(s3==s4);
	}

}
