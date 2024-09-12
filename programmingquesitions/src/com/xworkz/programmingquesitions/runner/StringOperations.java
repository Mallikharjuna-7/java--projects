package com.xworkz.programmingquesitions.runner;

import java.util.Scanner;

public class StringOperations {

	
		//get substring from a string
		public void subString(String sentence,int start,int end) {
			if(sentence != null) {
				if(start >= 0 && end < sentence.length()) {
					System.out.println("Sentence: "+sentence);
					System.out.println("starting index: "+start);
					System.out.println("ending index :"+end);
					String result = sentence.substring(start, end);
					System.out.println("subString: "+result);
				}else {
					System.out.println("index out of bound");
				}
			}else {
				System.out.println("sentence is null. Enter proper Values");
			}
		}
		//repeat the given String
		public void repeat(String sentence,int count) {
			if(sentence != null) {
				System.out.println("Sentence: "+sentence);
				System.out.println("repeat count: "+count);
				String result = sentence.repeat(count);
				System.out.println("repeat Sentence: "+result);
			}else {
				System.out.println("sentence is null. Enter proper Values");
			}
		}
		//concat the 2 strings
		public void concat(String sentence1, String sentence2) {
			if(sentence1 != null && sentence2 != null) {
				System.out.println("Sentence 1: "+sentence1);
				System.out.println("Sentence 2: "+sentence2);
				String result = sentence1.concat(" "+sentence2);
				System.out.println("Concated Sentence: "+result);
			}else {
				System.out.println("sentence is null. Enter proper Values");
			}
		}
		//remove white spaces at beginning and ending of the String
		public void trim(String sentence) {
			if(sentence != null) {
				System.out.println("Sentence :"+sentence);
				String result = sentence.trim();
				System.out.println("Updated Sentence:"+result);
			}else {
				System.out.println("sentence is null. Enter proper Values");
			}
		}
		//search the sequence of characters in the String
		public void contain(String sentence, String search) {
			if(sentence != null && search != null) {
				System.out.println("Sentence :"+sentence);
				System.out.println("Search :"+search);
				boolean result = sentence.contains(search);
				if(result == true) {
					System.out.println(result+": Sentence contains :"+search);
				}else {
					System.out.println(result+": Sentence not contains :"+search);
				}
			}else {
				System.out.println("sentence is null. Enter proper Values");
			}
		}
		
		
		
		
	
	
	public static void main(String[] args) {
		
		StringOperations strOp = new StringOperations();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number");
		System.out.println("1.find a subString in a String ");
		System.out.println("2.repeat the given String ");
		System.out.println("3.concat the given Strings");
		System.out.println("4.remove white spaces at beginning and ending of the String");
		System.out.println("5.search the sequence of characters in the String ");
		
		int select = scanner.nextInt();
		
		while(select <= 5) {
		switch(select) {
		case 1: 
			System.out.println("Enter the Sentence");
			System.out.println("Enter the Starting index");
			System.out.println("Enter the Ending index");
			scanner.nextLine();
			strOp.subString(scanner.nextLine(), scanner.nextInt(), scanner.nextInt());
			break;
		case 2:
			System.out.println("Enter the Sentnece");
			System.out.println("Enter the repeat count");
			scanner.nextLine();
			strOp.repeat(scanner.nextLine(), scanner.nextInt());
			break;
		case 3:
			System.out.println("Enter the Sentence 1");
			System.out.println("Enter the Sentence 2");
			scanner.nextLine();
			strOp.concat(scanner.nextLine(), scanner.nextLine());
			break;
		case 4:
			System.out.println("Enter the Sentence");
			scanner.nextLine();
			strOp.trim(scanner.nextLine());
			break;
		case 5:
			System.out.println("Enter the Sentence");
			System.out.println("Enter the search");
			scanner.nextLine();
			strOp.contain(scanner.nextLine(), scanner.nextLine());
			break;
		default:
			System.out.println("Enter the proper values");
			break;
		}
		System.out.println("----------------------------");
		System.out.println("Enter the number to continue");
		System.out.println("1.find subString in a String");
		System.out.println("2.repeat the String");
		System.out.println("3.concat the given Strings");
		System.out.println("4.remove white spaces at beginning and ending of the String");
		System.out.println("5.search the sequence of characters in the String");

		select = scanner.nextInt();
		}
		scanner.close();
	}
}
