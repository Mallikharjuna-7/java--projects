package com.xworkz.complaintsinformation.repository;

import java.util.List;

import com.xworkz.complaintsinformation.dto.ComplaintDto;

public interface ComplaintRepo {
	
	boolean save(ComplaintDto complaintDto);

	List<ComplaintDto> getAll();
	
	boolean updateById(int complaintId, ComplaintDto complaintDto);
	
	boolean deleteById(int complaintId, ComplaintDto complaintDto);

}
