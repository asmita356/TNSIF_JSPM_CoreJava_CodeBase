package com.tnsif.day3.scanner;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		Tax_Calculation cal = new Tax_Calculation();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.next();
		System.out.print("Enter income: ");
		int income = sc.nextInt();
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		System.out.print("Enter your gender: ");
		String gender = sc.next();
		
		p.setAge(age);
		p.setGender(gender);
		p.setIncome(income);
		p.setName(name);
		cal.calculateTax(p);
		
		System.out.println(p);
	}

}
