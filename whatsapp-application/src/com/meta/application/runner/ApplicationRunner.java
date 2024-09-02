package com.meta.application.runner;
import com.meta.application.main.Application;
import com.meta.application.main.Whatsapp;
import java.util.Date;

public class ApplicationRunner {

	public static void main(String[] args) {
		
		Application app = new Application();
		
		app.app_name = "Instagram";
		app.launch_year = 2010;
		app.developed_by = "Meta platforms";
		app.size = 50;
		
		System.out.println(app.display());
		
		Whatsapp what = new Whatsapp();
		
		what.app_name = "Whatsapp";
		what.launch_year = 2009;
		what.developed_by = "Meta platforms";
		what.size = 48;
		what.version = 2.47f;
		what.lastUpdate = new Date();
		what.main_feature = "Messaging";
		what.customer_support = true;
		what.rating = 4.5;
		
		System.out.println(what.display());
	}

}
