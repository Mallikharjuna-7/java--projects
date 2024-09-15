package com.xworkz.interfaces.service;

public class MyInstagram implements Instagram {

	@Override
	public void userDetails() {
		System.out.println("User Name:"+Instagram.userName);
		System.out.println("Email Id:"+Instagram.emailId);;
		
	}

	@Override
	public void accountDeatils() {
		System.out.println("No Of Followers:"+Instagram.noOfFollowers);
		System.out.println("No Of Followers:"+Instagram.noOfPosts);
	}

	@Override
	public void accountStatus() {
		System.out.println("is Account is Active:"+Instagram.isAccountActive);
	}
	
	

}
