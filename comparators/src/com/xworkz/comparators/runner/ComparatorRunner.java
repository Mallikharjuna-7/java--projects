package com.xworkz.comparators.runner;

import java.util.Comparator;

import com.xworkz.comparators.service.Function;
import com.xworkz.comparators.service.Test;

public class ComparatorRunner {

	public static void main(String[] args) {
		
		//using comparator
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				if(o1.equals(o2))
					return 0;
				else
					return 1;
			}
		};
		int value = comparator.compare("Ganesh", "Shashi");
		System.out.println("Value :"+value);
		
		//lambda expression
		Comparator<String> comparator1 = (String s1, String s2) -> s1.equals(s2)? 0:1;
		System.out.println("lambda :"+comparator1.compare("Shashi", "Shashi"));
		
		//using functional interface (boolean)
		Function comprator2 = (a1, a2) -> a1.equals(a2)? true:false;
		System.out.println("Functional Interface (boolean) :"+comprator2.check("Allu", "Shashi"));
		
		//using functional interface (String)
		Test comprator3 = (b1, b2) -> b1.equals(b2)? "Shashi is correct":"Shashi is not correct";
		System.out.println("Functional Interface (String ):"+comprator3.check("Shashi", "Rajesh"));
				
	}
	

}
