package com.xworkz.bankapplication.runner;

import com.xworkz.bankapplication.things.Bank;

public class BankRunner {

	public static void main(String[] args) {
	
	Bank bank = new Bank();
	
	bank.setBankName("Indian Overseas Bank");
	bank.setAccountHolderName("Mallikharjuna");
	bank.setAccountNumber(1233770000L);
	bank.setAdharNumber(9951732400L);
	bank.setBankBalance(8000.0);
	bank.setWithdraw(1000.0);
	
	System.out.println("Bank Name: "+bank.getBankName());
	System.out.println("Account Holder Name: "+bank.getAccountHolderName());
	System.out.println("Account Number: "+bank.getAccountNumber());
	System.out.println("Adhar Number: "+bank.getAdharNumber());
	System.out.println("Bank Balance: "+bank.getBankBalance());
	
	bank.checkAccountNumber(bank.getAccountNumber());
	bank.checkAdharNumber();
	bank.checkBalance();

	}

}
