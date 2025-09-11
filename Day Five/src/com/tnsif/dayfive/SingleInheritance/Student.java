package com.tnsif.dayfive.SingleInheritance;

public class Student extends Citizens{
	
	private int rollNo;
	private String collegeName;
	

	@Override
	public String toString() {
		return "Student [rollNo =" + rollNo + ", collegeName =" + collegeName + ", Name =" + getName()
				+ ", AdharNo =" + getAdharNo() + ", Address =" + getAddress() + ", Number =" + getNumber()
				+ "]";
	}


	/**
	 * @param name
	 * @param adharNo
	 * @param address
	 * @param number
	 * @param rollNo
	 * @param collegeName
	 */
	public Student(String name, String adharNo, String address, long number, int rollNo, String collegeName) {
		super(name, adharNo, address, number);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	
	
}
