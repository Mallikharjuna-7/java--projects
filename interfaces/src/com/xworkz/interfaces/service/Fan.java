package com.xworkz.interfaces.service;

public interface Fan {
	
	public static final String brand = "Crompton";
	public static final String model = "Breeze";
	public static final boolean isFanisOn = false;
	public static final int fanSpeed = 4;
	
	
	//abstract Methods
	void fanDetails();
	void fanStatus();
	void speedCheck();
	
}
