package com.valentyn_tymku.bank;

public class Account extends Util{

	private long id;
	private String name;
	private double debit;
	private double creditLimit;
	private Customer customer;
	
	
	
/*	public Account() {
		super();
		this.id = GenerateID();
	}
*/	
	public Account(String name, double debit, double creditLimit,
			Customer customer) {
		super();
		this.id = GenerateID();
		this.name = name;
		this.debit = debit;
		this.creditLimit = creditLimit;
		this.customer = customer;
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
