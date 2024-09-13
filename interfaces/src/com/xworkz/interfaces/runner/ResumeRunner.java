package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.service.MallikharjunResume;
import com.xworkz.interfaces.service.Resume;

public class ResumeRunner {

	public static void main(String[] args) {
		
		Resume resume = new MallikharjunResume();
		
		resume.resumeDetails();
		resume.projectDetails();
		resume.hobbies();
		resume.educationDetails();
		resume.technicalSkills();
	}

}
