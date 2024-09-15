package com.xworkz.interfaces.service;

public class BankDetails implements Bank {

	@Override
	public void bankDetails() {
		System.out.println("Bank Name: "+Bank.bankName);
		System.out.println("Location: "+Bank.location);	
	}

	@Override
	public void customerDetails() {
		System.out.println("Customer Name: "+Bank.customerName);
		System.out.println("Account No: "+Bank.accountNo);
	}

	@Override
	public void balanceEnquery() {
		System.out.println("Account Balance: "+Bank.accountBalance);
	}

}
