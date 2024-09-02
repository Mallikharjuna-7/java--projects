package com.pet.animalapplication.runner;
import com.pet.animalapplication.things.Animal;
import com.pet.animalapplication.things.Dog;
import com.pet.animalapplication.things.Cat;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Animal pet1 = new Animal();
		
		pet1.name = "Rocky";
		pet1.bread = "Golden Retriever";
		pet1.height = 2;
		pet1.weight = 31;
		
		System.out.println(pet1.display());
		
		Dog pet2 = new Dog();
		
		pet2.name = "Blacky";
		pet2.bread = "Rottweiler";
		pet2.height = 3;
		pet2.weight = 45;
		pet2.color = "Black";
		pet2.age = 3;
		
		System.out.println(pet2.display());
		
		Cat pet3 = new Cat();
		
		pet3.name = "Kutty";
		pet3.bread = "Persian Cat";
		pet3.height = 1;
		pet3.weight = 18;
		pet3.color = "Brown";
		pet3.age = 2;
		pet3.gender = "female";
		pet3.wild = false;
		
		System.out.println(pet3.display());
		
		

	}

}
