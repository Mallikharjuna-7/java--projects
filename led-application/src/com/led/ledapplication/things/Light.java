package com.led.ledapplication.things;

public class Light {
	
	private String brand;
	private String color;
	private int watts;
	private int warrenty;
	
	public Light() {
		System.out.println("no argument constructor of Light");
	}
	public Light(String brand,String color,int watts,int warrenty) {
		this.brand = brand;
		this.color = color;
		this.watts = watts;
		this.warrenty = warrenty;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setWatts(int watts) {
		this.watts = watts;
	}
	public int getWatts() {
		return watts;
	}
	public void setWarrenty(int warrenty) {
		this.warrenty = warrenty;
	}
	public int getWarrenty() {
		return warrenty;
	}
}
