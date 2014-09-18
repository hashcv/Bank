package com.valentyn_tymku.bank;

//import javax.validation.*;

public class Validate {

	public static boolean isValidName(String name) {
		if (name.matches("[A-Z][a-zA-Z]*"))
			return true;
		else {
			System.out.println("Name is invalid!");
			return false;
		}
	}

	public static boolean isValidPhone(String phone) {
		if (phone.matches("^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$"))
			return true;
		else {
			System.out.println("Phone is invalid!");
			return false;
		}
	}

	public static boolean isValidAddress(String address) {
		if (address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)"))
			return true;
		else {
			System.out.println("Address is invalid!");
			return false;
		}
	}

	public static boolean isValidEmail(String email) {
		if (email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
			return true;
		else {
			System.out.println("Email is invalid!");
			return false;
		}
	}

	/*
	 * public static boolean isValidCustomer(Customer customer){
	 * 
	 * else return false; }
	 * 
	 * public static boolean isValidAccount(Account account){
	 * 
	 * return true; }
	 */
}
