package com.led.ledapplication.runner;
import com.led.ledapplication.things.TubeLight;

public class LightRunner {

	public static void main(String[] args) {
		
		TubeLight led = new TubeLight();
		
		System.out.println("Brand:"+led.getBrand());
		System.out.println("Color:"+led.getColor());
		System.out.println("Watts:"+led.getWatts());
		System.out.println("Warrenty:"+led.getWarrenty());
		
	}

}
