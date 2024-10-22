package com.abhibus.busbooking.repository;

import com.abhibus.busbooking.dto.BusDetailsDto;

public class BusDetailsRepositoryImplementation implements BusDetailsRepository {

	private BusDetailsDto listOfDto[];
	private int index = 0;

	@Override
	public boolean setArraySize(int arraySize) {
		listOfDto = new BusDetailsDto[arraySize];
		if (arraySize == listOfDto.length) {
			System.out.println("Array size matched");
			return true;
		} else {
			System.out.println("array size not matched");
		}
		return false;
	}

	@Override
	public boolean onSave(BusDetailsDto busDetailsDto) {
		if (listOfDto != null) {
			if (index < listOfDto.length) {
				listOfDto[index] = busDetailsDto;
				index++;
				System.out.println("Save operation done");
				return true;
			}
		}
		System.out.println("Save operation not done");
		return false;
	}

	@Override
	public BusDetailsDto[] read() {

		return listOfDto;
	}

	@Override
	public BusDetailsDto[] checkDuplicate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateByBusNo(String busNumber, BusDetailsDto busDetailsDto) {
		if (busNumber != null) {
			for (int i = 0; i < listOfDto.length; i++) {
				if (listOfDto[i] != null && listOfDto[i].getBusNo() == busNumber) {
					listOfDto[i].setTravellsName(busDetailsDto.getTravellsName());
					listOfDto[i].setTicketPrice(busDetailsDto.getTicketPrice());
					listOfDto[i].setFromCity(busDetailsDto.getFromCity());
					listOfDto[i].setToCity(busDetailsDto.getToCity());
					listOfDto[i].setSeatNo(busDetailsDto.getSeatNo());
					listOfDto[i].setJourneyDate(busDetailsDto.getJourneyDate());

					return true;
				}
			}
		}
		return false;
	}

}
