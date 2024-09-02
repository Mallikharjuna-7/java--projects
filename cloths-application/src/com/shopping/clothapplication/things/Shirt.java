package com.shopping.clothapplication.things;

public class Shirt extends Cloth {
	
	public String type;
	public int size;
	public double rating;
	public int price;
	
	public String display() {
	return "Cloth Details:"+"  Shirt-Brand:"+brand+"  Shirt-Material:"+material+"  Color:"+color+"  Thickness:"+thickness+
			"  Type:"+type+"  Size:"+size+"  Rating:"+rating+"  Price:"+price;
	}

}
