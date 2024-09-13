package com.xworkz.interfaces.service;

public class MallikharjunResume implements Resume {

	@Override
	public void resumeDetails() {
		System.out.println("Name :"+Resume.name);
		System.out.println("Email :"+Resume.email);
	}
	
	public void projectDetails() {
		System.out.println("Project Name :"+Resume.projectName);
		System.out.println("Project Duration :"+Resume.projectDuration);
	}

	@Override
	public void hobbies() {
		System.out.println("Hobbies: "+Resume.hobbies);
		
	}

	@Override
	public void educationDetails() {
		System.out.println("Qualification: "+Resume.qualification);
		
	}

	@Override
	public void technicalSkills() {
		System.out.println("Technical Skills: "+Resume.skills);
		
	}
}
