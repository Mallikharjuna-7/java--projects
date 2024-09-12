package com.logics.stringmethods.runner;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	//reversing String with length
	public void reverseString(String originalValue) {
		System.out.println("Original Value:"+originalValue);
		if(originalValue != null) {
			for(int x = originalValue.length()-1;x >= 0; x--) {
				System.out.print(originalValue.charAt(x));
			}
		}else {
			System.out.println("Enter proper values");
		}
	}
	
	//reversing String without length
	public void reverseStringWithoutLength(String originalValue) {
		System.out.println("Original Value:"+originalValue);
		if(originalValue != null) {
			String reverseValue = "";
			char ch[] = originalValue.toCharArray();
			for(char c : ch) {
				reverseValue = c + reverseValue;
				
			}
			System.out.print("Reversed Value:"+reverseValue);
		}else {
			System.out.print("Enter proper values");
		}
	}
	
	//checking for palindrome
		public void checkpalindrome(String originalValue) {
			System.out.println("Original Value:"+originalValue);
			if(originalValue != null) {
				String reverseValue = "";
				char ch[] = originalValue.toCharArray();
				for(char c : ch) {
					reverseValue = c + reverseValue;
					
				}
				//System.out.print(reverseValue);
				System.out.println("Reversed Value:"+reverseValue);
				if(originalValue.equals(reverseValue)) {
					System.out.println("Its a palindrome");
				}else {
					System.out.println("Its not a palindrome");
				}
			}else {
				System.out.print("Enter proper values");
			}
		}
		
		//counting words in given sentence
		//using split method
		//again converting array to String
		public void testSplit(String sentence) {
			System.out.println("Sentence:"+sentence);
			if(sentence != null) {
				//split method
				String result[] = sentence.split(" ");
				System.out.println(Arrays.toString(result));
				//counting
				int count = 0;
					for(int j = 0; j < result.length; j++) {
						count++;
					}
					System.out.println("Count:"+count);
				
				//again converting array to String
				String updateSentence = "";
				for(int i = 0; i < result.length; i++) {
					updateSentence += result[i];
				}
				System.out.println("Sentence:"+sentence);
				System.out.println("Updated Sentence:"+updateSentence);
			}
		}
		
		//checking "you" occurrence count in given sentence
		public void occurrenceCount(String sentence) {
			System.out.println("Sentence:"+sentence);
			if(sentence != null) {
				String result[] = sentence.split(" ");
				//System.out.println(Arrays.toString(result));
				int count = 0;
				String word = "you";
				for(int j = 0; j < result.length; j++) {
					if(result[j].equalsIgnoreCase(word)) {
						count++;	
					}
				}
				System.out.println("'you' occurrence count:"+count);
			}
		}
		
		//replacing word "you" with "not" in sentence
		public void replaceWord(String sentence) {
			System.out.println("Sentence:"+sentence);
			if(sentence != null) {
				String result[] = sentence.split(" ");
				System.out.println(Arrays.toString(result));
				String word = "you";
				String replace = "not";
				for(int j = 0; j < result.length; j++) {
					if(result[j].equalsIgnoreCase(word)) {
						result[j] = replace;
						System.out.println(Arrays.toString(result));
						
						String updateSentence = "";
						for(int i = 0; i < result.length; i++) {
							updateSentence += result[i]+" ";
						}
						System.out.println("Updated Sentence:"+updateSentence);
					}
				}
				
			}
		}
		
		//deleting word "you" in sentence	
		public void deleteWord(String sentence) {
			System.out.println("Sentence:"+sentence);
			if(sentence != null) {
				String result[] = sentence.split(" ");
				System.out.println(Arrays.toString(result));
				String word = "you";
				String replace = "";
				for(int j = 0; j < result.length; j++) {
					if(result[j].equalsIgnoreCase(word)) {
						result[j] = replace;
						System.out.println(Arrays.toString(result));
						
						String updateSentence = "";
						for(int i = 0; i < result.length; i++) {
							updateSentence += result[i]+" ";
						}
						System.out.println("Updated Sentence:"+updateSentence);
					}
				}
				
			}
		}
	
	
	
	public static void main(String[] args) {
		
		//creating instance for class
		ReverseString reverse = new ReverseString();
		
		//Creating instance for Scanner class
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter the Choice below");
		System.out.println("1.Reverse String with Length");
		System.out.println("2.Reverse String without Length");
		System.out.println("3.Checking Palindrome");
		System.out.println("4.counting words in given sentence");
		System.out.println("5.checking \"you\" occurrence count in given sentence");
		System.out.println("6.replacing word \"you\" with \"not\" in sentence");
		System.out.println("7.deleting word \"you\" in sentence");
		
		int choice = scanner.nextInt();
		
		while (choice <= 7) {
		switch(choice) {
		case 1:
			System.out.println("Enter the String Value:");
			scanner.nextLine();
			reverse.reverseString(scanner.nextLine());
			break;
		case 2:
			System.out.println("Enter the String Value:");
			scanner.nextLine();
			reverse.reverseStringWithoutLength(scanner.nextLine());
			break;
		case 3:
			System.out.println("Enter the String Value:");
			scanner.nextLine();
			reverse.checkpalindrome(scanner.nextLine());
			break;
		case 4:
			System.out.println("Enter the String Value:");
			scanner.nextLine();
			reverse.testSplit(scanner.nextLine());
			break;
		case 5:
			System.out.println("Enter the Sentence:");
			scanner.nextLine();
			reverse.occurrenceCount(scanner.nextLine());
			break;
		case 6:
			System.out.println("Enter the Sentence:");
			scanner.nextLine();
			reverse.replaceWord(scanner.nextLine());
			break;
		case 7 :
			System.out.println("Enter the Sentence:");
			scanner.nextLine();
			reverse.deleteWord(scanner.nextLine());
			break;
		default :
			System.out.println("Enter the proper values");
		}
		System.out.println("-----------------------");
		System.out.println("Enter the Choice below");
		System.out.println("1.Reverse String with Length");
		System.out.println("2.Reverse String without Length");
		System.out.println("3.Checking Palindrome");
		System.out.println("4.counting words in given sentence");
		System.out.println("5.checking \"you\" occurrence count in given sentence");
		System.out.println("6.replacing word \"you\" with \"not\" in sentence");
		System.out.println("7.deleting word \"you\" in sentence");
		choice = scanner.nextInt();
		}
		scanner.close();
	}

}
