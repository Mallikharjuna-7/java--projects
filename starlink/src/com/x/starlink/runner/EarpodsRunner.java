package com.x.starlink.runner;
import com.x.starlink.service.Neckband;

/* method overriding */

public class EarpodsRunner {

	public static void main(String[] args) {
		
		Neckband bt = new Neckband();
		
		System.out.println("Brand:"+bt.brandName());
		System.out.println("Model:"+bt.modelName());
		System.out.println("Battery Backup:"+bt.batteryBackup());
		System.out.println("Device Type:"+bt.deviceType());
		System.out.println("Range:"+bt.deviceRange());
		System.out.println("BT Version:"+bt.bluetoothVersion());
		System.out.println("Water Resistance:"+bt.waterResistance());
		System.out.println("Color:"+bt.deviceColor());
		System.out.println("Warrenty:"+bt.deviceWarrenty());
		System.out.println("Price:"+bt.devicePrice());

	}

}