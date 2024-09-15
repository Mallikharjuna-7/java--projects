package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.service.Instagram;
import com.xworkz.interfaces.service.MyInstagram;

public class InstagramRunner {

	public static void main(String[] args) {
		
		Instagram instagram = new MyInstagram();
		
		instagram.userDetails();
		instagram.accountDeatils();
		instagram.accountStatus();

	}

}
