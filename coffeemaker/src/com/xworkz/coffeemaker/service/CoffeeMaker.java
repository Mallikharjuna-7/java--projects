package com.xworkz.coffeemaker.service;

import com.xworkz.coffeemaker.dto.CoffeeMakerDto;
import com.xworkz.coffeemaker.util.CoffeeMakerUtil;

public class CoffeeMaker {

		private int index = 0;
		private CoffeeMakerDto[] listOfCoffeeMakerDto;
		
		//constructor
		public CoffeeMaker(int arraySize) {
			this.listOfCoffeeMakerDto = new CoffeeMakerDto[arraySize];
		}
		
		//method for get Length
		public int getArrayLength() {
			return listOfCoffeeMakerDto.length;
		}
		
		//save operation
		public String onSave(CoffeeMakerDto coffeeMakerDto) {
			boolean checkDuplicate = CoffeeMakerUtil.checkDuplicate(listOfCoffeeMakerDto, coffeeMakerDto);
			//boolean validate = CoffeeMakerUtil.validateFileds(coffeeMakerDto);
			if(coffeeMakerDto != null ) {
				if(!checkDuplicate) {
					if(this.index < listOfCoffeeMakerDto.length) {
						listOfCoffeeMakerDto[index] = coffeeMakerDto;
						index++;
						return "Saved Successfully";
					}
				}
			}
			return "Not Saved";
		}
}
