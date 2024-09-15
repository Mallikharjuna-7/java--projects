package com.xworkz.interfaces.service;

public class TableFan implements Fan {

	@Override
	public void fanDetails() {
		System.out.println("Fan Brand: "+Fan.brand);
		System.out.println("Model :"+Fan.model);
	}

	@Override
	public void fanStatus() {
		if(Fan.isFanisOn == true){
		System.out.println("Fan is on");
		}else {
		System.out.println("Fan is off");
		}
	}

	@Override
	public void speedCheck() {
		if(Fan.fanSpeed == 5) {
			System.out.println("Fan on max speed");
		}else {
			System.out.println("Increase fan Speed");
			System.out.println("fan speed:"+Fan.fanSpeed);
		}
	}

}
