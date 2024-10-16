package com.xworkz.vendorinformation.dto;

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

public class VendorDto {
	
	private int vendorId;
	private String vendorName;
	private String productType;
	private String vendorEmailId;
	private long vendorContactNumber;

}
