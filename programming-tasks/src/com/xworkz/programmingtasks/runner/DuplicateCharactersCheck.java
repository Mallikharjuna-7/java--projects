package com.xworkz.programmingtasks.runner;

public class DuplicateCharactersCheck {

	public static void main(String[] args) {

		String input = "Mallikharjun";

		char[] charArray = input.toCharArray();

		boolean hasDuplicates = false;

		int count = 0;

		for (int i = 0; i < charArray.length; i++) {

			for (int j = i + 1; j < charArray.length; j++) {

				if (Character.toLowerCase(charArray[i]) == Character.toLowerCase(charArray[j])) {
					count++;
					System.out.println("Duplicate character found: " + charArray[i] + " - " + count);
					System.out.println("");
					hasDuplicates = true;

				}
			}
		}

		if (!hasDuplicates) {
			System.out.println("No duplicate characters found.");
		}
	}
}
