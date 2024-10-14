package com.xworkz.constructors.service;

public class Car {

	public String carBrand;
	public String model;
	public int mileage;
	public String type;
	public String color;
	public int launchYear;
	public int seatingCapacity;
	public int maxSpeed;
	public double safteyRating;
	public int engineCapacity;

	public static int price;
	public static String fuelType;

	public Car() {
		this ("BMW");
		System.out.println("Car Details");
	}

	public Car(String carBrand) {
		this ("BMW","X5");
		this.carBrand = carBrand;
		System.out.println("Car Brand: "+carBrand);
	}

	public Car(String carBrand, String model) {
		this ("BMW","X5",18);
		this.model = model;
		System.out.println("Model: "+model);
	}

	public Car(String carBrand, String model, int mileage) {
		this ("BMW","X5",18,"Manual");
		this.mileage = mileage;
		System.out.println("Mileage: "+mileage);
	}

	public Car(String carBrand, String model, int mileage, String type) {
		this ("BMW","X5",18,"Manual","Blue");
		this.type = type;
		System.out.println("Type: "+type);
	}

	public Car(String carBrand, String model, int mileage, String type, String color) {
		this ("BMW","X5",18,"Manual","Blue",2024);
		this.color = color;
		System.out.println("Color: "+color);
	}

	public Car(String carBrand, String model, int mileage, String type, String color, int launchYear) {
		this ("BMW","X5",18,"Manual","Blue",2024,5);
		this.launchYear = launchYear;
		System.out.println("Launch Year: "+launchYear);
	}

	public Car(String carBrand, String model, int mileage, String type, String color, int launchYear,
			int seatingCapacity) {
		this ("BMW","X5",18,"Manual","Blue",2024,5,360);
		this.seatingCapacity = seatingCapacity;
		System.out.println("Seating Capacity: "+seatingCapacity);
	}

	public Car(String carBrand, String model, int mileage, String type, String color, int launchYear,
			int seatingCapacity, int maxSpeed) {
		this ("BMW","X5",18,"Manual","Blue",2024,5,360,4.7);
		this.maxSpeed = maxSpeed;
		System.out.println("Max speed: "+maxSpeed);
	}

	public Car(String carBrand, String model, int mileage, String type, String color, int launchYear,
			int seatingCapacity, int maxSpeed, double safteyRating) {
		this ("BMW","X5",18,"Manual","Blue",2024,5,360,4.7,1400);
		this.safteyRating = safteyRating;
		System.out.println("Saftey Rating: "+safteyRating);
	}

	public Car(String carBrand, String model, int mileage, String type, String color, int launchYear,
			int seatingCapacity, int maxSpeed, double safteyRating, int engineCapacity) {
		this.engineCapacity = engineCapacity;
		System.out.println("Engine Capacity: "+engineCapacity+"cc");
	}

}
