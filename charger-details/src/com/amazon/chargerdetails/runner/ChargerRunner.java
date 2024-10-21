package com.amazon.chargerdetails.runner;

import com.amazon.chargerdetails.dto.ChargerDto;
import com.amazon.chargerdetails.repository.ChargerRepoImplementation;
import com.amazon.chargerdetails.service.ChargerService;
import com.amazon.chargerdetails.service.ChargerServiceImplementation;

public class ChargerRunner {

	public static void main(String[] args) {

		ChargerDto dto = new ChargerDto();
		
		dto.setChargerBrand("Samsung");
		dto.setOutputWatts(25);
		dto.setMadeIn("India");
		dto.setColor("White");
		dto.setPrice(1299);
		
		ChargerService chargerService = new ChargerServiceImplementation(new ChargerRepoImplementation());
		
		//validation & save
		System.out.println(chargerService.validate(dto));
		
		//read
		System.out.println(chargerService.getAll());
	}

}
