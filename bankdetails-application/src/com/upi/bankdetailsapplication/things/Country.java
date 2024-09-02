package com.upi.bankdetailsapplication.things;

public class Country extends Object {

	private String coutry_name;
	private String pm_name;
	private int no_of_states;
	private String independence;
	
	public Country() {
		System.out.println("No argument constructor of Country");
	}
	public Country(String country_name,String pm_name,int no_of_states,String independence) {
		this.coutry_name = country_name;
		this.pm_name = pm_name;
		this.no_of_states = no_of_states;
		this.independence = independence;
	}
	
	public void setCountryName(String country_name) {
		this.coutry_name = country_name;
	}
	public String getCountryName() {
	return this.coutry_name;
	}
	public void setPmName(String pm_name) {
	this.pm_name = pm_name;
	}
	public String getPmName() {
	return this.pm_name;
	}
	public void setStates(int no_of_states) {
	this.no_of_states = no_of_states;
	}
	public int getStates() {
	return this.no_of_states;
	}
	public void setIndependenceDay(String independence) {
	this.independence = independence;
	}
	public String getIndependenceDay() {
	return this.independence;
	}
	
	/* Over riding Object class*/
	public String toString() {
	return "Country Details:"+"  Country Name"+this.coutry_name+"  PM Name:"+this.pm_name+
			"  No of States:"+this.no_of_states+"  Independence Day:"+this.independence;
	}
	
}
