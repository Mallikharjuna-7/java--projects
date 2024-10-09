package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionRunner {

	public static void main(String[] args) {

		Collection<String> stateNames = new ArrayList<String>();
		stateNames.add("Maharashtra");
		stateNames.add("Tamil Nadu");
		stateNames.add("Karnataka");
		stateNames.add("Uttar Pradesh");
		stateNames.add("Gujarat");
		stateNames.add("West Bengal");
		stateNames.add("Rajasthan");
		stateNames.add("Andhra Pradesh");
		stateNames.add("Telangana");
		stateNames.add("Bihar");
		stateNames.add("Kerala");
		stateNames.add("Odisha");
		stateNames.add("Punjab");
		stateNames.add("Haryana");
		stateNames.add("Assam");
		System.out.println("Names :"+stateNames);
		System.out.println("size :"+stateNames.size());
		
		Collection<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        System.out.println("Numbers :"+numbers);
		System.out.println("size :"+numbers.size());
		
		Collection<Byte> footSizes = new ArrayList<Byte>();
		footSizes.add((byte) 6);
        footSizes.add((byte) 7);
        footSizes.add((byte) 8);
        footSizes.add((byte) 9);
        footSizes.add((byte) 10);
        footSizes.add((byte) 11);
        footSizes.add((byte) 12);
        footSizes.add((byte) 13);
        footSizes.add((byte) 5);
        footSizes.add((byte) 14);
        footSizes.add((byte) 15);
        footSizes.add((byte) 4);
        footSizes.add((byte) 3);
        footSizes.add((byte) 2);
        footSizes.add((byte) 1);
        System.out.println("FootSizes :"+footSizes);
		System.out.println("size :"+footSizes.size());
		
		Collection<Short> shirtSizes = new ArrayList<Short>();
		shirtSizes.add((short) 34);
        shirtSizes.add((short) 36);
        shirtSizes.add((short) 38);
        shirtSizes.add((short) 40);
        shirtSizes.add((short) 42);
        shirtSizes.add((short) 44);
        shirtSizes.add((short) 46);
        shirtSizes.add((short) 48);
        shirtSizes.add((short) 50);
        shirtSizes.add((short) 52);
        shirtSizes.add((short) 54);
        shirtSizes.add((short) 56);
        shirtSizes.add((short) 58);
        shirtSizes.add((short) 60);
        shirtSizes.add((short) 62);
        System.out.println("Shirt Sizes :"+shirtSizes);
		System.out.println("size :"+shirtSizes.size());
		
		Collection<Double> ratings = new ArrayList<Double>();
		ratings.add(4.5);
        ratings.add(3.8);
        ratings.add(5.0);
        ratings.add(4.2);
        ratings.add(3.6);
        ratings.add(4.9);
        ratings.add(2.5);
        ratings.add(4.0);
        ratings.add(3.0);
        ratings.add(4.7);
        ratings.add(4.1);
        ratings.add(3.9);
        ratings.add(5.0);
        ratings.add(2.8);
        ratings.add(4.6);
        System.out.println("Ratings :"+ratings);
		System.out.println("size :"+ratings.size());
		
		Collection<Float> prices = new ArrayList<Float>();
		prices.add(19.99f);
        prices.add(29.49f);
        prices.add(15.75f);
        prices.add(45.00f);
        prices.add(99.99f);
        prices.add(12.50f);
        prices.add(5.99f);
        prices.add(39.99f);
        prices.add(25.00f);
        prices.add(75.49f);
        prices.add(59.99f);
        prices.add(22.30f);
        prices.add(88.80f);
        prices.add(10.00f);
        prices.add(37.50f);
        System.out.println("Prices :"+prices);
		System.out.println("size :"+prices.size());
		
		Collection<Long> phoneNumbers = new ArrayList<Long>();
		phoneNumbers.add(1234567890L);
        phoneNumbers.add(9876543210L);
        phoneNumbers.add(5551234567L);
        phoneNumbers.add(4449876543L);
        phoneNumbers.add(2223334444L);
        phoneNumbers.add(1112223333L);
        phoneNumbers.add(8887776666L);
        phoneNumbers.add(3334445555L);
        phoneNumbers.add(6665554444L);
        phoneNumbers.add(7778889999L);
        phoneNumbers.add(1231231234L);
        phoneNumbers.add(4564564567L);
        phoneNumbers.add(7897897890L);
        phoneNumbers.add(1010101010L);
        phoneNumbers.add(2020202020L);
        System.out.println("PhoneNumbers :"+phoneNumbers);
		System.out.println("size :"+phoneNumbers.size());
		
		Collection<Character> characters = new ArrayList<Character>();
		characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');
        characters.add('F');
        characters.add('G');
        characters.add('H');
        characters.add('I');
        characters.add('J');
        characters.add('K');
        characters.add('L');
        characters.add('M');
        characters.add('N');
        characters.add('O');
        System.out.println("Characters :"+characters);
		System.out.println("size :"+characters.size());
	}

}
