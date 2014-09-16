package com.valentyn_tymku.bank;

public class Customer extends Util{
	private long id;
	private String name;
	private String address;
	private String phone;
	
/*	public Customer() {
		super();
		this.id = GenerateID();
	}*/
	
	public Customer(String name, String address, String phone) {
		super();
		this.id = GenerateID();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
