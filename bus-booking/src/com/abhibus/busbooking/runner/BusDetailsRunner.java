package com.abhibus.busbooking.runner;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.abhibus.busbooking.dto.BusDetailsDto;
import com.abhibus.busbooking.service.BusDetails;
import com.abhibus.busbooking.service.BusDetailsImplementation;

public class BusDetailsRunner {

	public static void main(String[] args) {

		BusDetailsDto busDetailsDto = new BusDetailsDto();

		busDetailsDto.setTravellsName("Orange Travells");
		busDetailsDto.setBusNo("AP05MM7700");
		busDetailsDto.setTicketPrice(2500);
		busDetailsDto.setFromCity("Rajamundry");
		busDetailsDto.setToCity("Bangalore");
		busDetailsDto.setSeatNo(4);
		busDetailsDto.setJourneyDate(LocalDateTime.of(2024, 9, 20, 06, 30));
		
		BusDetailsDto busDetailsDto1 = new BusDetailsDto();

		busDetailsDto1.setTravellsName("Tejas Travells");
		busDetailsDto1.setBusNo("AP05MM8800");
		busDetailsDto1.setTicketPrice(2300);
		busDetailsDto1.setFromCity("Bangalore");
		busDetailsDto1.setToCity("Rajamundry");
		busDetailsDto1.setSeatNo(6);
		busDetailsDto1.setJourneyDate(LocalDateTime.of(2024, 9, 19, 10, 30));

		Scanner scanner = new Scanner(System.in);

		BusDetails busDetails = new BusDetailsImplementation();

		System.out.println("Enter the Array Size");
		int arraySize = scanner.nextInt();

		busDetails.setArraySize(arraySize);
		
		System.out.println("Save Result: "+busDetails.validateAndSave(busDetailsDto));
		
		System.out.println("Save Result: "+busDetails.validateAndSave(busDetailsDto1));
		
		busDetails.read();
		
		System.out.println("Update Result: "+busDetails.updateByBusNo("AP05MM7700", busDetailsDto1));
		
		busDetails.read();
		
	}

}
