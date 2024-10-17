package com.xworkz.collection.runner;

import java.util.HashSet;
import java.util.Set;

public class HashSetMethods {

	public static void main(String[] args) {

		Set<String> heros = new HashSet<String>();

		// add
		heros.add("Pawam Kalyan");
		heros.add("Prabhas");
		heros.add("Ram Charan");
		heros.add("NTR");
		heros.add("Allu Arjun");

		// forEach
		System.out.println("Heros :");
		heros.forEach(h -> System.out.println(h));

		Set<String> newHeros = new HashSet<String>();

		newHeros.add("Vijay Devarakonda");
		newHeros.add("Mahesh Babu");
		newHeros.add("Viswak Sen");

		// add all
		heros.addAll(newHeros);
		System.out.println("After adding newHeros :" + heros);

		// contains
		boolean isContainNTR = heros.contains("NTR");
		System.out.println("isContain NTR :" + isContainNTR);

		// contains all
		boolean isContainAllNewHeros = heros.containsAll(newHeros);
		System.out.println("isContain All newHeros :" + isContainAllNewHeros);

		// size
		System.out.println("size :" + heros.size());

		// isEmpty
		System.out.println("is Empty :" + heros.isEmpty());

		// equals
		boolean isEqual = heros.equals(newHeros);
		System.out.println("isEqual to newHeros :" + isEqual);

		// getClass
		System.out.println("get Class :" + heros.getClass());

		// hashCode
		int hashcode = heros.hashCode();
		System.out.println("hashCode :" + hashcode);

		// toArray
		Object[] herosArray = heros.toArray();
		System.out.println(" Array :");
		for (Object hero : herosArray) {
			System.out.println(hero);
		}

		// toString
		String toString = heros.toString();
		System.out.println("toString :" + toString);

		// remove
		heros.remove("Allu Arjun");
		System.out.println("after remove AA :" + heros);

		// remove all
		heros.removeAll(newHeros);
		System.out.println("after remove all newHeros :" + heros);

		// clear
		heros.clear();
		System.err.println("after clear :" + heros);

	}

}
