package com.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Accounts {
	private List<Bank> accounts = new ArrayList<Bank>();
	private List<Integer> accountNumbers = new ArrayList<Integer>();
	public List<Integer> getAccountNumbers() {
		return accountNumbers;
	}
	public void setAccountNumbers(List<Integer> accountNumbers) {
		this.accountNumbers = accountNumbers;
	}
	private Map<Integer, Bank> accountsMap = new HashMap<Integer,Bank>();
	public List<Bank> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Bank> accounts) {
		this.accounts = accounts;
	}
	public Map<Integer, Bank> getAccountsMap() {
		return accountsMap;
	}
	public void setAccountsMap(Map<Integer, Bank> accountsMap) {
		this.accountsMap = accountsMap;
	} 
	
	/*public void addAccount(String name, String AcctOwner, String AcctType,
			int depositAmount) {
       Bank newAccount = 	new Bank();
       newAccount.setName(name);
       newAccount.setAcctOwner(AcctOwner);
       newAccount.setAcctType(AcctType);
       newAccount.setAcctBal(depositAmount);
       Random randomGenerator = new Random();
       int randomInt = randomGenerator.nextInt(2000000000);
       newAccount.setAcctNumber(randomInt);
       accounts.add(newAccount);
       accountsMap.put(randomInt, newAccount);
	}*/
}
