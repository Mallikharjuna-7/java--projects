package com.flipkart.sandwichmaker.runner;

import java.util.Scanner;

import com.flipkart.sandwichmaker.dto.SandwichMakerDto;
import com.flipkart.sandwichmaker.service.SandwichMaker;

public class SandwichMakerRunner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array:");
		int arraySize = scanner.nextInt();
		System.out.println("Entered Array Size is:"+arraySize);
		
		System.out.println("Enter the Choice below");
		System.out.println("Enter '1' to get the Length of the Array");
		System.out.println("Enter '2' to save the SandwichMakerDto's");
		System.out.println("Enter '3' to Read SandwichMakerDto's");
		int choice = scanner.nextInt();
		
		SandwichMaker sandwich = new SandwichMaker(arraySize);
		
		while(choice <= 3) {
		switch(choice) {
		case 1:
			System.out.println("Length of the Array is:"+sandwich.getArrayLength());
			break;
		case 2:
			System.out.println("Save operation");
			System.out.println("Enter the instance count:");
			int instanceCount = scanner.nextInt();
			
			if(instanceCount <= arraySize ) {
				SandwichMakerDto sandwichMakerDto = new SandwichMakerDto();
				for(int i = 0; i < instanceCount; i++){
					
					System.out.println("Enter the Brand Name:");
					sandwichMakerDto.setBrand(scanner.next());
					
					System.out.println("Enter the Model:");
					sandwichMakerDto.setModel(scanner.next());
					
					System.out.println("Enter the Watts:");
					sandwichMakerDto.setWatts(scanner.nextInt());
					
					System.out.println("Enter the Color:");
					sandwichMakerDto.setColor(scanner.next());
					
					System.out.println("Enter the Warrenty:");
					sandwichMakerDto.setWarrenty(scanner.nextInt());
					
					System.out.println("Enter the Price:");
					sandwichMakerDto.setPrice(scanner.nextInt());
					
					System.out.println("is Stock is Available(true/false):");
					sandwichMakerDto.setStockAvailable(scanner.nextBoolean());
					
					System.out.println("Enter the Seller Name:");
					sandwichMakerDto.setSellerName(scanner.next());
					
					System.out.println("is Free Delivery Available(true/false):");
					sandwichMakerDto.setFreeDeliveryAvailable(scanner.nextBoolean());
					
					System.out.println("is Return Policy Available(true/false):");
					sandwichMakerDto.setReturnPolicyAvaiable(scanner.nextBoolean());
				}
				System.out.println("Save Result:"+sandwich.onSave(sandwichMakerDto));
			}else {
				System.out.println("instance count must be lower then array Size");
			}
			
			break;
		case 3:
			System.out.println("Read operation");
			SandwichMakerDto sandwichRead = sandwich.read();
			System.out.println("Sandwich Maker properties:"+sandwichRead);
			break;
		default :
			System.out.println("Enter the proper values");
		}
		System.out.println("Enter the Choice below");
		System.out.println("Enter '1' to get the Length of the Array");
		System.out.println("Enter '2' to save the SandwichMakerDto's");
		System.out.println("Enter '3' to Read SandwichMakerDto's");
		choice = scanner.nextInt();
		}
		scanner.close();
	}

}
