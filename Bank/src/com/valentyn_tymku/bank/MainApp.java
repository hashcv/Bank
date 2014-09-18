package com.valentyn_tymku.bank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;*/

public class MainApp {
	// public Customer dataCustomer() {
	/*
	 * Customer cust1 = new Customer("James", "Hetfield",
	 * "43, SomeStreet st., Ukraine", "+80992233444", "jh@gmail.com"); return
	 * cust1;
	 */

	// }

	/*
	 * public Account dataAccount() { Customer cust1 = dataCustomer();
	 * 
	 * Account acc1 = new Account(951798684, "acc1", Currencies.USD, 100, 10,
	 * cust1); return acc1;
	 * 
	 * }
	 */

	/*
	 * public Transaction dataTransaction() {
	 * 
	 * Customer cust1 = new Customer("James Hetfield", "Address1",
	 * "+12344565734"); Customer cust2 = new Customer("Lars Ulrich", "Address2",
	 * "+364743756");
	 * 
	 * List<Account> accs = new ArrayList<Account>(); accs.add(new
	 * Account("acc1", 100, 10)); accs.add(new Account("acc2", 200, 20));
	 * cust1.setAccounts(accs);
	 * 
	 * accs.clear(); accs.add(new Account("acc1", 500, 100)); accs.add(new
	 * Account("acc2", 600, 200)); cust2.setAccounts(accs);
	 * 
	 * Transaction tr1 = new Transaction(cust1.getAccounts().get(0), cust2
	 *.getAccounts().get(0), 15);
	 * 
	 * return tr1; }
	 */

	/*
	 * public void marshallExample() { try { File fileCustomers = new
	 * File("customers.xml"); File fileAccounts = new File("accounts.xml");
	 * 
	 * JAXBContext context = JAXBContext.newInstance(Customer.class); Marshaller
	 * marshaller = context.createMarshaller();
	 * marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	 * marshaller.marshal(dataCustomer(), fileCustomers);
	 * 
	 * System.out.println();
	 * 
	 * context = JAXBContext.newInstance(Account.class); marshaller =
	 * context.createMarshaller();
	 * marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	 * marshaller.marshal(dataAccount(), fileAccounts);
	 * 
	 * } catch (JAXBException exception) {
	 * Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE,
	 * "marshallExample threw JAXBException", exception); } }
	 */
//	public void unmarshallExample() {

	//}

	public void in(Dst dst) throws IOException {
		List<Customer> custs = new ArrayList<Customer>();
		List<Account> accs = new ArrayList<Account>();

		switch (dst) {
		case TXT:
			// Read customers file
			BufferedReader custReader = new BufferedReader(new FileReader(
					"customers.txt"));
			String str;
			while ((str = custReader.readLine()) != null) {
				List<String> arr = new ArrayList<String>();
				arr.addAll(Arrays.asList(str.split(Util.readDelim)));
				custs.add(new Customer(arr.get(1), arr.get(2), Long
						.parseLong(arr.get(3)), arr.get(4), arr.get(5), arr
						.get(6)));
			}

			// Read accounts file
			BufferedReader accReader = new BufferedReader(new FileReader(
					"accounts.txt"));

			while ((str = accReader.readLine()) != null) {
				List<String> arr = new ArrayList<String>();
				arr.addAll(Arrays.asList(str.split(Util.readDelim)));

				int custIndex = 0;
				for (Customer cust : custs) {
					if (cust.getIpn().toString().equals(arr.get(6)))
						custIndex = custs.indexOf(cust);
				}

				accs.add(new Account(Long.parseLong(arr.get(1)), arr.get(2),
						Currencies.valueOf(arr.get(3)), Double.parseDouble(arr
								.get(4)), Double.parseDouble(arr.get(5)), custs
								.get(custIndex)));
			}
			break;

		case SOUT:
			/*
			 * System.out.println(dataCustomer());
			 * System.out.println(dataAccount());
			 */
			break;
		case XML:
			/*
			 * MainApp instance = new MainApp(); instance.marshallExample();
			 */
			break;
		case SQL:
			break;
		}
		for (Customer cust : custs) {
			System.out.println(cust.toString());
		}

		for (Account acc : accs) {
			System.out.println(acc.toString());
		}
	}

	/*
	 * public void out(Dst dst) throws IOException {
	 * 
	 * switch (dst) { case TXT: BufferedWriter cw = new BufferedWriter(new
	 * FileWriter( "customers.txt")); BufferedWriter ca = new BufferedWriter(new
	 * FileWriter( "accounts.txt"));
	 * 
	 * cw.write(dataCustomer().toString()); ca.write(dataAccount().toString());
	 * 
	 * cw.close(); ca.close(); break; case SOUT:
	 * System.out.println(dataCustomer()); System.out.println(dataAccount());
	 * break; case XML: MainApp instance = new MainApp();
	 * instance.marshallExample(); break; }
	 * 
	 * }
	 */

	public static void main(String[] args) throws IOException {

		MainApp instance = new MainApp();
		/*
		 * try { instance.out(Dst.TXT); instance.out(Dst.SOUT);
		 * instance.out(Dst.XML); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		System.out.println("What is input destination?");
		System.out.println("1. Console.");
		System.out.println("2. Text file.");
		System.out.println("3. XML file.");
		System.out.println("Choose one: ");

		BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
		String tIn = r1.readLine();

		switch (Integer.valueOf(tIn)) {
		case 1:
			instance.in(Dst.SOUT);
			break;
		case 2:
			instance.in(Dst.TXT);
			break;
		case 3:
			instance.in(Dst.XML);
			break;
		}

		/*
		 * System.out.println("What is output destination?");
		 * System.out.println("1. Console.");
		 * System.out.println("2. Text file.");
		 * System.out.println("3. XML file.");
		 * System.out.println("Choose one: ");
		 * 
		 * BufferedReader r = new BufferedReader(new
		 * InputStreamReader(System.in)); String tOut = r.readLine();
		 * 
		 * switch (Integer.valueOf(tOut)) { case 1: instance.out(Dst.SOUT);
		 * break; case 2: instance.out(Dst.TXT); break; case 3:
		 * instance.out(Dst.XML); break; }
		 */

		// instance.unmarshallExample();

		/*
		 * Customer cust1 = new
		 * Customer("James Hetfield","Address1","+12344565734"); Customer cust2
		 * = new Customer("Lars Ulrich","Address2","+364743756"); Customer cust3
		 * = new Customer("Kirk Hammett","Address3","+25735685"); Customer cust4
		 * = new Customer("Robert Trujillo","Address4","+2457664734");
		 */

		/*
		 * List<Account> accs = new ArrayList<Account>(); accs.add(new
		 * Account("acc1",100,10,cust1)); accs.add(new
		 * Account("acc2",200,20,cust1)); cust1.setAccounts(accs);
		 * 
		 * accs.clear(); accs.add(new Account("acc1",500,100,cust2));
		 * accs.add(new Account("acc2",600,200,cust2)); cust2.setAccounts(accs);
		 * 
		 * accs.clear(); accs.add(new Account("acc1",700,110,cust3));
		 * accs.add(new Account("acc2",800,210,cust3)); cust3.setAccounts(accs);
		 * 
		 * accs.clear(); accs.add(new Account("acc1",900,120,cust4));
		 * accs.add(new Account("acc2",1200,220,cust4));
		 * cust4.setAccounts(accs);
		 */
	}

}
