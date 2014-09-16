package com.valentyn_tymku.bank;

import java.util.Random;

public abstract class Util {

	public long GenerateID() {
		Random rand = new Random();
		return Math.abs(rand.nextLong());
	}

}
