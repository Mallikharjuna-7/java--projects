package com.xworkz.productdetails.dto;

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

public class ProductDto {
	
	private int productId;
	private String productName;
	private String productType;
	private String productColor;
	private int productPrice;

}
