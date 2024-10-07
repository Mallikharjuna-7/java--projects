package com.xworkz.clonemethod.runner;

//shallow cloning 

public class Headset implements Cloneable {

	public String brand;
	public String model;
	public double btVersion;
	public String color;
	public boolean withMic;
	public int batteryBackup;
	public boolean isANC;
	public int price;

	@Override
	public Headset clone() throws CloneNotSupportedException {
		System.out.println("Clone method invoked");
		return (Headset) super.clone();
	}

	@Override
	public String toString() {
		return "Headset [brand=" + brand + ", model=" + model + ", btVersion=" + btVersion + ", color=" + color
				+ ", withMic=" + withMic + ", batteryBackup=" + batteryBackup + ", isANC=" + isANC + ", price=" + price
				+ "]";
	}

}
