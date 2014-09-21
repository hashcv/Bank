package com.valentyn_tymku.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class IOConsole implements InputOutput {
	private static List<Customer> custs = Storage.custs;
	private static List<Account> accs = Storage.accs;

	public void read() throws IOException {
		System.out.println("Console input. What do you want to add?");
		System.out.println("1. Add a new Customer.");
		System.out.println("2. Add a new Account to existing cutomer.");
		System.out.print("Choose one: ");

		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String tIn = r.readLine();

		switch (Integer.valueOf(tIn)) {
		case 1:
			System.out.println("Please input string with next format:");
			System.out.println("firstName|LastName|IPN|Address|Phone|Email");
			System.out.println("Example:");
			System.out
					.println("James|Hetfield|1212121212|Address1|+380992233444|jh@gmail.com");
			custs.add(Customer.parseCust(r.readLine()));
			break;
		case 2:
			System.out.println("Please input string with next format:");
			System.out
					.println("Number|Name|Currency|debit|creditLimit|Customer IPN");
			System.out.println("Example:");
			System.out.println("951798684|acc1|USD|100.0|10.0|1212121212");
			accs.add(Account.parseAcc(r.readLine()));
			break;
		}
		ConsoleMenu.printMainMenu();
	}

	public void write() throws IOException {
		Storage.printAll();
		ConsoleMenu.printMainMenu();
	}

}
