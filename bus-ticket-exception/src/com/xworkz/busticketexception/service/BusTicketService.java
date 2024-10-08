package com.xworkz.busticketexception.service;

import com.xworkz.busticketexception.dto.BusTicketDto;
import com.xworkz.busticketexception.exception.InvalidPriceException;
import com.xworkz.busticketexception.exception.LengthExceededException;
import com.xworkz.busticketexception.exception.NullPointerException;

public interface BusTicketService {
	
	public boolean validate(BusTicketDto dto) throws NullPointerException, InvalidPriceException, LengthExceededException ;

}
