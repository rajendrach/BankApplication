package com.bank.functions;

import com.bank.Accounts;
import com.bank.Bank;

public interface Transactions {
public void addAccount(String name, String AcctOwner, String AcctType, int depositAmount, Accounts accounts, int AcctNumber);
public Bank retrieveAcctDetails();
public String deposit(int acctNumber, int amount, Accounts accounts);
public String transfer(int fromAcctNumber, int toAcctNumber,int amount, Accounts accounts);
public String withdraw(int acctNumber, int amount, Accounts accounts );
}
