package com.xworkz.coffie.runner;

import com.xworkz.coffie.constant.CoffieName;
import com.xworkz.coffie.constant.Flavour;
import com.xworkz.coffie.dto.CoffieDto;

public class CoffieRunner {

	public static void main(String[] args) {
		
		CoffieDto coffieDto = new CoffieDto();
		
		coffieDto.setCoffieName(CoffieName.CAPPUCCINO.toString());
		coffieDto.setFlavour(Flavour.CHOCOLATE.toString());
		coffieDto.setPrice(400);
		coffieDto.setCustomerPhoneNumber(9988665533L);
		coffieDto.setQuantity(2);
		CoffieDto coffieDto1 = new CoffieDto();
		
		
		coffieDto1.setCoffieName(CoffieName.CAPPUCCINO.toString());
		coffieDto1.setFlavour(Flavour.CHOCOLATE.toString());
		coffieDto1.setPrice(200);
		coffieDto1.setCustomerPhoneNumber(9988665544L);
		coffieDto1.setQuantity(3);
		
		System.out.println(coffieDto.toString());
		//coffieDto.equals(coffieDto1);
		System.out.println(	coffieDto.equals(coffieDto1));
	}
}