package com.xworkz.logindetails.runner;

import java.time.LocalDateTime;

import com.xworkz.logindetails.dto.LoginDetailsDto;

public class LoginDeatilsRunner {
	
	public static void main(String[] args) {
		
		LoginDetailsDto loginDeatilsDto = new LoginDetailsDto();
		
		loginDeatilsDto.setUserName("Mallikharjun");
		loginDeatilsDto.setEmailId("mallikharjuna@gamil.com");
		loginDeatilsDto.setPassword("abcd1234");
		loginDeatilsDto.setLoginTime(LocalDateTime.now());
	}

}
