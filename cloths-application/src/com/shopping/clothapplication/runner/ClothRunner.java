package com.shopping.clothapplication.runner;
import com.shopping.clothapplication.things.Cloth;
import com.shopping.clothapplication.things.Shirt;

public class ClothRunner {

	public static void main(String[] args) {
		
		Cloth cloth = new Cloth();

		cloth.brand = "Rare Rabbit";
		cloth.material = "Cotton";
		cloth.color = "Blue";
		cloth.thickness = 1.2f;
		
		System.out.println(cloth.display());
		
		Shirt shirt = new Shirt();
		
		shirt.brand = "US POLO";
		shirt.material = "Cotton";
		shirt.color = "White";
		shirt.thickness = 1.1f;
		shirt.type = "full sleeve";
		shirt.size = 42;
		shirt.rating = 4.5;
		shirt.price = 1200;
		
		System.out.println(shirt.display());		
	}

}
