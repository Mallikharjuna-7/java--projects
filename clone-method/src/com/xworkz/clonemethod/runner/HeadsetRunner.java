package com.xworkz.clonemethod.runner;

//shallow cloning 

public class HeadsetRunner {

	public static void main(String[] args) {
		System.out.println("Main method is running");

		Headset headset = new Headset();
		headset.brand = "SONY";
		headset.model = "WH-CH520";
		headset.btVersion = 5.3;
		headset.color = "Black";
		headset.withMic = true;
		headset.batteryBackup = 50;
		headset.isANC = true;
		headset.price = 3999;
		System.out.println("Headset Details :" + headset);

		try {
			Headset headset1 = headset.clone();
			headset1.brand = "Boat";
			headset1.model = "Rockerz 551";
			headset1.btVersion = 5.2;
			headset1.color = "White";
			headset1.withMic = true;
			headset1.batteryBackup = 100;
			headset1.isANC = true;
			headset1.price = 2999;
			System.out.println("Cloned Headset Details :" + headset1);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();

		} finally {
			System.out.println("MUSIC");
		}

	}

}
