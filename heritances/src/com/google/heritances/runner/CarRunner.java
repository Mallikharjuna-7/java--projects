package com.google.heritances.runner;
import com.google.heritances.service.Car;

/* Multiple Inheritance*/

public class CarRunner {

	public static void main(String[] args) {
		
		Car about = new Car();
		
		about.engineCC();
		about.batteryCC();
		about.carPrice();
	}

}
