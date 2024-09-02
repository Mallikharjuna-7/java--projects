package com.xworkz.logindetails.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString

public class LoginDetailsDto {
	//properties
	private String userName;
	private String emailId;
	private String password;
	private LocalDateTime loginTime;
	
	
	

}
