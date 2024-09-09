package com.xworkz.coffeemaker.util;

import com.xworkz.coffeemaker.dto.CoffeeMakerDto;

public class CoffeeMakerUtil {
	
	//checking duplicate
	public static boolean checkDuplicate(CoffeeMakerDto[] listOfCoffeeMakerDto, CoffeeMakerDto dto) {
		for(CoffeeMakerDto coffee : listOfCoffeeMakerDto) {
			if( dto != null && coffee != null && coffee.equals(dto)) {
				return true;
			}
		}
		return false;
	}
	
	//validating Fields
	public static boolean validateFileds(CoffeeMakerDto dto) {
		if(dto != null && dto.getBrandName() != null && dto.getModel() != null && 
				!dto.getBrandName().isEmpty() && dto.getPowerConsumption() > 0) {
		return true;	
		}
	return false;
	}
}
