package com.valentyn_tymku.bank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * @author hash
 *
 */
public class IOTxt implements InputOutput {
	private static Storage storage = Storage.getInstance();
	private static List<Customer> custs = storage.getCusts();
	private static List<Account> accs = storage.getAccs();

	/* (non-Javadoc)
	 * @see com.valentyn_tymku.bank.InputOutput#read()
	 */
	public void read() throws IOException {
		BufferedReader custReader = new BufferedReader(new FileReader(
				"customers.txt"));
		String str;
		while ((str = custReader.readLine()) != null) {
			custs.add(Customer.parseCust(str));
		}

		BufferedReader accReader = new BufferedReader(new FileReader(
				"accounts.txt"));

		while ((str = accReader.readLine()) != null) {
			accs.add(Account.parseAcc(str));
		}

		custReader.close();
		accReader.close();

	}

	/* (non-Javadoc)
	 * @see com.valentyn_tymku.bank.InputOutput#write()
	 */
	public void write() throws IOException {
		BufferedWriter cw = new BufferedWriter(new FileWriter("customersW.txt"));
		BufferedWriter ca = new BufferedWriter(new FileWriter("accountsW.txt"));
		for (Customer cust : custs) {
			cw.write(cust.toString());
			cw.newLine();
		}

		for (Account acc : accs) {
			ca.write(acc.toString());
			cw.newLine();
		}

		cw.close();
		ca.close();

	}

}
