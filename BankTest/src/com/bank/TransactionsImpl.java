package com.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.bank.functions.Transactions;

public class TransactionsImpl implements Transactions {
	//Accounts account = new Accounts();
	AccountTypes acctTypes = new AccountTypes();
	//private List<Bank> accounts = new ArrayList<Bank>();
	//private Map<Integer, Bank> accountsMap = new HashMap<Integer,Bank>();
	
	@Override
	public Bank retrieveAcctDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addAccount(String name, String AcctOwner, String AcctType,
			int depositAmount, Accounts account, int acctNumber) {
		//account.addAccount(name, AcctOwner, AcctType, depositAmount);
       Bank newAccount = 	new Bank();
       newAccount.setName(name);
       newAccount.setAcctOwner(AcctOwner);
       if("checking".equals(AcctType)){
       newAccount.setAcctType(acctTypes.CHECKING_ACCOUNT);
       }else if("investorIndivual".equals(AcctType)){
           newAccount.setAcctType(acctTypes.INVESTMENT_INDIVIDUAL_ACCOUNT);  
       }else if("investorCorporate".equals(AcctType)){
           newAccount.setAcctType(acctTypes.INVESTMENT_INDIVIDUAL_CORPORATE);
       }
       newAccount.setAcctBal(depositAmount);
       //Random randomGenerator = new Random();
       //int randomInt = randomGenerator.nextInt(2000000000);
       newAccount.setAcctNumber(acctNumber);
       //account.getAccountNumbers().add(randomInt);
       account.getAccounts().add(newAccount);
       account.getAccountsMap().put(acctNumber, newAccount);
	}

	/*public List<Bank> getAccounts() {
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
	}*/


	@Override
	public String deposit(int acctNumber, int amount,Accounts accounts) {
		Bank bank = accounts.getAccountsMap().get(acctNumber);
		if(bank !=null){
		int newAmount = bank.getAcctBal() + amount;
		bank.setAcctBal(newAmount);
		return "Success : Deposit of"+amount+" is completed";
		}else{
			return "Failure: No Account Found";
		}
		// TODO Auto-generated method stub

	}

	@Override
	public String transfer(int fromAcctNumber, int toAcctNumber, int amount, Accounts accounts) {
		Bank fromAcct = accounts.getAccountsMap().get(fromAcctNumber);
		Bank toAcct = accounts.getAccountsMap().get(toAcctNumber);
		if(fromAcct != null && toAcct != null){
			if(fromAcct.getAcctBal()< amount){
				return "Failure : No Sufficient Funds";
			}else{
				int newfromAcctBal = fromAcct.getAcctBal() - amount;
				int newtoAcctBal = toAcct.getAcctBal() + amount;
				toAcct.setAcctBal(newtoAcctBal);
				fromAcct.setAcctBal(newfromAcctBal);
				return "Success";
			}
		}else{
		return "Failure : Either From Acct or To Acct doesnt exist";
		}
		// TODO Auto-generated method stub

	}

	@Override
	public String withdraw(int acctNumber, int amount, Accounts accounts) {
		// TODO Auto-generated method stub
		Bank bank = accounts.getAccountsMap().get(acctNumber);
		if(bank.getAcctType().equals("checking") || bank.getAcctType().equals("investmentIndividual"))
		{
			if (amount> 500){
				return "Failure:Amount Should Not Exceed 500 for an individual account ";
				//Exception e = new Exception("Amount Should Not Exceed 500 for an individual account");
				//throw e;
			}else{
				if(bank.getAcctBal() < amount){
					return "Failure : No Sufficient Funds";
				}else{
				int newBalance = bank.getAcctBal() - amount;
				bank.setAcctBal(newBalance);
				return "Success";
				}
			}
		}
		if(bank.getAcctBal() < amount){
			return "Failure : No Sufficient Funds";
		}else{
		int newBalance = bank.getAcctBal() - amount;
		bank.setAcctBal(newBalance);
		return "Success";
		}
		

	}


	
}
