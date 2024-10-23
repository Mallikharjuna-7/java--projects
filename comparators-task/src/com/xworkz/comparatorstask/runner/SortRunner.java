package com.xworkz.comparatorstask.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.comparatorstask.dto.LaptopsDto;

public class SortRunner {

	public static void main(String[] args) {

		// ArrayList
		List<String> names = new ArrayList<String>();
		names.add("Prajwal");
		names.add("Ganesh");
		names.add("Shashi");
		names.add("Rajesh");

		System.out.println("Names :" + names);

		// lambda expression
		Comparator<String> comparatorString1 = (String s1, String s2) -> s2.compareToIgnoreCase(s1);
		// sorting in descending order
		Collections.sort(names, comparatorString1);
		System.out.println("Sort in descending order :" + names);

		// lambda expression
		Comparator<String> comparatorString2 = (String s1, String s2) -> s1.compareToIgnoreCase(s2);
		// sorting in ascending order
		Collections.sort(names, comparatorString2);
		System.out.println("Sort in ascending order :" + names);

		System.out.println("-------------------------------------------------");

		// ArrayList
		List<Integer> number = new ArrayList<Integer>();
		number.add(10);
		number.add(6);
		number.add(1);
		number.add(3);
		number.add(9);
		number.add(5);

		System.out.println("Numbers :" + number);

		// lambda expression
		Comparator<Integer> comparatorNum1 = (Integer n1, Integer n2) -> n2.compareTo(n1);
		// sorting in descending order
		Collections.sort(number, comparatorNum1);
		System.out.println("Sort in descending order :" + number);

		// lambda expression
		Comparator<Integer> comparatorNum2 = (Integer n1, Integer n2) -> n1.compareTo(n2);
		// sorting in ascending order
		Collections.sort(number, comparatorNum2);
		System.out.println("Sort in ascending order :" + number);

		// sum using lambda expression
		int sum = number.stream().reduce(0, (a, b) -> a + b);
		System.out.println("Sum :" + sum);

		System.out.println("-------------------------------------------------");

		// Linked List
		List<Character> alphabets = new LinkedList<Character>();
		alphabets.add('M');
		alphabets.add('A');
		alphabets.add('T');
		alphabets.add('D');
		alphabets.add('Z');
		alphabets.add('L');

		System.out.println("Alphabets :" + alphabets);

		// lambda expression
		Comparator<Character> comparatorAlpha1 = (Character c1, Character c2) -> c2.compareTo(c1);
		// sorting in descending order
		Collections.sort(alphabets, comparatorAlpha1);
		System.out.println("Sort in descending order :" + alphabets);

		// lambda expression
		Comparator<Character> comparatorAlpha2 = (Character c1, Character c2) -> c1.compareTo(c2);
		// sorting in ascending order
		Collections.sort(alphabets, comparatorAlpha2);
		System.out.println("Sort in ascending order :" + alphabets);

		System.out.println("-------------------------------------------------");

		LaptopsDto dto = new LaptopsDto();
		dto.setLaptop("HP");

		LaptopsDto dto2 = new LaptopsDto();
		dto2.setLaptop("Acer");

		LaptopsDto dto3 = new LaptopsDto();
		dto3.setLaptop("Dell");

		List<LaptopsDto> laptop = new ArrayList<LaptopsDto>();
		laptop.add(dto);
		laptop.add(dto2);
		laptop.add(dto3);

		System.out.println("Laptops :" + laptop);

		// lambda expression
		Comparator<LaptopsDto> comparatorObj1 = (LaptopsDto o1, LaptopsDto o2) -> o2.getLaptop()
				.compareTo(o1.getLaptop());
		// sorting in descending order
		Collections.sort(laptop, comparatorObj1);
		System.out.println("Sort in descending order :" + laptop);

		// lambda expression
		Comparator<LaptopsDto> comparatorObj2 = (LaptopsDto o1, LaptopsDto o2) -> o1.getLaptop()
				.compareTo(o2.getLaptop());
		// sorting in ascending order
		Collections.sort(laptop, comparatorObj2);
		System.out.println("Sort in ascending order :" + laptop);

	}

}
