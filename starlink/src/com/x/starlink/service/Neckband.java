package com.x.starlink.service;

/* method overriding */

public class Neckband extends Earpods{
	
	public String brand = "Boult";
	public String model = "Pro Bass";
	public short battery_backup = 40;
	public String type = "Bluetooth";
	public short range = 15;
	public double b_version = 5.2;
	public boolean water_resistance = false;
	public String color = "Blue";
	public byte warrenty = 1;
	public int price = 1299;
	
	
	
	public Neckband() {
		System.out.println("Neckband Details:");
	}
	
	@Override
	public String brandName() {
		return brand;
	}
	@Override
	public String modelName() {
		return model;
	}
	@Override
	public short batteryBackup() {
		return battery_backup;
	}
	@Override
	public String deviceType() {
		return type;
	}
	@Override
	public short deviceRange() {
		return range;
	}
	@Override
	public double bluetoothVersion() {
		return b_version;	
	}
	@Override
	public boolean waterResistance() {
		return water_resistance;
	}
	@Override
	public String deviceColor() {
		return color;
	}
	@Override
	public byte deviceWarrenty() {
		return warrenty;
	}
	@Override
	public int devicePrice() {
		return price;
	}

}
