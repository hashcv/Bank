package com.valentyn_tymku.bank;

import java.util.Random;

public class Util {

	public final static String delim = "|";
	public final static String readDelim = "\\|";
	

	public static long GenerateID() {
		Random rand = new Random();
		return Math.abs(rand.nextLong());
	}

}
