package com.tnsif_day9_string;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String(" Asmita ");
		System.out.println(s1);
		
		String s2= s1.toLowerCase();
		System.out.println(s2);
		
		System.out.println(s1.length());
		String s3 = s1.substring(1,6);
		System.out.println(s3);
		System.out.println(s1.trim());
		System.out.println(s1.stripLeading());
		System.out.println(s1.isEmpty());
		
		String s4 = new String(" Asmita ");
		// string comparison
		System.out.println(s1.equals(s4));
		System.out.println(s1==s4);
	}

}
