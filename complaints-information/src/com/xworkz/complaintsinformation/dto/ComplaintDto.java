package com.xworkz.complaintsinformation.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class ComplaintDto {
	
	private int complaintId;
	private int userId;
	private String complaintType;
	private String assignedTo;

}
