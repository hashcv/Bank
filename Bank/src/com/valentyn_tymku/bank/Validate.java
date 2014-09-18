package com.valentyn_tymku.bank;

//import javax.validation.*;

public class Validate {

	public static boolean isValidName(String name) {
		return name.matches("[A-Z][a-zA-Z]*");
	}

	public static boolean isValidPhone(String phone) {
		return phone.matches("^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$");

	}

	public static boolean isValidAddress(String address) {
		return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}

	public static boolean isValidEmail(String email) {
		return email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

	}
}
