package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.service.Light;
import com.xworkz.interfaces.service.TubeLight;

public class LightRunner {

	public static void main(String[] args) {
		

		Light light = new TubeLight();
		
		light.lightDetails();
		light.lightStatus();
		light.warrentyCheck();

	}

}
