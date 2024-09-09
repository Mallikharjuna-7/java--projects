package com.xworkz.accessoriesdetails.util;

import com.xworkz.accessoriesdetails.dto.ChargerDto;

public class ChargerUtil {
	
	//checking for duplicate
	public static boolean checkDuplicate(ChargerDto[] listOfChargerDto, ChargerDto dto) {
		for(ChargerDto charger : listOfChargerDto) {
			if(dto != null && charger != null &&  charger.equals(dto) ) {
				return true;
			}		
		}
		return false;
	}

}
