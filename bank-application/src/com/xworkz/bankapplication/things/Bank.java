package com.xworkz.bankapplication.things;

public class Bank {
	
	private String bank_name;
	private String account_holder_name;
	private long account_number;
	private long adhar_number;
	private double bank_balance;
	private double withdraw;
	
	public Bank() {
	System.out.println("BANK APPLICATION:");
	}
	public Bank(String bank_name,String account_holder_name,long account_number,long adhar_number,double bank_balance,double withdraw) {
	this.bank_name = bank_name;
	this.account_holder_name = account_holder_name;
	this.account_number = account_number;
	this.adhar_number = adhar_number;
	this.bank_balance = bank_balance;
	this.withdraw = withdraw;
	}
	
	public void setBankName(String bank_name) {
	this.bank_name = bank_name;
	}
	public String getBankName() {
	return this.bank_name;
	}
	public void setAccountHolderName(String account_holder_name) {
	this.account_holder_name = account_holder_name;
	}
	public String getAccountHolderName() {
	return this.account_holder_name;
	}
	public void setAccountNumber(long account_number) {
	this.account_number = account_number;
	}
	public long getAccountNumber() {
	return this.account_number;
	}
	public void setAdharNumber(long adhar_number) {
	this.adhar_number = adhar_number;
	}
	public long getAdharNumber() {
	return this.adhar_number;
	}
	public void setBankBalance(double bank_balance) {
	this.bank_balance = bank_balance;
	}
	public double getBankBalance() {
	return this.bank_balance;
	}
	public void setWithdraw(double withdraw) {
	this.withdraw = withdraw;
	}
	public double getWithdraw() {
	return this.withdraw;
	}
	
	
	public void checkAccountNumber(long anumb) {
		System.out.println("-------------------------");
		int length = String.valueOf(anumb).length();
		if(length == 10) {
		System.out.println("Account Number is verified");
		System.out.println("Account Holder Name: "+this.account_holder_name);
		System.out.println("Bank Name: "+this.bank_name);
		}else {
		System.out.println("Account Number is Incorrect");
		}
	}
	public void checkAdharNumber() {
		int length = String.valueOf(this.adhar_number).length();
		if(length == 10) {
		System.out.println("Adhar Number Verified Successfully");
		}else {
		System.out.println("Adhar Number is Invalid");
		}
	}
	public void checkBalance() {	
		if( this.bank_balance < 500 ) {
		System.out.println("please maintain minimum bank balance");
			
			if(this.bank_balance < this.withdraw ) {
			System.out.println("Account balance is low, you can't withdraw amount");
			}else {
			double remaining_balance = this.bank_balance - this.withdraw;
			System.out.println("Withdrawal "+this.withdraw+" Successfull");
			System.out.println("Remaining Balance: "+remaining_balance);
			}
		
		}else if(this.bank_balance > 500 && this.bank_balance < 10000 ) {
		double intrest_10 = this.bank_balance*0.1;
		System.out.println("10% intrest: "+intrest_10);
		double total_10 = this.bank_balance+intrest_10;
		System.out.println("Total Bank Balance: "+total_10);
		
			if(this.bank_balance < this.withdraw ) {
			System.out.println("Account balance is low, you can't withdraw amount");
			}else {
			double remaining_balance = total_10 - this.withdraw;
			System.out.println("Withdrawal "+this.withdraw+" Successfull");
			System.out.println("Remaining Balance: "+remaining_balance);
			}
		
		}else if(this.bank_balance > 10000 && this.bank_balance < 50000 ) {
		double intrest_20 = this.bank_balance*0.2;
		System.out.println("20% intrest: "+intrest_20);
		double total_20 = this.bank_balance+intrest_20;
		System.out.println("Total Bank Balance: "+total_20);
		
			if(this.bank_balance < this.withdraw ) {
			System.out.println("Account balance is low, you can't withdraw amount");
			}else {
			double remaining_balance = total_20 - this.withdraw;
			System.out.println("Withdrawal "+this.withdraw+" Successfull");
			System.out.println("Remaining Balance: "+remaining_balance);
			}
		
		}else if(this.bank_balance >= 50000 ) {
		double intrest_25 = this.bank_balance*0.25;
		System.out.println("25% intrest: "+intrest_25);
		double total_25 = this.bank_balance+intrest_25;
		System.out.println("Total Bank Balance: "+total_25);
		
			if(this.bank_balance < this.withdraw ) {
			System.out.println("Account balance is low, you can't withdraw amount");
			}else {
			double remaining_balance = total_25 - this.withdraw;
			System.out.println("Withdrawal "+this.withdraw+" Successfull");
			System.out.println("Remaining Balance: "+remaining_balance);
			}
		}
	}
}
