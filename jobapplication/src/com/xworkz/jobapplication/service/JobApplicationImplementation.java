package com.xworkz.jobapplication.service;

public class JobApplicationImplementation extends AbstractJobApplication {

	
	@Override
	public boolean validateApplicantName(String applicantName) {
		if(applicantName != null && applicantName.length() >= 3) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean validateEmail(String email) {
		if(email != null && email.contains("@") && email.length() >= 3) {
			return true;
		}
		return false;
 	}

	@Override
	public boolean validateExperience(int experience) {
		if(experience > 0 ) {
			return true;
		}
		return false;
	}

	
}
