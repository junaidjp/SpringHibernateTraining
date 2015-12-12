package com.bank.entity;

public class Account  {
	
	int accountid;
	public String accountno; 
	public String accountType; 
	public double balance;
	public String accountHolderName;

	
	
	
	public int getAccountid() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	
	public String getAccountno() {
		return accountno;
	}

	

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


}
