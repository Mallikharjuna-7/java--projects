package com.xworkz.collection.runner;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMethods {

	public static void main(String[] args) {

		Set<String> shirtBrands = new TreeSet<String>();

		// add
		shirtBrands.add("Gucci");
		shirtBrands.add("Rare Rabbit");
		shirtBrands.add("Allen Solly");
		shirtBrands.add("Van Heusen");
		shirtBrands.add("Peter England");

		// for Each
		System.out.println("Shirt Brands :");
		shirtBrands.forEach(s -> System.out.println(s));

		Set<String> newShirtBrands = new TreeSet<String>();

		newShirtBrands.add("US Polo");
		newShirtBrands.add("Levi's");
		newShirtBrands.add("Louis Philippe");
		newShirtBrands.add("Roadster");

		// add all
		shirtBrands.addAll(newShirtBrands);
		System.out.println("after adding all :" + shirtBrands);

		// contains
		boolean isContainPE = shirtBrands.contains("Peter England");
		System.out.println("isContain Peter England :" + isContainPE);

		// contains all
		boolean isContainAllShirtBrands = shirtBrands.containsAll(newShirtBrands);
		System.out.println("isContain All newShirtBrands :" + isContainAllShirtBrands);

		// size
		System.out.println("size :" + shirtBrands.size());

		// isEmpty
		System.out.println("is Empty :" + shirtBrands.isEmpty());

		// equals
		boolean isEqual = shirtBrands.equals(newShirtBrands);
		System.out.println("isEqual to newShirtBrands :" + isEqual);

		// getClass
		System.out.println("get Class :" + shirtBrands.getClass());

		// hashCode
		int hashcode = shirtBrands.hashCode();
		System.out.println("hashCode :" + hashcode);

		// toArray
		Object[] shirtsArray = shirtBrands.toArray();
		System.out.println(" Array :");
		for (Object shirt : shirtsArray) {
			System.out.println(shirt);
		}

		// toString
		String toString = shirtBrands.toString();
		System.out.println("toString :" + toString);

		// remove
		shirtBrands.remove("Allen Solly");
		System.out.println("after remove Allen Solly :" + shirtBrands);

		// remove all
		shirtBrands.removeAll(newShirtBrands);
		System.out.println("after remove all newShirtBrands :" + shirtBrands);

		// clear
		shirtBrands.clear();
		System.err.println("after clear :" + shirtBrands);

	}

}
