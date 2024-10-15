package com.xworkz.collection.runner;

import java.util.LinkedList;

public class LinkedListRunner {

	public static void main(String[] args) {

		LinkedList<String> laptop = new LinkedList<String>();

		// add
		laptop.add("HP");
		laptop.add("Dell");
		laptop.add("Lenovo");
		laptop.add("Asus");
		laptop.add("Razor");
		laptop.add("Microsoft");
		laptop.add("Jio");
		System.out.println("Laptops Brands :" + laptop);

		// add by index
		laptop.add(3, "Acer");
		System.out.println("After add by index 3 :" + laptop);

		LinkedList<String> newLaptop = new LinkedList<String>();

		newLaptop.add("MSI");
		newLaptop.add("Samsung");
		newLaptop.add("Hisence");

		// add all
		laptop.addAll(newLaptop);
		System.out.println("After add all :" + laptop);

		// add First
		laptop.addFirst("Redmi");
		System.out.println("After add First :" + laptop);

		// add Last
		laptop.addLast("Infinix");
		System.out.println("After add Last :" + laptop);

		// contains
		boolean isContainLenovo = laptop.contains("Lenovo");
		System.out.println("isContain Lenovo :" + isContainLenovo);

		// contains all
		boolean isContainAll = laptop.containsAll(newLaptop);
		System.out.println("isContain All new Laptops :" + isContainAll);

		// element
		System.out.println("Element :" + laptop.element());

		// equals
		boolean isEqual = laptop.equals(newLaptop);
		System.out.println("Laptop is equals to newLaptops :" + isEqual);

		// get by index
		System.out.println("get index 4 :" + laptop.get(4));

		// get Class
		System.out.println("get Class :" + laptop.getClass());

		// get First
		System.out.println("get First :" + laptop.getFirst());

		// get Last
		System.out.println("get Last :" + laptop.getLast());

		// index of
		System.out.println("index of Dell :" + laptop.indexOf("Dell"));

		// is Empty
		System.out.println("is Empty :" + laptop.isEmpty());

		// last index of
		System.out.println("last index of Asus :" + laptop.lastIndexOf("Asus"));

		// offer
		laptop.offer("Huawei");
		System.out.println("After Offer :" + laptop);

		// offer First
		laptop.offerFirst("Apple");
		System.out.println("After Offer First :" + laptop);

		// offer Last
		laptop.offerLast("Honor");
		System.out.println("After Offer Last :" + laptop);

		// peek
		System.out.println("peek :" + laptop.peek());

		// peek First
		System.out.println("peek First :" + laptop.peekFirst());

		// peek Last
		System.out.println("peek Last :" + laptop.peekLast());

		// poll
		laptop.poll();
		System.out.println("after poll :" + laptop);

		// poll First
		laptop.pollFirst();
		System.out.println("after poll First :" + laptop);

		// poll Last
		laptop.pollLast();
		System.out.println("after poll Last :" + laptop);

		// pop
		laptop.pop();
		System.out.println("after pop :" + laptop);

		// push
		laptop.push("LG");
		System.out.println("after push :" + laptop);

		// remove
		laptop.remove();
		System.out.println("after remove :" + laptop);

		// remove by index
		laptop.remove(6);
		System.out.println("after removed index 6 :" + laptop);

		// remove by String
		laptop.remove("Asus");
		System.out.println("after remove Asus :" + laptop);

		// remove First
		laptop.removeFirst();
		System.out.println("after remove First :" + laptop);

		// remove Last
		laptop.removeLast();
		System.out.println("after remove Last :" + laptop);

		// remove First Occurrence
		laptop.removeFirstOccurrence("MSI");
		System.out.println("after remove first occurance :" + laptop);

		// remove Last Occurrence
		laptop.removeLastOccurrence("Acer");
		System.out.println("after remove last occurance :" + laptop);

		// remove all
		laptop.removeAll(newLaptop);
		System.out.println("after remove all newLaptops :" + laptop);

		// sort
		laptop.sort(null);
		System.out.println("after sort :" + laptop);

		// size
		System.out.println("size :" + laptop.size());

		// sublist
		System.out.println("sublist :" + laptop.subList(0, 2));

		// set
		laptop.set(2, "Thinkpad");
		System.out.println("after set :" + laptop);

		// toArray
		System.out.println("to Array :");
		Object[] array = laptop.toArray();
		for (Object l : array) {
			System.out.println(l);
		}

		// retain all
		laptop.retainAll(newLaptop);
		System.out.println("after retain all :" + laptop);
		
		// clear 
		laptop.clear();
		System.err.println("after clear :"+laptop);
	}

}
