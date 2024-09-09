package com.xworkz.accessoriesdetails.service;

import com.xworkz.accessoriesdetails.dto.ChargerDto;
import com.xworkz.accessoriesdetails.util.ChargerUtil;

public class Charger {

	int index = 0;
	ChargerDto[] listOfChargerDto = new ChargerDto[3];
	
	
	 //save operation
		public String onSave(ChargerDto chargerDto) {
			boolean checkDuplicate = ChargerUtil.checkDuplicate(listOfChargerDto, chargerDto);
			if(chargerDto != null ) {
				if(!checkDuplicate) {
					if(this.index < listOfChargerDto.length) {
						listOfChargerDto[index] = chargerDto;
						index++;
						return "Saved Successfully";
					}
				}
			}
			return "Not Saved";
		}
		public void read() {
			for (ChargerDto dto : listOfChargerDto) {
				System.out.println("Charger Details:" + dto);
			}
		}
		
}
