package com.xworkz.programmingtasks.runner;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number");
		int number = scanner.nextInt();

		int n = 499;

		while (number != n) {

			if (number > n) {
				System.out.println("Guessed number is high.. try again..");
			} else if (number < n) {
				System.out.println("Guessed number is low.. try again..");
			} 
			System.out.println(" ");
			System.out.println("Enter the Number");
			number = scanner.nextInt();
		}
		System.out.println("Guessed number is correct :"+number);
		scanner.close();
	}

}
