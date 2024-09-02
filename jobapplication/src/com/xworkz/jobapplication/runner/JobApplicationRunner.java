package com.xworkz.jobapplication.runner;

import com.xworkz.jobapplication.constant.JobRoleAppliedFor;
import com.xworkz.jobapplication.constant.Qualification;
import com.xworkz.jobapplication.dto.JobApplicationDto;

public class JobApplicationRunner {

	public static void main(String[] args) {
		
		//create instance
		JobApplicationDto jobApplicationDto = new JobApplicationDto();
		jobApplicationDto.setApplicantName("Mallikharjuna");
		jobApplicationDto.setEmail("mallikharjuna@gmail.com");
		jobApplicationDto.setPhoneNumber(9988776622L);
		jobApplicationDto.setDob("01-01-2000");
		jobApplicationDto.setJobRoleAppliedFor(JobRoleAppliedFor.DEVELOPER.toString());
		jobApplicationDto.setQualification(Qualification.BTECH.toString());
		jobApplicationDto.setLocation("AndhraPradesh");
		jobApplicationDto.setExperience(2);
		
		System.out.println("JobApplicationDto:"+jobApplicationDto);
	}

}
