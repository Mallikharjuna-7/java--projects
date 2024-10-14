package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.List;

public class ListCheck {

	public static void main(String[] args) {
		
		List<String> enggStreams = new ArrayList<String>();
		System.out.println("Engineering Streams:");
		enggStreams.add("Mechanical Engineering");
		enggStreams.add("Computer Science Engineering");
		enggStreams.add("Civil Engineering");
		enggStreams.add("Electrical and Electronics Engineering");
		enggStreams.add("Electronics and Comunication Engineering");
		enggStreams.add("Automobile Engineering");
		enggStreams.add("Agriculture Engineering");
		enggStreams.add("Chemical Engineering");
		enggStreams.add("Aerospace Engineering");
		enggStreams.add("Mining Engineering");
		System.out.println(enggStreams);
		
		//for each 
		enggStreams.forEach(e -> System.out.println(e));
		
		ArrayList<String> bikes = new ArrayList<String>();
		System.out.println("Bikes:");
		bikes.add("Triumph");
		bikes.add("Hero");
		bikes.add("Royal Enfiled");
		bikes.add("Kawasaki");
		bikes.add("BMW");
		bikes.add("Pulser");
		bikes.add("Hayabusa");
		System.out.println(bikes);
		
		ArrayList<String> newBikes = new ArrayList<String>();
		newBikes.add("TVS");
		newBikes.add("Honda");
		newBikes.add("Apache");
		newBikes.add("KTM");
		
		
		//add all
		bikes.addAll(newBikes);
		System.out.println("After adding new Bikes :"+bikes);
		
		//add by index
		bikes.add(1, "Yamaha");
		System.out.println("add by index :"+bikes);
		
		//size
		System.out.println("Stream Size :"+enggStreams.size());
		System.out.println("Bike Size :"+bikes.size());
		
		//contains
		boolean isContainMech = enggStreams.contains("Mechanical Engineering");
		System.out.println("isContain Mech :"+isContainMech);
		
		boolean isContainBMW = bikes.contains("BMW");
		System.out.println("isContain BMW :"+isContainBMW);
		
		//contains all
		boolean isContainAllBikes = bikes.containsAll(newBikes);
		System.out.println("is bikes contains All newBikes :"+isContainAllBikes);
		
		boolean isContainAll= enggStreams.containsAll(bikes);
		System.out.println("is Stream contains All bikes :"+isContainAll);
		
		//remove 
		enggStreams.remove("Civil Engineering");
		System.out.println("After remove civil :"+enggStreams);
		
		bikes.remove("Royal Enfiled");
		System.out.println("After remove RE :"+bikes);
		
		//remove by index
		enggStreams.remove(1);
		System.out.println("After remove index 1 :"+enggStreams);
		
		bikes.remove(3);
		System.out.println("After remove index 3:"+bikes);
		
		//get index
		System.out.println("Streams index at 5 :"+enggStreams.get(5));
		System.out.println("bikes index at 4 :"+bikes.get(5));
		
		//index of
		System.out.println("index of Agriculture :"+enggStreams.indexOf("Agriculture Engineering"));
		System.out.println("index of Apache :"+bikes.indexOf("Apache"));

		//last index of
		System.out.println("last index of mining :"+enggStreams.lastIndexOf("Mining Engineering"));
		System.out.println("last index of TVS :"+bikes.lastIndexOf("TVS"));
	
		//set
		enggStreams.set(4, "Metallurgical Engineering");
		System.out.println("After set streams index 4 :"+enggStreams);
		
		bikes.set(5, "Jawa");
		System.out.println("After set bikes index 5 :"+bikes);
		
		//remove all
		bikes.removeAll(newBikes);
		System.out.println("After removing all new bikes :"+bikes);
		
		//clear
		bikes.clear();
		System.err.println("After clear bikes :"+bikes);
		
		enggStreams.clear();
		System.err.println("After clear Streams :"+enggStreams);
	}

}
