package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.service.Fan;
import com.xworkz.interfaces.service.TableFan;

public class FanRunner {

	public static void main(String[] args) {
		
		Fan fan = new TableFan();
		
		fan.fanDetails();
		fan.fanStatus();
		fan.speedCheck();

	}

}
