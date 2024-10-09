package com.xworkz.programmingtasks.runner;

import java.util.Arrays;
import java.util.Collections;

public class Products {

	public static void main(String[] args) {

		String[] products = { "Laptop", "Shoes", "Bag", "Xbox", "Mixer" };

		// Sort the array in descending order
		Arrays.sort(products, Collections.reverseOrder());

		// Print the sorted product names
		System.out.println("Products in descending order:");
		for (String product : products) {
			System.out.println(product);
		}
	}

}
