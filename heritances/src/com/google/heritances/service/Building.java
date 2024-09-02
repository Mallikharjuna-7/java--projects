package com.google.heritances.service;

public class Building {
	
	public String building_name;
	public String location;
	public int no_of_floors;
	public int no_of_rooms;
	
	public Building() {
		System.out.println("Buidling details");
	}
	
	public Building(String building_name, String location, int no_of_floors, int no_of_rooms) {
		super();
		this.building_name = building_name;
		this.location = location;
		this.no_of_floors = no_of_floors;
		this.no_of_rooms = no_of_rooms;
	}

	public String getBuilding_name() {
		return building_name;
	}

	public void setBuilding_name(String building_name) {
		this.building_name = building_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNo_of_floors() {
		return no_of_floors;
	}

	public void setNo_of_floors(int no_of_floors) {
		this.no_of_floors = no_of_floors;
	}

	public int getNo_of_rooms() {
		return no_of_rooms;
	}

	public void setNo_of_rooms(int no_of_rooms) {
		this.no_of_rooms = no_of_rooms;
	}

	
	

}
