package com.google.heritances.service;

/* Hybrid Inheritance */

public class BankAccount {

	public String bank_name = "Indian Overseas Bank";
	public long account_number = 1234567890L;
	
	public void bankDetails() {
		System.out.println("Bank Name:"+bank_name);
		System.out.println("Account Number:"+account_number);
	}
}
