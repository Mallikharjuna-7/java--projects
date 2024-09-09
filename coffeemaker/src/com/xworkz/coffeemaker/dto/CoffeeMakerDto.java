package com.xworkz.coffeemaker.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class CoffeeMakerDto {
	
	//properties
	private String brandName;
	private String model;
	private int productCode;
	private int capacity;
	private String sellerName;
	private int powerConsumption;
	

}
