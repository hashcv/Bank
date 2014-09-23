package com.valentyn_tymku.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hash
 *
 */
public class ConsoleMenu {
	private static InputOutput obj;

	/**
	 * @throws IOException
	 */
	public static void printInputMenu() throws IOException {
		System.out.println("What is input destination?");
		System.out.println("1. Console.");
		System.out.println("2. Text file.");
		System.out.println("3. XML file.");
		System.out.println("4. SQL database.");
		System.out.print("Choose one: ");

		BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
		String tIn = r1.readLine();

		switch (Integer.valueOf(tIn)) {
		case 1:
			obj = new IOConsole();
			break;
		case 2:
			obj = new IOTxt();
			break;
		case 3:
			obj = new IOXml();
			break;
		case 4:
			obj = new IODatabase();
			break;
		}
		obj.read();
		ConsoleMenu.printMainMenu();
	}

	/**
	 * @throws IOException
	 */
	public static void printOutputMenu() throws IOException {

		System.out.println("What is output destination?");
		System.out.println("1. Console.");
		System.out.println("2. Text file.");
		System.out.println("3. XML file.");
		System.out.println("4. SQL database.");
		System.out.print("Choose one: ");

		BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
		String tIn = r1.readLine();

		switch (Integer.valueOf(tIn)) {
		case 1:
			obj = new IOConsole();
			break;
		case 2:
			obj = new IOTxt();
			break;
		case 3:
			obj = new IOXml();
			break;
		case 4:
			obj = new IODatabase();
			break;
		}
		obj.write();
		ConsoleMenu.printMainMenu();
	}

	/**
	 * @throws IOException
	 */
	public static void printMainMenu() throws IOException {
		System.out.println("What do you want to do?");
		System.out.println("1. Input.");
		System.out.println("2. Output.");
		System.out.print("Choose one: ");

		BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
		String tIn = r1.readLine();

		switch (Integer.valueOf(tIn)) {
		case 1:
			printInputMenu();
			break;
		case 2:
			printOutputMenu();
			break;
		}
	}
}
