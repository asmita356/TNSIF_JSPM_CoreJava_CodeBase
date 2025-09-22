package com.tnsif_day8_interface;

public interface Bank {
	
	final static float MINBAl = 5000;
	final static float Deposit_Limit = 25000;
	
	public void deposit(float amount);
	public void withdraw(float amount);

}
