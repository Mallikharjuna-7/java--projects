package com.xworkz.busticketexception.runner;

import java.util.Scanner;

import com.xworkz.busticketexception.dto.BusTicketDto;
import com.xworkz.busticketexception.exception.InvalidPriceException;
import com.xworkz.busticketexception.exception.LengthExceededException;
import com.xworkz.busticketexception.exception.NullPointerException;
import com.xworkz.busticketexception.service.BusTicketService;
import com.xworkz.busticketexception.service.BusTicketServiceImplement;

public class BusTicketRunner {

	public static void main(String[] args) throws NullPointerException, InvalidPriceException, LengthExceededException {
		System.out.println("main is running");

		try (Scanner scanner = new Scanner(System.in)) {

			BusTicketDto ticket = new BusTicketDto();
			
			System.out.println("Enter the starting point");
			ticket.setStartingPoint(scanner.nextLine());
			
			System.out.println("Enter destination");
			ticket.setDestination(scanner.nextLine());
		
			System.out.println("Enter ticker price");
			ticket.setTicketPrice(scanner.nextInt());
			
			System.out.println("Details :"+ticket);
			
			BusTicketService service = new BusTicketServiceImplement();
			service.validate(ticket);
			
		}catch(java.lang.NullPointerException e) {
			e.printStackTrace();
		}finally {
			System.out.println("this is finally block");
		}
	}

}
