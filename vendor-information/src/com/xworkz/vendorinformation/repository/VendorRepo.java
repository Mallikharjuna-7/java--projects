package com.xworkz.vendorinformation.repository;

import java.util.List;

import com.xworkz.vendorinformation.dto.VendorDto;

public interface VendorRepo {
	
	boolean save(VendorDto vendorDto);

	List<VendorDto> getAll();
	
	boolean updateById(int vendorId, VendorDto vendorDto);
	
	boolean deleteById(int vendorId, VendorDto vendorDto);
}
