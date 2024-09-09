package com.flipkart.sandwichmaker.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class SandwichMakerDto {

	
	//properties
	private String brand;
	private String model;
	private int watts;
	private String color;
	private int warrenty;
	private int price;
	private boolean stockAvailable;
	private String sellerName;
	private boolean freeDeliveryAvailable;
	private boolean returnPolicyAvaiable;
	
}
