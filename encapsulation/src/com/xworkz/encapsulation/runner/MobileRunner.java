package com.xworkz.encapsulation.runner;

import com.xworkz.encapsulation.service.Mobile;

public class MobileRunner {

	public static void main(String[] args) {

		Mobile getMobile = new Mobile();

		getMobile.setBrand("Samsung");
		System.out.println("Mobile Brand: " + getMobile.getBrand());

		getMobile.setModel("Galaxy F14");
		System.out.println("Model: " + getMobile.getModel());

		getMobile.setRAM((byte) 6);
		System.out.println("RAM: " + getMobile.getRAM() + " GB");

		getMobile.setInternalStorage(128);
		System.out.println("Internal Storage: " + getMobile.getInternalStorage() + " GB");

		getMobile.setDisplaySize(6.6f);
		System.out.println("Display Size: " + getMobile.getDisplaySize() + " inches");

		getMobile.setBattery(6000);
		System.out.println("Battery: " + getMobile.getBattery() + " mah");

		getMobile.setColor("Green");
		System.out.println("Color: " + getMobile.getColor());

		getMobile.setAndroidVersion((byte) 14);
		System.out.println("Android Version: " + getMobile.getAndroidVersion());

		getMobile.setStockAvailabilty(true);
		System.out.println("is Stock Available: " + getMobile.getStockAvailability());

		getMobile.setPrice(14999);
		System.out.println("Price: " + getMobile.getPrice());
	}

}
