package com.xworkz.coffeemaker.runner;

import java.util.Scanner;

import com.xworkz.coffeemaker.dto.CoffeeMakerDto;
import com.xworkz.coffeemaker.service.CoffeeMaker;

public class CoffeeMakerRunner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Array Size:");
		int arraySize = scanner.nextInt();
		System.out.println("Array size is:"+arraySize);
		
		System.out.println("Enter the Number below");
		System.out.println("1 - to get the Length of the Array");
		System.out.println("2 - to save the CoffeMakerDtos");

		int choice = scanner.nextInt();
		
		CoffeeMaker coffeeMaker = new CoffeeMaker(arraySize);
		
		switch(choice) {
		case 1:
			System.out.println("Length of the Array is:"+coffeeMaker.getArrayLength());
			break;
		case 2:
			System.out.println("Save operation");
			System.out.println("Enter the instance count:");
			int instanceCount = scanner.nextInt();
			
			if(instanceCount <= arraySize ) {
				CoffeeMakerDto coffeeMakerDto = new CoffeeMakerDto();
				for(int i = 0; i < instanceCount; i++){
					
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
				System.out.println("Save Result:"+coffeeMaker.onSave(coffeeMakerDto));
			}else {
				System.out.println("instance count must be lower then array Size");
			}
			break;
		default :
			System.out.println("Enter the proper values");
		}
		scanner.close();
	}
}
