package com.xworkz.encapsulation.service;

public class Mobile {

	private String brand;
	private String model;
	private byte ram;
	private int internal_storage;
	private float display_size;
	private int battery;
	private String color;
	private byte android_version;
	private boolean stock;
	private int price;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setRAM(byte ram) {
		this.ram = ram;
	}

	public byte getRAM() {
		return ram;
	}

	public void setInternalStorage(int internal_storage) {
		this.internal_storage = internal_storage;
	}

	public int getInternalStorage() {
		return internal_storage;
	}

	public void setDisplaySize(float display_size) {
		this.display_size = display_size;
	}

	public float getDisplaySize() {
		return display_size;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public int getBattery() {
		return battery;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setAndroidVersion(byte android_version) {
		this.android_version = android_version;
	}

	public byte getAndroidVersion() {
		return android_version;
	}

	public void setStockAvailabilty(boolean stock) {
		this.stock = stock;
	}

	public boolean getStockAvailability() {
		return stock;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

}
