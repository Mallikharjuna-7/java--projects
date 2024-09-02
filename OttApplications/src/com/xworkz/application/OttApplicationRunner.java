package com.xworkz.application;

import com.xworkz.application.dto.ApplicationDto;
import com.xworkz.application.service.SaveOperation;
import com.xworkz.application.util.Catagory;

public class OttApplicationRunner {

	public static void main(String[] args) {
		
		ApplicationDto dto1=new ApplicationDto();
		
		dto1.setApplicationName("Jio cinima");
		dto1.setProgram("IPL 2025");
		dto1.setCatagory(Catagory.SPORTS.toString());
		dto1.setNoOfviews(1200);
		dto1.setRatings(4.5f);
	
		ApplicationDto dto2=new ApplicationDto();
		dto2.setApplicationName("Amazon prime");
		dto2.setProgram("Kalki");
		dto2.setCatagory(Catagory.MOVIES.toString());
		dto2.setNoOfviews(1200);
		dto2.setRatings(4.5f);
		
		
		
		SaveOperation saveOperation = new SaveOperation();
		
		saveOperation.saveMovie(dto1);
		saveOperation.saveMovie(dto2);
		
		saveOperation.read();
		
		
		
	}
}
