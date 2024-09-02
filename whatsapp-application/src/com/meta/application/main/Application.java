package com.meta.application.main;

public class Application {
	
	public String app_name;
	public int launch_year;
	public String developed_by;
	public int size;

	public String display() {
	return "Application Details:"+"App Name:"+app_name+"  Launched Year:"+launch_year+"  Developed By:"+developed_by+"  Size:"+size;
	}
}
