package com.xworkz.complaintsinformation.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.complaintsinformation.dto.ComplaintDto;

public class ComplaintRepoImplementation implements ComplaintRepo {

	List<ComplaintDto> complaints = new ArrayList<ComplaintDto>();

	@Override
	public boolean save(ComplaintDto complaintDto) {
		System.out.println("save method running");
		return complaints.add(complaintDto);
	}

	@Override
	public List<ComplaintDto> getAll() {
		
		return complaints;
	}

	@Override
	public boolean updateById(int complaintId, ComplaintDto complaintDto) {
		if (!complaints.isEmpty()) {
			for (int i = 0; i < complaints.size(); i++) {
				if (complaints.get(i).getComplaintId() == complaintId) {
					complaints.set(i, complaintDto);
					return true;
				} else {
					System.out.println("Complaint Id not Matched to update ");
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteById(int complaintId, ComplaintDto complaintDto) {
		if (!complaints.isEmpty()) {
			for (int i = 0; i < complaints.size(); i++) {
				if (complaints.get(i).getComplaintId() == complaintId) {
					complaints.remove(complaintDto);
					return true;
				} else {
					System.out.println("complaint Id not Matched to delete ");
				}
			}
		}
		return false;
	}
}
