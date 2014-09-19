package com.valentyn_tymku.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

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
			Input.readConsole();
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
		  System.out.println("4. SQL datavase.");
		  System.out.print("Choose one: ");
		  
		  BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
			String tIn = r1.readLine();

			switch (Integer.valueOf(tIn)) {
			case 1:
				Input.readConsole();
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
		  
		 // switch (Integer.valueOf(tOut)) { case 1: instance.out(Dst.SOUT);
		  //break; case 2: instance.out(Dst.TXT); break; case 3:
		  //instance.out(Dst.XML); break; }
		 
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
