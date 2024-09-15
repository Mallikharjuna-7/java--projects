package com.xworkz.interfaces.service;

public interface Bank {
	
	public static final String bankName = "ICICI Bank";
	public static final String location = "BTM";
	public static final String customerName = "Mallikharjun";
	public static final long accountNo = 99868576474L;
	public static final int accountBalance = 15000;
	

	//abstract methods
	void bankDetails();
	void customerDetails();
	void balanceEnquery();
}
