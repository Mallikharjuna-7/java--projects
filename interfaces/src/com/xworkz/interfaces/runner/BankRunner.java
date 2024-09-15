package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.service.Bank;
import com.xworkz.interfaces.service.BankDetails;

public class BankRunner {

	public static void main(String[] args) {
		
		Bank bank = new BankDetails();
		
		bank.bankDetails();
		bank.customerDetails();
		bank.balanceEnquery();

	}

}
