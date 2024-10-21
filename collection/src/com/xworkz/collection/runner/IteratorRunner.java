package com.xworkz.collection.runner;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorRunner {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("Good");
		list.add("Morning");
		
		Iterator<String> iterator = list.iterator();
		
		System.out.println("is present next element :"+iterator.hasNext());
		
		//reading by next
		System.out.println(iterator.next());
		System.out.println(iterator.next());
//		System.out.println(iterator.next());
		
		//reading with while loop
		while (iterator.hasNext()){
			System.out.println("While loop");
			System.out.println("element :"+iterator.next());
		}
		
		
		iterator.remove();
	}

}
