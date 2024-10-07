package com.xworkz.exceptionblocks.runner;

//user defined exception with try-catch

import com.xworkz.exceptionblocks.service.NullException;

public class NullExceptionRunner {

	public static void main(String[] args) {

		try {
			String name = null;
			System.out.println(name.length());
			throw new NullException("Name not be null");

		} catch (NullException e) {
			System.out.println("Exception: " + e.getMessage());
		} 
	}
}
