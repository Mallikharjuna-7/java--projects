package com.xworkz.practicequetions.service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DayDate {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the choice below");
		System.out.println("1.replace multiples of a number in an array");
		System.out.println("2.check Current Day");
		System.out.println("3.check Current Date");
		System.out.println("4.check current Month");
		System.out.println("5.check Current Year");
		System.out.println("6.check Day by User");
		System.out.println(" ");
		int choice = scanner.nextInt();

		while (choice <= 6) {
			switch (choice) {

			case 1:
				System.out.println("Enter the array Size");
				int arraySize = scanner.nextInt();

				System.out.println("Enter the number to check multiples");
				int number = scanner.nextInt();

				int[] array = new int[arraySize];

				System.out.println("Enter the array elements");
				for (int i = 0; i < arraySize; i++) {
					array[i] = scanner.nextInt();
					if (array[i] % number == 0) {
						array[i] = number;
					}
				}
				System.out.println("Updated Array Elements:");
				for (int a : array) {
					System.out.println(a);
				}
				break;

			case 2:
				DayOfWeek today = LocalDate.now().getDayOfWeek();
				System.out.println("Current Day: " + today);
				break;

			case 3:
				int currentDate = LocalDate.now().getDayOfMonth();
				System.out.println("Current Date: " + currentDate);
				break;

			case 4:
				Month currentMonth = LocalDate.now().getMonth();
				System.out.println("Current Month: " + currentMonth);
				break;

			case 5:
				int currentYear = LocalDate.now().getYear();
				System.out.println("Current Year: " + currentYear);
				break;

			case 6:
				System.out.println("Enter the Day");
				scanner.nextLine();
				String day = scanner.nextLine();

				DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
				if (day.equalsIgnoreCase(currentDay.name())) {
					System.out.println("Day is Matched");
				} else {
					System.out.println("Day is Not Matched");
				}
				break;

			default:
				System.out.println("Enter the proper values");
			}

			System.out.println(" ");
			System.out.println("Enter the choice to continue");
			System.out.println("1.replace multiples of a number in an array");
			System.out.println("2.check Current Day");
			System.out.println("3.check Current Date");
			System.out.println("4.check current Month");
			System.out.println("5.check Current Year");
			System.out.println("6.check Day by User");
			choice = scanner.nextInt();

		}
		scanner.close();
	}
}
