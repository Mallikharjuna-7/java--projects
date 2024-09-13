package com.xworkz.interfaces.service;

public interface Resume {

	
	public static final String name = "Mallikharjun Dwarapureddi";
	public static final String email ="mallikharjuna.workz@gmail.com";
	public static final String projectName ="Steps Claimbing Trolley";
	public static final String projectDuration = "6 months";
	public static final String hobbies ="Watching Movies";
	public static final String qualification ="B.Tech";
	public static final String skills ="Java,SQL,HTML,CSS,JS";
	

	//abstract methods
	void resumeDetails();
	void projectDetails();
	void hobbies();
	void educationDetails();
	void technicalSkills();
}
