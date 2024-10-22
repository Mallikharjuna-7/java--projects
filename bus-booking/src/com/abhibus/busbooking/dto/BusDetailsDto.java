package com.abhibus.busbooking.dto;

import java.time.LocalDateTime;

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

public class BusDetailsDto {
	
	//properties
	private String travellsName;
	private String  busNo;
	private int ticketPrice;
	private String fromCity;
	private String toCity;
	private int seatNo;
	private LocalDateTime journeyDate;
	

}
