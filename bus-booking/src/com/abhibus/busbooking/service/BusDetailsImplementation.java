package com.abhibus.busbooking.service;

import com.abhibus.busbooking.dto.BusDetailsDto;
import com.abhibus.busbooking.repository.BusDetailsRepositoryImplementation;

public class BusDetailsImplementation implements BusDetails {

	BusDetailsRepositoryImplementation busDetailsRepo = new BusDetailsRepositoryImplementation();

	@Override
	public boolean setArraySize(int arraySize) {
		if (arraySize > 0) {
			System.out.println("given array size valid");
			busDetailsRepo.setArraySize(arraySize);
			return true;
		} else {
			System.out.println("Enter proper values, arraysize must be > 0 ");
		}
		return false;
	}

	@Override
	public String validateAndSave(BusDetailsDto busDetailsDto) {
		if (busDetailsDto != null) {
			System.out.println("dto is not null, we can save");
			if (busDetailsRepo.onSave(busDetailsDto)) {
				return "Saved successfully";

			}
		}
		return "not saved";
	}

	@Override
	public void read() {
		BusDetailsDto[] listOfDtos = busDetailsRepo.read();
		for (BusDetailsDto busDetailsDto : listOfDtos) {
			System.out.println(busDetailsDto);
		}

	}

	@Override
	public boolean checkDuplicate(BusDetailsDto dto) {
		BusDetailsDto[] listOfDtos = busDetailsRepo.checkDuplicate();
		for (BusDetailsDto busDetailsDto : listOfDtos) {
			if (busDetailsDto.equals(dto)) {
				System.out.println("Duplicate values found");
				return true;
			} else {
				System.out.println("Duplicate not found");
				return false;
			}
		}
		return false;
	}

	@Override
	public String updateByBusNo(String busNumber, BusDetailsDto busDetailsDto) {
		if(busNumber != null) {
			busDetailsRepo.updateByBusNo(busNumber, busDetailsDto);
			return "Updated Successfully";
		}
		return "Not Updated";
		
	}

}
