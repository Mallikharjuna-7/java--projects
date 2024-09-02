package com.xworkz.jobapplication.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class JobApplicationDto {
	
	//properties
	private String applicantName;
	private String email;
	private long phoneNumber;
	private String dob;
	private String jobRoleAppliedFor;
	private String qualification;
	private String location;
	private int experience;

}
