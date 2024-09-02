package com.electrical.electronicapplication.things;

//multi-level inheritance..

public class Fan {
	
	private String brand;
	private int watts;
	private int energy_stars;
	private int warrenty;

	
	public Fan() {
		System.out.println("No argument constructor of Fan");
	}
	public Fan(String brand,int watts,int energy_stars,int warrenty) {
		this.brand = brand;
		this.watts = watts;
		this.energy_stars = energy_stars;
		this.warrenty = warrenty;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setWatts(int watts) {
		this.watts = watts;
	}
	public int getWatts() {
		return this.watts;
	}
	public void setStars(int energy_stars) {
		this.energy_stars = energy_stars;
	}
	public int getStars() {
		return this.energy_stars;
	}
	public void setWarrenty(int warrenty) {
		this.warrenty = warrenty;
	}
	public int getWarrenty() {
		return this.warrenty;
	}
}
