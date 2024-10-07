package com.xworkz.clonemethod.runner;

//shallow cloning 

public class PropertiesRunner {

	public static void main(String[] args) {

		System.out.println("Main method is running");

		Properties properties = new Properties();
		properties.name = "Ganesh";
		properties.price = 2;
		System.out.println("Properties :" + properties);

		try {
			Properties properties1 = properties.clone();
			properties1.name = "Ganesh Venkat Sai";
			properties1.price = 4;
			System.out.println("cloned Properties  :" + properties1);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();

		} finally {
			System.out.println("this is finally block");
		}
	}

}
