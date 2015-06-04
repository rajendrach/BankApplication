package com.bank;

public class Bank {
	
	private String Name;
	private String AcctType;
	private String AcctOwner;
	private int AcctBal;
	private int AcctNumber;
	
	public int getAcctNumber() {
		return AcctNumber;
	}
	public void setAcctNumber(int acctNumber) {
		AcctNumber = acctNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAcctType() {
		return AcctType;
	}
	public void setAcctType(String acctType) {
		AcctType = acctType;
	}
	public String getAcctOwner() {
		return AcctOwner;
	}
	public void setAcctOwner(String acctOwner) {
		AcctOwner = acctOwner;
	}
	public int getAcctBal() {
		return AcctBal;
	}
	public void setAcctBal(int acctBal) {
		AcctBal = acctBal;
	}

}
