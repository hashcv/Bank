package com.valentyn_tymku.bank;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "name", "address", "phone", "accounts" }, name = "customer")
@XmlRootElement
public class Customer extends Util {
	private long id;
	private String name;
	private String address;
	private String phone;
	private List<Account> accounts = new ArrayList<Account>();

	public Customer() {
		this.id = GenerateID();
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public Customer(String name, String address, String phone) {

		this.id = GenerateID();
		this.name = name;
		this.address = address;
		this.phone = phone;
		// this.accounts = acc;
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
