package com.x.starlink.service;

/* method overriding */

public class Earpods {

	public String brand = "Boat";
	public String model = "Astra";
	public short battery_backup = 25;
	public String type = "Bluetooth";
	public short range = 10;
	public double b_version = 5.3;
	public boolean water_resistance = true;
	public String color = "Black";
	public byte warrenty = 1;
	public int price = 1799;
	
	public Earpods() {
		System.out.println("Earpods Details:");
	}
	
	public String brandName() {
		return brand;
	}
	public String modelName() {
		return model;
	}
	public short batteryBackup() {
		return battery_backup;
	}
	public String deviceType() {
		return type;
	}
	public short deviceRange() {
		return range;
	}
	public double bluetoothVersion() {
		return b_version;	
	}
	public boolean waterResistance() {
		return water_resistance;
	}
	public String deviceColor() {
		return color;
	}
	public byte deviceWarrenty() {
		return warrenty;
	}
	public int devicePrice() {
		return price;
	}
}
