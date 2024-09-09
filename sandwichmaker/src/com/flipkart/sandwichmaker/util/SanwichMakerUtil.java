package com.flipkart.sandwichmaker.util;

import com.flipkart.sandwichmaker.dto.SandwichMakerDto;

public class SanwichMakerUtil {

	//checking for duplicate
	public static boolean checkDuplicate(SandwichMakerDto[] listOfSandwichMakerDto, SandwichMakerDto dto) {
		for(SandwichMakerDto sandwich : listOfSandwichMakerDto) {
			if(dto != null && sandwich != null &&  sandwich.equals(dto) ) {
				return true;
			}		
		}
		return false;
	}
}
