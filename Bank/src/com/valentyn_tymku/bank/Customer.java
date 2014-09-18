package com.valentyn_tymku.bank;

//import com.valentyn_tymku.bank.Validate;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "firstName", "lastName", "address", "phone", "email" }, name = "customer")
@XmlRootElement

public class Customer {
	private String firstName;
	private String lastName;	
	private String address;
	private String phone;
	private String email;
	

	public Customer() {
		
	}
	
	public String toString (){
		String delim = " | ";
		StringBuilder sb = new StringBuilder();
		sb.append(firstName);
		sb.append(delim);
		sb.append(lastName);
		sb.append(delim);
		sb.append(address);
		sb.append(delim);
		sb.append(phone);
		sb.append(delim);
		sb.append(email);
		
		return sb.toString();
		
	}

	public Customer(String firstName, String lastName, String address, String phone, String email) {
		
		if (Validate.isValidName(firstName)) this.firstName = firstName;
		if (Validate.isValidName(lastName)) this.lastName = lastName;
		if (Validate.isValidAddress(address)) this.address = address;
		if (Validate.isValidPhone(phone)) this.phone = phone;
		if (Validate.isValidEmail(email)) this.email = email;
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
		if (Validate.isValidName(lastName)) this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (Validate.isValidEmail(email)) this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (Validate.isValidAddress(address)) this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		if (Validate.isValidPhone(phone)) this.phone = phone;
	}

}
