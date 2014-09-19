package com.valentyn_tymku.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	
	Input obj = new InputTxt();

	public static void input() throws IOException {
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
			
			Input.read();
			break;
		case 2:
			Input.readTXT();
			break;
		case 3:
			Input.readXML();
			break;
		case 4:
			Input.readSQL();
			break;
		}
	}

	public static void output() throws IOException {

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
			Output.writeConsole();
			break;
		case 2:
			Output.writeTXT();
			break;
		case 3:
			Output.writeXML();
			break;
		case 4:
			Output.writeSQL();
			break;
		}
	}

	public static void main(String[] args) throws IOException {

		System.out.println("What do you want to do?");
		System.out.println("1. Input.");
		System.out.println("2. Output.");
		System.out.print("Choose one: ");

		BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
		String tIn = r1.readLine();

		switch (Integer.valueOf(tIn)) {
		case 1:
			input();
			break;
		case 2:
			output();
			break;
		}
	}

}
