package com.xworkz.vendorinformation.repository;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.vendorinformation.dto.VendorDto;

public class VendorRepoImplimentation implements VendorRepo {

	LinkedList<VendorDto> linkedList = new LinkedList<VendorDto>();

	@Override
	public boolean save(VendorDto vendorDto) {
		System.out.println("save method running");
		return linkedList.add(vendorDto);
	}

	@Override
	public List<VendorDto> getAll() {

		return linkedList;
	}

	@Override
	public boolean updateById(int vendorId, VendorDto vendorDto) {
		if (!linkedList.isEmpty()) {
			for (int i = 0; i < linkedList.size(); i++) {
				if (linkedList.get(i).getVendorId() == vendorId) {
					linkedList.set(i, vendorDto);
					return true;
				}else {
					System.out.println("Vendor Id not Matched to update ");
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteById(int vendorId, VendorDto vendorDto) {
		if (!linkedList.isEmpty()) {
			for (int i = 0; i < linkedList.size(); i++) {
				if (linkedList.get(i).getVendorId() == vendorId) {
					linkedList.remove();
					return true;
				}else {
					System.out.println("Vendor Id not Matched to delete ");
				}
			}
		}
		return false;
	}

}
