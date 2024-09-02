package com.meta.application.main;
import java.util.Date;
 
public class Whatsapp extends Application {

	public float version;
	public Date lastUpdate;
	public String main_feature;
	public boolean customer_support;
	public double rating;
	
	public String display() {
	return "Application Details:"+"App Name:"+app_name+"  Launched Year:"+launch_year+"  Developed By:"+developed_by+"  Size:"+size+"  Version:"+version+"  Last Updated:"+lastUpdate+
			"  Main feature:"+main_feature+"  Customer Support:"+customer_support+"  Rating:"+rating;
	}
}
