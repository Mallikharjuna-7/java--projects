package com.xworkz.busticketexception.service;

import com.xworkz.busticketexception.dto.BusTicketDto;
import com.xworkz.busticketexception.exception.InvalidPriceException;
import com.xworkz.busticketexception.exception.LengthExceededException;
import com.xworkz.busticketexception.exception.NullPointerException;

public class BusTicketServiceImplement implements BusTicketService {

	@Override
	public boolean validate(BusTicketDto dto) throws NullPointerException, InvalidPriceException, LengthExceededException  {
		if (dto != null) {
			if (dto.getStartingPoint().length() > 3 && dto.getStartingPoint().length() < 50) {
				if (dto.getDestination().length() > 3 && dto.getDestination().length() < 50) {
					if (dto.getTicketPrice() != 0) {
						System.out.println("Validated");
						return true;
					}
					throw new InvalidPriceException("Ticket price must be > 0");
				}
				throw new LengthExceededException("Destination is must be > 3  & <50.. Enter proper values");
			}
			throw new LengthExceededException("StartingPoint is must be > 3  & <50.. Enter proper values");
		}
		throw new NullPointerException("dto is null");
	}

}
