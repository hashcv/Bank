package com.valentyn_tymku.bank;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class IOXml  implements InputOutput {
	private static List<Customer> custs = Storage.custs;
	private static List<Account> accs = Storage.accs;
	
	public void read() throws IOException {
		try {
			File file = new File("customers.xml");
			File file1 = new File("accounts.xml");

			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
			custs.add(customer);

			jaxbContext = JAXBContext.newInstance(Account.class);
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Account account = (Account) jaxbUnmarshaller.unmarshal(file1);
			accs.add(account);

		} catch (JAXBException exception) {
			Logger.getLogger(App.class.getName()).log(Level.SEVERE,
					"marshallExample threw JAXBException", exception);
		}
		ConsoleMenu.printMainMenu();
	}
	public void write() throws IOException {
		try {
			File fileCustomers = new File("customersW.xml");
			File fileAccounts = new File("accountsW.xml");
			
			for (Customer cust : custs) {
				JAXBContext context = JAXBContext.newInstance(Customer.class);
				Marshaller marshaller = context.createMarshaller();
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
						Boolean.TRUE);
				marshaller.marshal(cust, fileCustomers);
			}

			for (Account acc : accs) {
				JAXBContext context = JAXBContext.newInstance(Account.class);
				Marshaller marshaller = context.createMarshaller();
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
						Boolean.TRUE);
				marshaller.marshal(acc, fileAccounts);
			}

		} catch (JAXBException exception) {
			Logger.getLogger(App.class.getName()).log(Level.SEVERE,
					"marshallExample threw JAXBException", exception);
		}
		ConsoleMenu.printMainMenu();
	}

}
