package com.valentyn_tymku.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MainApp {
	public Customer dataCustomer() {
		Customer cust1 = new Customer("James Hetfield", "Address1",
				"+12344565734");
		return cust1;

	}

	public Customer dataAccount() {
		Customer cust1 = dataCustomer();
		List<Account> accs = new ArrayList<Account>();
		accs.add(new Account("acc1", 100, 10));
		accs.add(new Account("acc2", 200, 20));
		cust1.setAccounts(accs);
		return cust1;

	}

	public Transaction dataTransaction() {

		Customer cust1 = new Customer("James Hetfield", "Address1",
				"+12344565734");
		Customer cust2 = new Customer("Lars Ulrich", "Address2", "+364743756");

		List<Account> accs = new ArrayList<Account>();
		accs.add(new Account("acc1", 100, 10));
		accs.add(new Account("acc2", 200, 20));
		cust1.setAccounts(accs);

		accs.clear();
		accs.add(new Account("acc1", 500, 100));
		accs.add(new Account("acc2", 600, 200));
		cust2.setAccounts(accs);

		Transaction tr1 = new Transaction(cust1.getAccounts().get(0), cust2
				.getAccounts().get(0), 15);

		return tr1;
	}

	public void marshallExample() {
		try {
			JAXBContext context = JAXBContext.newInstance(Customer.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
					Boolean.TRUE);
			marshaller.marshal(dataAccount(), System.out);
			System.out.println();
			context = JAXBContext.newInstance(Transaction.class);
			marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
					Boolean.TRUE);
			marshaller.marshal(dataTransaction(), System.out);

		} catch (JAXBException exception) {
			Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE,
					"marshallExample threw JAXBException", exception);
		}
	}

	public void unmarshallExample() {

	}

	public static void main(String[] args) {

		MainApp instance = new MainApp();
		instance.marshallExample();
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
