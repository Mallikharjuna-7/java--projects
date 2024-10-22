package com.abhibus.busbooking.repository;

import com.abhibus.busbooking.dto.BusDetailsDto;

public interface BusDetailsRepository {

	boolean setArraySize(int arraySize);

	boolean onSave(BusDetailsDto busDetailsDto);

	BusDetailsDto[] read();

	BusDetailsDto[] checkDuplicate();

	boolean updateByBusNo(String busNumber, BusDetailsDto busDetailsDto);

}
