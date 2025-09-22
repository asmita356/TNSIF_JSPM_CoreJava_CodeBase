package com.tnsif_day8_interface;

public class SavingAccount extends Customer implements Bank{

	private int accountNumber;
	private float Balance;
	
	
	public SavingAccount(String name, String city, int accountNumber, float balance) {
		super(name, city);
		this.accountNumber = accountNumber;
		this.Balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public float getBalance() {
		return Balance;
	}

	public void setBalance(float balance) {
		Balance = balance;
	}

	@Override
	public void deposit(float amount) {
	if(amount < 0 || amount > Deposit_Limit ) {
		System.out.println("Please depoist a valid amount");
	}else {
		Balance+=amount;
		System.out.println("Rs: "+amount+ " is deposited Successfully");
	}
		
	}

	@Override
	public void withdraw(float amount) {
		if(amount < Balance-MINBAl) {
			Balance-=amount;
			System.out.println("Rs: "+amount+" withdrawal is Successfull");
		}else {
			System.out.println("Insufficient Balance");
		}
		
	}

	@Override
	public String toString() {
		return "SavingAccount [accountNumber =" + accountNumber + ", Balance =" + Balance + ", AccountNumber ="
				+ getAccountNumber() + ", Balance =" + getBalance() + ", Name =" + getName() + ", City ="
				+ getCity() + "]";
	}
	
	

}
