package com.logics.stringmethods.runner;

import java.util.Arrays;
import java.util.Scanner;

public class StringsCheck {
	
	
	
	//split Method
	public void splitMethod(String sentence) {
		if(sentence != null) {
			System.out.println("Statement: "+sentence);
			String result[] = sentence.split(" ");
			System.out.println("Split: "+Arrays.toString(result));
		}else {
			System.out.println("sentence is null. Enter proper Values");
		}
	}
	//toUppperCase Method
	public void upperCaseMethod(String sentence) {
		if(sentence != null) {
			System.out.println("Statement :"+sentence);
			System.out.println("Upper Case :"+sentence.toUpperCase());	
		}else {
			System.out.println("sentence is null. Enter proper Values");
		}
	}
	//toLowerCase Method
	public void lowerCaseMethod(String sentence) {
		if(sentence != null) {
		System.out.println("Statement :"+sentence);
		System.out.println("Lower Case :"+sentence.toLowerCase());
		}else {
			System.out.println("sentence is null. Enter proper Values");
		}
	}
	//toCharArray
	public void toCharArrayMethod(String sentence) {
		if(sentence != null) {
		System.out.println("Statement :"+sentence);
		char[] result = sentence.toCharArray();
			for(char c : result) {
				System.out.println("Char Array :"+c);
			}
		}else {
			System.out.println("sentence is null. Enter proper Values");
		}
	}
	//toCharAt
	public void toCharAt(String sentence,int index) {
		if(sentence != null) {
			if(index < sentence.length()) {
				System.out.println("Statement: "+sentence);
				System.out.println("Index: "+index);
				char ch = sentence.charAt(index);
				System.out.println("Chrarcter At index number "+index+" is :"+ch);
			}else {
				System.out.println("index out of bound");
			}
		}else {
			System.out.println("sentence is null. Enter proper Values");
		}
	}
	//equalsIgnoreCase
	public void equalsIgnoreMethod(String sentence1,String sentence2) {
		if(sentence1 != null && sentence2 != null) {
			System.out.println("Statement 1: "+sentence1);
			System.out.println("Statement 2: "+sentence2);
			if(sentence1.equalsIgnoreCase(sentence2)) {
				System.out.println("Both statements are equal");
			}else {
				System.out.println("Both statements are not equal");
			}
		}else {
			System.out.println("sentence is null. Enter proper Values");
		}
	}
	//replace
	public void replaceMethod(String sentence,String exist,String replace) {
		if(sentence != null && exist != null && replace != null ) {
			System.out.println("Statement: "+sentence);
			System.out.println("existing word: "+exist);
			System.out.println("replacing word: "+replace);
			String result = sentence.replace(exist, replace);
			System.out.println("Updated statement: "+result);
		}else {
			System.out.println("Enter proper Values");
		}
	}
	//repeat
	public void repeatMethod(String sentence,int count) {
		if(sentence != null) {
			System.out.println("Statement: "+sentence);
			System.out.println("repeat count: "+count);
			String result = sentence.repeat(count);
			System.out.println("repeat Statement: "+result);
		}else {
			System.out.println("sentence is null. Enter proper Values");
		}
	}
	//substring
	public void subStringMethod(String sentence,int start,int end) {
		if(sentence != null) {
			if(start >= 0 && end < sentence.length()) {
				System.out.println("Statement: "+sentence);
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
	
	
	
	

	public static void main(String[] args) {
		
		StringsCheck check = new StringsCheck();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number");
		System.out.println("1.Split ");
		System.out.println("2.to Upper Case");
		System.out.println("3.to Lower Case");
		System.out.println("4.to Char Array");
		System.out.println("5.to Char At");
		System.out.println("6.equals Ignore Case");
		System.out.println("7.replace");
		System.out.println("8.repeat");
		System.out.println("9.subString");
		
		int select = scanner.nextInt();
		
		while(select <= 15) {
		switch(select) {
		case 1: 
			System.out.println("Enter the Statement");
			scanner.nextLine();
			check.splitMethod(scanner.nextLine());
			
			break;
		case 2:
			System.out.println("Enter the Statement");
			scanner.nextLine();
			check.upperCaseMethod(scanner.nextLine());
			break;
		case 3:
			System.out.println("Enter the Statement");
			scanner.nextLine();
			check.lowerCaseMethod(scanner.nextLine());
			break;
		case 4:
			System.out.println("Enter the Statement");
			scanner.nextLine();
			check.toCharArrayMethod(scanner.nextLine());
			break;
		case 5:
			System.out.println("Enter the Statement");
			scanner.nextLine();
			System.out.println("Enter the index number");
			check.toCharAt(scanner.nextLine(), scanner.nextInt());
			break;
		case 6:
			System.out.println("Enter the Statement 1");
			System.out.println("Enter the Statement 2");
			scanner.nextLine();
			check.equalsIgnoreMethod(scanner.nextLine(), scanner.nextLine());
			break;
			
		case 7:
			System.out.println("Enter the Statement");
			System.out.println("Enter the existing word");
			System.out.println("Enter the replacing word");
			scanner.nextLine();
			check.replaceMethod(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
			
			break;
		case 8:
			System.out.println("Enter the Statement");
			System.out.println("Enter the repeat count");
			scanner.nextLine();
			check.repeatMethod(scanner.nextLine(), scanner.nextInt());
			break;
		case 9:
			System.out.println("Enter the Statement");
			System.out.println("Enter the Starting index");
			System.out.println("Enter the Ending index");
			scanner.nextLine();
			check.subStringMethod(scanner.nextLine(), scanner.nextInt(), scanner.nextInt());
			break;
			
		default:
			System.out.println("Enter the proper values");
			break;
		}
		System.out.println("----------------------------");
		System.out.println("Enter the number to continue");
		System.out.println("1.Split ");
		System.out.println("2.to Upper Case");
		System.out.println("3.to Lower Case");
		System.out.println("4.to Char Array");
		System.out.println("5.to Char At");
		System.out.println("6.equals Ignore Case");
		System.out.println("7.replace");
		System.out.println("8.repeat");
		System.out.println("9.subString");
		
		select = scanner.nextInt();
		}
		scanner.close();
	}

}
