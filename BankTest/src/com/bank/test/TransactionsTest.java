package com.bank.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bank.AccountTypes;
import com.bank.Accounts;
import com.bank.Bank;
import com.bank.TransactionsImpl;
import com.bank.functions.Transactions;


public class TransactionsTest {
	Transactions transaction;
	Accounts accounts;
	
	

	@Before
	public void setUp() throws Exception {
		 transaction = new TransactionsImpl();
		 accounts = new Accounts();
		 createDefaultAccount();
		 
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testAddAccount() {
		
		transaction.addAccount("Bofa", "Rajendra", "checking", 1000, accounts,1234);
		
		assertEquals(4, accounts.getAccounts().size());
		
		transaction.addAccount("Bofa", "Ravi", "checking", 1000, accounts,2345);
		transaction.addAccount("Bofa", "Rahul", "investorIndivual", 1000, accounts,3456);
		transaction.addAccount("Bofa", "Ajay", "investorCorporate", 1000, accounts, 5678);
		//fail("Not yet implemented");
		assertEquals(7, accounts.getAccounts().size());
	}

	
	@Test
	public void testDeposit() {
		
		//fail("Not yet implemented");
		transaction.deposit(0002, 1000, accounts);
		assertEquals(1700, accounts.getAccountsMap().get(0002).getAcctBal());
	}
	
	
	private void createDefaultAccount(){
		Bank b = new Bank();
		Bank b1 = new Bank();
		Bank b3 = new Bank();
		b1.setAcctBal(500);
		b1.setAcctNumber(0001);
		b1.setAcctOwner("Ramesh");
		b1.setAcctType(AccountTypes.CHECKING_ACCOUNT);
		b1.setName("Bofa");
		b.setAcctBal(700);
		b.setAcctNumber(0002);
		b.setAcctOwner("Roy");
		b.setAcctType(AccountTypes.INVESTMENT_INDIVIDUAL_ACCOUNT);
		b.setName("Bofa");
		b3.setAcctBal(500);
		b3.setAcctNumber(0003);
		b3.setAcctOwner("John");
		b3.setAcctType(AccountTypes.INVESTMENT_INDIVIDUAL_CORPORATE);
		b3.setName("Bofa");
		accounts.getAccounts().add(b);
		accounts.getAccounts().add(b1);
        accounts.getAccounts().add(b3);
        accounts.getAccountsMap().put(001, b1);
        accounts.getAccountsMap().put(002, b);
        accounts.getAccountsMap().put(003, b3);


	}
}
