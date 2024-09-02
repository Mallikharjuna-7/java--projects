package com.xworkz.logindetails.runner;

public class ValidateRunner {

	public static void main(String[] args) {
		
		String password = "Abc3efghijk123";
		char[] ch = password.toCharArray();
		System.out.println(password.toCharArray());
		System.out.println(password.charAt(0));
		System.out.println(Character.isUpperCase(password.charAt(0)));
		System.out.println(Character.isLowerCase(password.charAt(10)));
		
		
		if( password != null && password.length() >= 8 && password.length() <= 16 && Character.isUpperCase(password.charAt(0)) && 
				Character.isLowerCase(password.charAt(10)) && Character.isDigit(password.charAt(3))) {
			
			System.out.println("log in successfully");
		}else {
			System.out.println("password is incorrect");
		}
		for(char c : ch) {
			if(Character.isAlphabetic(c) && Character.isDigit(c)) {
			}
		}
		System.out.println("Password is Alphanumeric");
		
	}

}
