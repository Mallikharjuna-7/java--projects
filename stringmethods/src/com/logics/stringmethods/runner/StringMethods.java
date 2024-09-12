package com.logics.stringmethods.runner;

import java.util.Scanner;

public class StringMethods {

	private int index =0;
	private String[] array;
	
	public StringMethods(int arraySize) {
		this.array = new String[arraySize];
	}
	
	
	public String onSave(String sentence) {
		if( sentence.length() <16 && sentence.length() > 3 && !sentence.isEmpty() &&
				sentence != null && sentence.startsWith("S") && sentence.endsWith("a")) {
			if(index < array.length) {
				array[index] = sentence;
				index++;
				return "Saved successfylly";
			}
		}
		
		return "Not saved.Validation failed";
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array:");
		int arraySize = scanner.nextInt();
		System.out.println("Entered Array Size is:"+arraySize);

		StringMethods method = new StringMethods(arraySize);
		
		System.out.println("Save operation");
		System.out.println("Enter the instance count:");
		int instanceCount = scanner.nextInt();
		
		if(instanceCount <= arraySize ) {
			for(int i = 0; i < instanceCount; i++){
				
				System.out.println("Enter the Sentence:");
				scanner.nextLine();
				System.out.println(method.onSave(scanner.nextLine()));
			}
		}
		scanner.close();
	}

}
