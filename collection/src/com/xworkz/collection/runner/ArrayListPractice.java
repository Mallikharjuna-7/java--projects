package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		System.out.println("- Hero Names");
		List<String> heros = new ArrayList<String>();
		heros.add("Pawan Kalyan");
		heros.add("Ram Charan");
		heros.add("Prabhas");
		heros.forEach(h -> System.out.println(h));
		
		System.out.println("- Pawan Kalyan Movies");
		List<String> pk = new ArrayList<String>();
		pk.add("OG");
		pk.add("Bro");
		pk.add("GabbarSingh");
		pk.forEach(p -> System.out.println(p));
		
		System.out.println("- Ram Charan Movies");
		List<String> rc = new ArrayList<String>();
		rc.add("Game Changer");
		rc.add("RRR");
		rc.add("Rangasthalam");
		rc.forEach(r -> System.out.println(r));
		
		System.out.println("- Prabhas Movies");
		List<String> pb = new ArrayList<String>();
		pb.add("Kalki");
		pb.add("Babubali");
		pb.add("Saaho");
		pb.forEach(s -> System.out.println(s));
	}

}
