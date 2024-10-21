package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorRunner {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("mallikharjuna@gmail.com");
		list.add("ganesh@gmail.com");
		
		
		ListIterator<String> listIterator = list.listIterator();
		listIterator.add("rajeshreddy@gmail.com");
		listIterator.add("shashi@gmail.com");
		listIterator.add("nithin@gmail.com");
		
		
	
		//hasNext
		System.out.println("hasNext :"+listIterator.hasNext());
		
		//hasPrevious
		System.out.println("hasPrevious :"+listIterator.hasPrevious());
		
		//next Index
		System.out.println("next index :"+listIterator.nextIndex());
		
		//previous Index
		System.out.println("previous index :"+listIterator.previousIndex());
		
		
		//reading next
		System.out.println("--------Next---------");
		while(listIterator.hasNext()) {
			System.out.println("Mail :"+listIterator.next());
		}
		
		//update
		listIterator.set("taseer@gmail.com");
		
		//reading previous
		System.out.println("--------Previous---------");
		while(listIterator.hasPrevious()) {
			System.out.println("Mail :"+listIterator.previous());
		}
		
		listIterator.remove();
		
	}

}
