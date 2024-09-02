package com.xworkz.application.dto;

import lombok.*;

@Setter
@Getter
@ToString
public class ApplicationDto extends Object{
	
	private String applicationName;
	private String program;
	private String catagory;
	private int noOfviews;
	private float ratings;
	
	public ApplicationDto() {
		
	}
	
	

	public ApplicationDto(String applicationName, String program, String catagory, int noOfviews, float ratings) {
	
		this.applicationName = applicationName;
		this.program = program;
		this.catagory = catagory;
		this.noOfviews = noOfviews;
		this.ratings = ratings;
	}

//	@Override
//	public String toString() {
//		return "ApplicationDto [applicationName=" + getApplicationName() + ", program=" + program + ", catagory=" + catagory
//				+ ", noOfviews=" + noOfviews + ", ratings=" + ratings + "]";
//	}
	
	

	

}
