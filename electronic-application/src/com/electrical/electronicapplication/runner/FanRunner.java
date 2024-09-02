package com.electrical.electronicapplication.runner;
import com.electrical.electronicapplication.things.AC;

public class FanRunner {

	public static void main(String[] args) {
		
		AC cool = new AC();
		
		System.out.println("Brand:"+cool.getBrand());
		System.out.println("Watts:"+cool.getWatts());
		System.out.println("Enegry Rating Stars:"+cool.getStars());
		System.out.println("Warrenty:"+cool.getWarrenty());
	}
}
