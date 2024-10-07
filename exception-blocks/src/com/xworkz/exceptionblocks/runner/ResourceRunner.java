package com.xworkz.exceptionblocks.runner;

import java.util.Scanner;

//try with resource

public class ResourceRunner {

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Enter the Name");
			scanner.nextLine();
		}

	}

}
