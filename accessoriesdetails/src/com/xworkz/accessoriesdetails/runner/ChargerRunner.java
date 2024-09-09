package com.xworkz.accessoriesdetails.runner;

import com.xworkz.accessoriesdetails.dto.ChargerDto;
import com.xworkz.accessoriesdetails.service.Charger;

public class ChargerRunner {

	public static void main(String[] args) {
		
		Charger charger = new Charger();
		
		//instance 1
		ChargerDto chargerDto1 = new ChargerDto();
		
		chargerDto1.setBrand("Samsung");
		chargerDto1.setColor("White");
		chargerDto1.setOutput(25);
		chargerDto1.setPrice(1299);
		chargerDto1.setType("Type C");
		chargerDto1.setWarrenty(1);
		
		System.out.println(chargerDto1);
		System.out.println(charger.onSave(chargerDto1));
		
		//instance 2
		ChargerDto chargerDto2 = new ChargerDto();
				
		chargerDto2.setBrand("Oneplus");
		chargerDto2.setColor("Black");
		chargerDto2.setOutput(45);
		chargerDto2.setPrice(1599);
		chargerDto2.setType("Type C");
		chargerDto2.setWarrenty(2);
		
		System.out.println(chargerDto2);
		System.out.println(charger.onSave(chargerDto2));
		charger.read();
		
		
		
	}

}
