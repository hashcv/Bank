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

/**
 * @author hash
 *
 */
public class IOXml  implements InputOutput {
	private static Storage storage = Storage.getInstance();
	
	private static List<Customer> custs = storage.getCusts();
	private static List<Account> accs = storage.getAccs();
	private static Settings settings = new Settings();
	private static File fileOutputXML = new File(settings.getOutputXml());
	private static File fileInputXML = new File(settings.getInputXml());
	
	/* (non-Javadoc)
	 * @see com.valentyn_tymku.bank.InputOutput#read()
	 */
	public void read() throws IOException {
		try {
			Storage stor = (Storage) unmarshalIt(Storage.class, fileInputXML);
			stor.printAll();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
/*		try {
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
		}*/

	}
	/* (non-Javadoc)
	 * @see com.valentyn_tymku.bank.InputOutput#write()
	 */
	public void write() throws IOException {
		
		try {
			marshalIt(storage);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*try {
			File fileCustomers = new File("customersW.xml");
			File fileAccounts = new File("accountsW.xml");
			
			//for (Customer cust : custs) {
				JAXBContext context = JAXBContext.newInstance(Storage.class);
				Marshaller marshaller = context.createMarshaller();
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
						Boolean.TRUE);
				marshaller.marshal(Storage.custs, fileCustomers);
			//}

		//	for (Account acc : accs) {
			//	context = JAXBContext.newInstance(Account.class);
			//	marshaller = context.createMarshaller();
			//	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
			//			Boolean.TRUE);
			//	marshaller.marshal(accs, fileAccounts);
			//}

		} catch (JAXBException exception) {
			Logger.getLogger(App.class.getName()).log(Level.SEVERE,
					"marshallExample threw JAXBException", exception);
		}
*/
	}
	
	public static void marshalIt(Object objectName) throws JAXBException {
		 
		JAXBContext jaxbContext = JAXBContext.newInstance(objectName.getClass());
		Marshaller marshaller = jaxbContext.createMarshaller();
 
		// For Pretty printing output
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
		
		marshaller.marshal(objectName, fileOutputXML);
 
		//return writer.toString();
 
	}
 
	public static Object unmarshalIt(Class<?> className, File inputFile) throws JAXBException {
 
		JAXBContext jaxbContext = JAXBContext.newInstance(className);
 
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
 
		return unmarshaller.unmarshal(fileInputXML);
 
	}

}
