package com.xworkz.exception.runner;

import com.xworkz.exception.service.MyNullPointerException;

public class MyNullPointerExceptionRunner {

	
	public static void main(String[] args) throws MyNullPointerException {
		String name = null;
		
		try {
			System.out.println("Name Length: "+name.length());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
			throw new MyNullPointerException("Name not be null");
		}
	}
	
	
}
