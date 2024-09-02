package com.xworkz.application.util;

import com.xworkz.application.dto.ApplicationDto;

public class ObjectCheck {
	
	public static boolean checkApplicationDto(ApplicationDto[] listofApplications,ApplicationDto dto ) {
		
		
		for (ApplicationDto applicationDto : listofApplications) {
			
			if(applicationDto!=null && applicationDto.equals(dto)) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}

}
