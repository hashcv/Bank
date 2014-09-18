package com.valentyn_tymku.bank;

import javax.xml.bind.annotation.XmlType;



@XmlType(propOrder = { "name", "debit", "creditLimit", "customer" }, name = "account")

public class Account {
	
	public enum Currencies {
	    USD, EUR, UAH
	}

	private String name;
	private Currencies currency;
	private double debit;
	private double creditLimit;
	private Customer customer;

	public Account(String name, double debit, double creditLimit, Customer customer) {

		
		this.name = name;
		this.debit = debit;
		this.creditLimit = creditLimit;
		this.customer = customer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Currencies getCurrency() {
		return currency;
	}

	public void setCurrency(Currencies currency) {
		this.currency = currency;
	}

	public double getDebit() {
		return debit;
	}

	public void setDebit(double debit) {
		this.debit = debit;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
