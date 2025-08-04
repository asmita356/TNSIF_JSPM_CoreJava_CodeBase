package com.tnsif.decisionMaking;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userName ="___asmita__07";
		String password = "Ash123@";
		System.out.print("Enter your username : ");
		String user_name = sc.next();
		System.out.print("Enter your password : ");
		String user_password = sc.next();
		
		if(user_name.equals(user_password)) {
			if(user_password.equals(user_password)) {
				System.out.println("You are logged in...");
			}
			else {
				System.out.println("Wrong Password");
			}
		}else {
				System.out.println("Wrong User Name");
			
	}
}

}
