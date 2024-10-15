package com.xworkz.programmingtasks.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingWords {

	public static void main(String[] args) {

		String s1 = "hello good morning";
		String s2 = "morning";

		// Split both strings into arrays of words
		List<String> wordsInS1 = new ArrayList<>(Arrays.asList(s1.split(" ")));
		List<String> wordsInS2 = new ArrayList<>(Arrays.asList(s2.split(" ")));

		// Find the words that are in s1 but not in s2
		wordsInS1.removeAll(wordsInS2);

		// Print the missing words
		System.out.println("Missing words: " + wordsInS1);
	}

}
