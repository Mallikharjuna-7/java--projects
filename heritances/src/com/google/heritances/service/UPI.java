package com.google.heritances.service;

/* Hybrid Inheritance */

public class UPI extends BankAccount implements GooglePay , PhonePay {
	
	public int upi_pin = 1234;

	@Override
	public void aboutPhonePay() {
		System.out.println("Name:"+p_name);
		System.out.println("Upi Id"+p_upi_id);	
	}

	@Override
	public void aboutGooglePay() {
		System.out.println("Name:"+g_name);
		System.out.println("Upi Id"+g_upi_id);
	}
	public void abouUPI() {
		System.out.println("UPI Pin:"+upi_pin);
	}

}
