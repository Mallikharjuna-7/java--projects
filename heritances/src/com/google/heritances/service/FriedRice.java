package com.google.heritances.service;

/* Hierarchical Inheritance */

public class FriedRice extends Food{

	public String taste = "Average";
	public int price = 120;
	
	public void aboutFriedRice() {
		System.out.println("FriedRice Taste:"+taste);
		System.out.println("FriedRice Price:"+price);
	}
}
