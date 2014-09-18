package com.valentyn_tymku.bank;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "number", "name", "currency", "debit", "creditLimit" }, name = "account")
@XmlRootElement
public class Account {

	private long number;
	private String name;
	private Currencies currency;
	private double debit;
	private double creditLimit;
	private Customer customer;

	public Account() {
	}

	public Account(long number, String name, Currencies currency, double debit,
			double creditLimit, Customer customer) {

		this.number = number;
		this.name = name;
		this.debit = debit;
		this.creditLimit = creditLimit;
		this.customer = customer;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(number);
		sb.append(Util.delim);
		sb.append(name);
		sb.append(Util.delim);
		sb.append(debit);
		sb.append(Util.delim);
		sb.append(creditLimit);
		sb.append(Util.delim);
		sb.append(customer.getFirstName());
		sb.append(customer.getLastName());
		return sb.toString();

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

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}
}
