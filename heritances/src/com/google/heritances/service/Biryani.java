package com.google.heritances.service;

/* Hierarchical Inheritance */

public class Biryani extends Food{
	
	public String taste = "Good";
	public int price = 400;
	
	public void aboutBiryani() {
		System.out.println("Biryani Taste:"+taste);
		System.out.println("Biryani Price:"+price);
	}

}
