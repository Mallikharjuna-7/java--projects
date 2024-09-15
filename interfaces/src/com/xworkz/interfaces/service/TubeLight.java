package com.xworkz.interfaces.service;

public class TubeLight implements Light {

	@Override
	public void lightDetails() {
		System.out.println("Light Brand: "+Light.brand);
		System.out.println("Type: "+Light.type);
		System.out.println("Watts: "+Light.watts);
	}

	@Override
	public void lightStatus() {
		if(Light.isLightisOn == true) {
			System.out.println("Light is ON");
		}else {
			System.out.println("Light is OFF");
		}
	}

	@Override
	public void warrentyCheck() {
		if(Light.warrenty > 0) {
			System.out.println("Light have Warrenty");
			System.out.println("Warrenty: "+Light.warrenty);
		}else {
			System.out.println("No Warrenty");
		}
	}

}
