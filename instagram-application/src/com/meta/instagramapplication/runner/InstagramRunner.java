package com.meta.instagramapplication.runner;
import com.meta.instagramapplication.things.Instagram;

public class InstagramRunner {

	public static void main(String[] args) {
		
	Instagram insta = new Instagram();
	
	insta.setUserName("Mallikharjuna");
	insta.setPassword("ABC123");
	insta.setFollowers(259);
	insta.setPosts(47);
	insta.setCreatedYear(2018);
	
	System.out.println("User Name:"+insta.getUserName());
	System.out.println("Password:"+insta.getPassword());
	System.out.println("Followers:"+insta.getFollowers());
	System.out.println("Posts:"+insta.getPosts());
	System.out.println("Created in:"+insta.getCreatedYear());
	
	}

}
