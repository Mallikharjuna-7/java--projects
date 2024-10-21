package com.amazon.chargerdetails.repository;

import java.util.HashSet;
import java.util.Set;

import com.amazon.chargerdetails.dto.ChargerDto;

public class ChargerRepoImplementation implements ChargerRepo {

	Set<ChargerDto> chargerSet = new HashSet<ChargerDto>();
	
	@Override
	public boolean save(ChargerDto chargerDto) {
		System.out.println("save method is running");
		return chargerSet.add(chargerDto);
	}

	@Override
	public Set<ChargerDto> getAll() {
		
		return chargerSet;
	}

}
