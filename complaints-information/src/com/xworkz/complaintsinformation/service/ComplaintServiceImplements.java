package com.xworkz.complaintsinformation.service;

import java.util.List;

import com.xworkz.complaintsinformation.dto.ComplaintDto;
import com.xworkz.complaintsinformation.repository.ComplaintRepoImplementation;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ComplaintServiceImplements implements ComplaintService {
	
	private ComplaintRepoImplementation repoImp;

	@Override
	public String validate(ComplaintDto complaintDto) {
		System.out.println("validate is running");
		if (complaintDto != null) {
			if (repoImp.save(complaintDto)) {
				return "saved successfully";
			}
			return "not saved";
		}
		return "Not validated.. null";
	}

	@Override
	public List<ComplaintDto> getAll() {

		return repoImp.getAll();
	}

	@Override
	public String updateById(int complaintId, ComplaintDto complaintDto) {
		if (complaintId > 0) {
			if (repoImp.updateById(complaintId, complaintDto)) {
				return "updated successfully";
			}
		}
		return "not updated";
	}

	@Override
	public String deleteById(int complaintId, ComplaintDto complaintDto) {
		if (complaintId > 0) {
			if (repoImp.deleteById(complaintId, complaintDto)) {
				return "deleted successfully";
			}
		}
		return "not deleted";
	}

}
