package com.tnsif.decisionMaking;

public class NestedIFELSE {

	public static void main(String[] args) {
		int a =30, b =3, c =10;
		if(a>b) {
			if(a>c) {
				System.out.println("a is greater than b and c");
			}else {
				System.out.println("c is greater than b and a");
			}
		}
		else {
			if(c>b) {
				System.out.println("c is greater than a and b");
			}else {
				System.out.println("b is greater than a and c");
			}
		}

	}

}
