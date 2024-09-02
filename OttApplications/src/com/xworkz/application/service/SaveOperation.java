package com.xworkz.application.service;

import com.xworkz.application.dto.ApplicationDto;
import com.xworkz.application.util.ObjectCheck;


public class SaveOperation {
	
	
	
	ApplicationDto moviesList[] = new ApplicationDto[3];
	public int index = 0;
	
	public void saveMovie(ApplicationDto dto) {
		if(validateApplicationName(dto.getApplicationName())) {
			
		if(!ObjectCheck.checkApplicationDto(moviesList, dto)) {
			
			if(this.index < moviesList.length) {
				moviesList[index]=dto;
				System.out.println("Data  saved");
				index++;
				
			}else {
				System.out.println("Data not saved");
			}
			
		}else {
			System.out.println("duplicate");
		}
		}else {
			System.out.println("Propety's not validate check");
		}
		
		
		
	}

	public void read() {
		for (ApplicationDto applicationDto : moviesList) {
			System.out.println(applicationDto);
		}
	}
	
	
	public boolean validateApplicationName(String applicationName) {
		if( applicationName!=null) {
		if(applicationName.isEmpty() && applicationName.length()<3 ) {
			return true;
		} 
		}
		return false;
	}
}



