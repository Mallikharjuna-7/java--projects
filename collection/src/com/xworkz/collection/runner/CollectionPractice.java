package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionPractice {

	public static void main(String[] args) {
		
		//country names
		Collection<String> countries = new ArrayList<String>();

		countries.add("India");
        countries.add("Australia");
        countries.add("Brazil");
        countries.add("Canada");
        countries.add("China");
        countries.add("France");
        countries.add("Germany");
        countries.add("Argentina");
        countries.add("Italy");
        countries.add("Japan");
        countries.add("Mexico");
        countries.add("Netherlands");
        countries.add("Nigeria");
        countries.add("Russia");
        countries.add("South Africa");
        countries.add("South Korea");
        countries.add("Spain");
        countries.add("Sweden");
        countries.add("United Kingdom");
        countries.add("United States");
        
        //sorting
        ArrayList<String> country = new ArrayList<String>(countries);
        Collections.sort(country);
        System.out.println("Countries:"+country);
        
        
        //state names
        Collection<String> states = new ArrayList<String>();
        
        states.add("Andhra Pradesh");
        states.add("Telangana");
        states.add("Tripura");
        states.add("Uttar Pradesh");
        states.add("Uttarakhand");
        states.add("West Bengal");
        states.add("Manipur");
        states.add("Meghalaya");
        states.add("Mizoram");
        states.add("Nagaland");
        states.add("Odisha");
        states.add("Punjab");
        states.add("Rajasthan");
        states.add("Sikkim");
        states.add("Tamil Nadu");
        states.add("Goa");
        states.add("Gujarat");
        states.add("Haryana");
        states.add("Himachal Pradesh");
        states.add("Jharkhand");
        states.add("Karnataka");
        states.add("Kerala");
        states.add("Madhya Pradesh");
        states.add("Maharashtra");
        states.add("Arunachal Pradesh");
        states.add("Assam");
        states.add("Bihar");
        states.add("Chhattisgarh");
        
        //sorting
        ArrayList<String> state = new ArrayList<String>(states);
        Collections.sort(state);
        System.out.println("States:"+state);
        
        
        //movie names
        Collection<String> movies = new ArrayList<String>();
        
        movies.add("OG");
        movies.add("Devara");
        movies.add("RRR");
        movies.add("Bahubali");
        movies.add("Puspha");
        movies.add("KGF");
        movies.add("Kantara");
        movies.add("Game Changer");
        movies.add("Charliee");
        movies.add("Gunterukaram");
        movies.add("Hanuman");
        movies.add("Arjun Reddy");
        movies.add("Jersey");
        movies.add("Eega");
        movies.add("Magadheera");
        
        //sorting
        ArrayList<String> movie = new ArrayList<String>(movies);
        Collections.sort(movie);
        System.out.println("Movies:"+movie);
	}

}
