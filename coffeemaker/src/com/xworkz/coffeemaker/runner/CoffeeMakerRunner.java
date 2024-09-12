package com.xworkz.coffeemaker.runner;

import java.util.Scanner;

import com.xworkz.coffeemaker.dto.CoffeeMakerDto;
import com.xworkz.coffeemaker.service.CoffeeMaker;

public class CoffeeMakerRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Array Size:");
		int arraySize = scanner.nextInt();
		System.out.println("Array size is:" + arraySize);

		System.out.println("Enter the instance count:");
		int instanceCount = scanner.nextInt();

		CoffeeMaker coffeeMaker = new CoffeeMaker(arraySize);

		CoffeeMakerDto coffeeMakerDto = new CoffeeMakerDto();
		if (instanceCount <= arraySize) {
			for (int i = 0; i < instanceCount; i++) {

				System.out.println("Enter the Brand Name:");
				coffeeMakerDto.setBrandName(scanner.next());

				System.out.println("Enter the Model:");
				coffeeMakerDto.setModel(scanner.next());

				System.out.println("Enter the Product Code:");
				coffeeMakerDto.setProductCode(scanner.nextInt());

				System.out.println("Enter the Capacity:");
				coffeeMakerDto.setCapacity(scanner.nextInt());

				System.out.println("Enter the Seller Name:");
				coffeeMakerDto.setSellerName(scanner.next());

				System.out.println("Enter the Power Consumption:");
				coffeeMakerDto.setPowerConsumption(scanner.nextInt());

			}
			System.out.println("Save Result:" + coffeeMaker.onSave(coffeeMakerDto));
		} else {
			System.out.println("instance count must be lower then array Size");
		}

		System.out.println("Enter the Number below");
		System.out.println("1 - to get the Length of the Array");
		System.out.println("2 - Update coffeeMaker Brand Name based on product code");

		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Length of the Array is:" + coffeeMaker.getArrayLength());
			break;
		case 2:
			System.out.println("Enter the product code to Update Brand Name:");
			int productCode = scanner.nextInt();
			if (productCode >= 0) {
				if (productCode == coffeeMakerDto.getProductCode()) {
					System.out.println("Enter the New Brand Name:");
					String newBrandName = scanner.next();

					String updateResult = coffeeMaker.updateByProductCode(productCode, newBrandName);
					System.out.println(updateResult);

				} else {
					System.out.println("Product code Not matched");
				}
			}
			break;
		default:
			System.out.println("Enter the proper values");
		}
		scanner.close();
	}
}
