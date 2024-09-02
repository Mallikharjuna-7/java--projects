package com.google.heritances.runner;
import com.google.heritances.service.Biryani;
import com.google.heritances.service.FriedRice;

/* Hierarchical Inheritance */

public class FoodRunner {

	public static void main(String[] args) {
		
		Biryani biryani = new Biryani();
		biryani.details();
		biryani.aboutBiryani();
		
		FriedRice friedrice = new FriedRice();
		friedrice.details();
		friedrice.aboutFriedRice();

	}

}
