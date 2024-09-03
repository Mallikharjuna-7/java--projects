package com.xworkz.jobapplication.runner;

import com.xworkz.jobapplication.constant.JobRoleAppliedFor;
import com.xworkz.jobapplication.constant.Qualification;
import com.xworkz.jobapplication.dto.JobApplicationDto;
import com.xworkz.jobapplication.service.AbstractJobApplication;
import com.xworkz.jobapplication.service.JobApplicationImplementation;

public class JobApplicationRunner {

	public static void main(String[] args) {
		
		//create instance
		JobApplicationDto jobApplicationDto = new JobApplicationDto();
		
		jobApplicationDto.setApplicantName("Mallikharjuna");
		jobApplicationDto.setEmail("mallikharjuna@gmail.com");
		jobApplicationDto.setPhoneNumber(9988776633L);
		jobApplicationDto.setDob("01-01-2000");
		jobApplicationDto.setJobRoleAppliedFor(JobRoleAppliedFor.DEVELOPER.toString());
		jobApplicationDto.setQualification(Qualification.BTECH.toString());
		jobApplicationDto.setLocation("AndhraPradesh");
		jobApplicationDto.setExperience(2);
		
		System.out.println("JobApplicationDto:"+jobApplicationDto);
		
		AbstractJobApplication abstractJobApplication = new JobApplicationImplementation();
		
		abstractJobApplication.validateApplicantName("Mallikharjuna");
		boolean validateApplicantNameResult = abstractJobApplication.validateApplicantName("Mallikharjuna");
		System.out.println("validateApplicantNameResult:"+validateApplicantNameResult);
		
		abstractJobApplication.validateEmail("mallikharjuna@gmail.com");
		boolean validateEmailResult = abstractJobApplication.validateEmail("mallikharjuna@gmail.com");
		System.out.println("validateEmailResult:"+validateEmailResult);
		
		abstractJobApplication.validateExperience(3);
		boolean validateExperienceResult = abstractJobApplication.validateExperience(3);
		System.out.println("validateExperienceResult:"+validateExperienceResult);
		
		abstractJobApplication.applicationStatus();
		
		AbstractJobApplication.checkQualification();
	}

}
