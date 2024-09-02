package com.pet.animalapplication.things;

public class Cat extends Dog {
	
	public boolean wild;
	public String gender;
	
	public String display() {
		return "Animal Details:"+"  Name:"+name+"  Bread:"+bread+"  Height:"+height+"  Weight:"+height+
				"  Color:"+color+"  Age:"+age+"  Wild animal:"+wild+"  Gender:"+gender;
		}

}
