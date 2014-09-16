package com.valentyn_tymku.bank;

import java.util.Date;

public class Transaction extends Util{
	private long id;
	private Date date;
	private Account srcAccount;
	private Account dstAccount;
	private double sum;
	
	public Transaction(Account srcAccount, Account dstAccount,
			double sum) {
		super();
		this.id = GenerateID();
		this.date = new Date();
		this.srcAccount = srcAccount;
		this.dstAccount = dstAccount;
		this.sum = sum;
		
		if ((srcAccount.getDebit()+srcAccount.getCreditLimit())>=sum){
			try{
				srcAccount.setDebit(srcAccount.getDebit()-sum);
				dstAccount.setDebit(dstAccount.getDebit()+sum);
			}finally{}
		}else{
			System.out.println("No enough money!");
		}
	}
	
	public long getId() {
		return id;
	}
	public Account getSrcAccount() {
		return srcAccount;
	}
	public Account getDstAccount() {
		return dstAccount;
	}
	public double getSum() {
		return sum;
	}

	public Date getDate() {
		return date;
	}

	
	
}
