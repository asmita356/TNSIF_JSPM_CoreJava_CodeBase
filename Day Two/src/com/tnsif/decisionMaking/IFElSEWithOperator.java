package com.tnsif.decisionMaking;

import java.util.Scanner;

public class IFElSEWithOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int x = sc.nextInt();
		System.out.println("Enter second number : ");
		int y = sc.nextInt();
		
		if(x!=y || x<y) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}

	}

}
