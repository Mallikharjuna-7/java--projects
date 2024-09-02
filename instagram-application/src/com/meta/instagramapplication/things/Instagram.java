package com.meta.instagramapplication.things;

public class Instagram {
	
	private String user_name;
	private String password;
	private int no_of_followers;
	private int no_of_posts;
	private int created_in;
	
	public Instagram() {
		System.out.println("Instagram Details:");
	}
	public Instagram(String user_name, String password, int no_of_followers, int no_of_posts,int created_in ) {
	this.user_name = user_name;
	this.password = password;
	this.no_of_followers = no_of_followers;
	this.no_of_posts = no_of_posts;
	this.created_in = created_in;
	}
	
	public void setUserName(String user_name) {
	this.user_name = user_name;
	}
	public String getUserName() {
	return this.user_name;
	}
	public void setPassword(String password) {
	this.password = password;
	}
	public String getPassword() {
	return this.password;
	}
	public void setFollowers(int no_of_followers) {
	this.no_of_followers = no_of_followers;
	}
	public int getFollowers() {
	return this.no_of_followers;
	}
	public void setPosts(int no_of_posts) {
	this.no_of_posts = no_of_posts;
	}
	public int getPosts() {
	return this.no_of_posts;
	}
	public void setCreatedYear(int created_in) {
	this.created_in = created_in;
	}
	public int getCreatedYear() {
	return this.created_in;
	}

}
