package com.xworkz.jobapplication.service;

public abstract class AbstractJobApplication {
	
	//abstract methods
	public abstract boolean validateApplicantName(String applicantName);
	public abstract boolean validateEmail(String email);
	public abstract boolean validateExperience(int experience);
	
	//instance methods
	public void applicationStatus() {
    	boolean status=true;
    	if(status) {
    		System.out.println("application Submitted");
    	}else {
    		System.out.println("submission failed");
    	}	
    }
	
	//static methods
	public static void checkQualification() {
    	boolean qualification =true;
    	if(qualification) {
    		System.out.println("Applicant is eligible");
    	}else {
    		System.out.println("Applicant is eligible");
    	}
    }

}
