package com.google.heritances.service;

/* Multiple Inheritance*/

public class Car implements Engine, Battery {
	
	int car_price = 900000;

	@Override
	public void engineCC() {
		System.out.println("Engine Capacity:"+engine_capacity+"cc");
		
	}

	@Override
	public void batteryCC() {
		System.out.println("Battery Capacity:"+battery_capacity+"kWh");
		
	}
	
	public void carPrice() {
		System.out.println("Car Price:"+car_price);
	}

}
