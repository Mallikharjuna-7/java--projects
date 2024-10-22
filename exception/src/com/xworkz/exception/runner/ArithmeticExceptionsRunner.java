package com.xworkz.exception.runner;

import com.xworkz.exception.service.ArithmeticExceptions;

public class ArithmeticExceptionsRunner {

	public static void main(String[] args) throws ArithmeticExceptions {
		System.out.println("main running");

		try {
			int number = 10;
			int div = 0;
			int result = number / div;

			if (div == 0) {
				System.out.println("can't divisible by zero");
			} else {
				System.out.println("Result: " + result);
			}
		} catch (ArithmeticException e) {
			System.out.println(e);
			throw new ArithmeticExceptions("Divion must be > 0");
		}

	}

}
