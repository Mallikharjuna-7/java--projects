package com.xworkz.accessoriesdetails.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ChargerDto {

	//properties
	private String brand;
	private int output;
	private String type;
	private String color;
	private int price;
	private int warrenty;
	
	
	
}
