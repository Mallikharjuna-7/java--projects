package com.xworkz.collection.runner;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMethods {

	public static void main(String[] args) {

		Set<String> fruits = new LinkedHashSet<String>();

		// add
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Guava");
		fruits.add("Banana");
		fruits.add("Mango");

		// for Each
		System.out.println("Fruits :");
		fruits.forEach(f -> System.out.println(f));

		Set<String> newFruits = new LinkedHashSet<String>();

		newFruits.add("Pineapple");
		newFruits.add("Papaya");
		newFruits.add("Dragon Fruit");

		// add all
		fruits.addAll(newFruits);
		System.out.println("After add all :" + fruits);

		// contains
		boolean isContainOrange = fruits.contains("Orange");
		System.out.println("isContain Orange :" + isContainOrange);

		// contains all
		boolean isContainAllNewFruits = fruits.containsAll(newFruits);
		System.out.println("isContain All newFruits :" + isContainAllNewFruits);

		// size
		System.out.println("size :" + fruits.size());

		// isEmpty
		System.out.println("is Empty :" + fruits.isEmpty());

		// equals
		boolean isEqual = fruits.equals(newFruits);
		System.out.println("isEqual to newFruits :" + isEqual);

		// getClass
		System.out.println("get Class :" + fruits.getClass());

		// hashCode
		int hashcode = fruits.hashCode();
		System.out.println("hashCode :" + hashcode);

		// toArray
		Object[] fruitsArray = fruits.toArray();
		System.out.println(" Array :");
		for (Object fruit : fruitsArray) {
			System.out.println(fruit);
		}

		// toString
		String toString = fruits.toString();
		System.out.println("toString :" + toString);

		// remove
		fruits.remove("Guava");
		System.out.println("after remove Guava :" + fruits);

		// remove all
		fruits.removeAll(newFruits);
		System.out.println("after remove all newFruits :" + fruits);

		// clear
		fruits.clear();
		System.err.println("after clear :" + fruits);
	}

}
