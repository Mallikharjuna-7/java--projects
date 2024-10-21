package com.amazon.chargerdetails.service;

import java.util.Set;

import com.amazon.chargerdetails.dto.ChargerDto;
import com.amazon.chargerdetails.repository.ChargerRepoImplementation;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ChargerServiceImplementation implements ChargerService {

	private ChargerRepoImplementation repoImp;

	@Override
	public String validate(ChargerDto chargerDto) {
		System.out.println("Validation is running");
		if (chargerDto != null) {
			if (repoImp.save(chargerDto)) {
				return "Saved successfully";
			}
			return "not saved";
		}
		return "dto is null.. not valid";
	}

	@Override
	public Set<ChargerDto> getAll() {
		
		return repoImp.getAll();
	}

}
