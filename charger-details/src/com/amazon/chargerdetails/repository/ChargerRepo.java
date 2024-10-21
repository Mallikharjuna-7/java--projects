package com.amazon.chargerdetails.repository;

import java.util.Set;

import com.amazon.chargerdetails.dto.ChargerDto;

public interface ChargerRepo {

	boolean save(ChargerDto chargerDto);
	
	Set<ChargerDto> getAll();
}
