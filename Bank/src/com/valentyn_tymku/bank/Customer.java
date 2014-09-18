package com.valentyn_tymku.bank;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "name", "address", "phone", "accounts" }, name = "customer")
@XmlRootElement

public class Customer {
	private String firstName;
	private String lastName;	
	private String address;
	private String phone;
	private String email;
	

	public Customer() {
		
	}

	public Customer(String name, String address, String phone) {

		this.firstName = name;
		this.address = address;
		this.phone = phone;
		
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (Validate.isValidName(firstName)) this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
