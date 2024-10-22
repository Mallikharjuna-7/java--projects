package com.abhibus.busbooking.service;

import com.abhibus.busbooking.dto.BusDetailsDto;

public interface BusDetails {

	boolean setArraySize(int arraySize);

	String validateAndSave(BusDetailsDto busDetailsDto);

	void read();
	
	boolean checkDuplicate(BusDetailsDto dto);
	
	String updateByBusNo(String busNumber, BusDetailsDto busDetailsDto);
}
