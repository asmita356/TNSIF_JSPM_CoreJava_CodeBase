package com.tnsif_day8_interface;

public class Main_Bank {

	public static void main(String[] args) {
		SavingAccount SA = new SavingAccount("Asmita","Pune",1234,32000);
		SA.deposit(22000);
		System.out.println(SA);
		SA.withdraw(5000);
		System.out.println(SA);
		SA.withdraw(49000);
		
	}

}
