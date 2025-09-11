package com.tnsif.dayfive.SingleInheritance;

public class Citizens{
	
	private String name;
	private String adharNo;
	private String address;
	private long number;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getNumber() {
		return number;
	}
	
	
	public Citizens(String name, String adharNo, String address, long number) {
		this.name = name;
		this.adharNo = adharNo;
		this.address = address;
		this.number = number;
	}
	
	
	@Override
	public String toString() {
		return "SingleInheritance [name=" + name + ", adharNo=" + adharNo + ", address=" + address + ", number="
				+ number + "]";
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
}
