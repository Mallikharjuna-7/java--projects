package com.amazon.chargerdetails.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class ChargerDto {
	
	private String chargerBrand;
	private int outputWatts;
	private String madeIn;
	private String color;
	private int price;

}
