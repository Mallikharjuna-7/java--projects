package com.xworkz.interfaces.service;

public interface Light {
	
	public static final String brand = "Havells";
	public static final String type = "LED";
	public static final int watts = 25; 
	public static final boolean isLightisOn = true;
	public static final int warrenty = 1;
	
	void lightDetails();
	void lightStatus();
	void warrentyCheck();

}
