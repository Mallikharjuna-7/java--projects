package com.amazon.chargerdetails.service;

import java.util.Set;

import com.amazon.chargerdetails.dto.ChargerDto;

public interface ChargerService {
	
	String validate(ChargerDto chargerDto);
	
	Set<ChargerDto> getAll();

}
