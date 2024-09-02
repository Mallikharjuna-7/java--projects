package com.upi.bankdetailsapplication.runner;
import com.upi.bankdetailsapplication.things.Location;

public class CountryRunner {

	public static void main(String[] args) {
		
		Location map = new Location();
		System.out.println("Country Name:"+map.getCountryName());
		System.out.println("PM Name:"+map.getPmName());
		System.out.println("No Of States:"+map.getStates());
		System.out.println("Independence Day:"+map.getIndependenceDay());
		
		System.out.println(map.toString());
	}

}
