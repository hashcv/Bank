package com.valentyn_tymku.bank;

import java.util.ArrayList;
import java.util.List;

public class Storage {
	public static List<Customer> custs = new ArrayList<Customer>();
	public static List<Account> accs = new ArrayList<Account>();

	public static Customer findCustomer(Long ipn) {
		for (Customer cust : custs) {
			if (cust.getIpn().equals(ipn))
				return cust;

		}
		System.out.println("Not found customer with ipn "+ipn);
		return null;
	}

	public static void printAll() {

		for (Customer cust : custs) {
			System.out.println(cust.toString());
		}

		for (Account acc : accs) {
			System.out.println(acc.toString());
		}

	}

	public static void clearAll() {
		custs.clear();
		accs.clear();
	}
}
