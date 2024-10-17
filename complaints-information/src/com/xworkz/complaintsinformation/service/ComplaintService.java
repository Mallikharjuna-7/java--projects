package com.xworkz.complaintsinformation.service;

import java.util.List;

import com.xworkz.complaintsinformation.dto.ComplaintDto;

public interface ComplaintService {
	
	String validate(ComplaintDto complaintDto);
	
	List<ComplaintDto> getAll();
	
	String updateById(int complaintId, ComplaintDto complaintDto);
	
	String deleteById(int complaintId, ComplaintDto complaintDto);


}
