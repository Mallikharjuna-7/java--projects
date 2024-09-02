package com.google.heritances.runner;
import com.google.heritances.service.Room;

public class BuildingRunner {
	
	public static void main(String[] args) {
		
		Room room = new Room();
		
		System.out.println("Building Name:"+room.getBuilding_name());
		System.out.println("Location:"+room.getLocation());
		System.out.println("Floors:"+room.getNo_of_floors());
		System.out.println("Rooms:"+room.getNo_of_rooms());
		
		
	}

}
