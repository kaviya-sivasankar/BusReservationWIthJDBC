package com.busReservationWithJdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

// it is recommended  not to use jdbc connection in main method because its become clumsy




public class BusDemo {

public static void main(String[] args) throws SQLException {
	
	
	BusDataAccessObject busdao = new BusDataAccessObject();
	
	busdao.displayBusInfo();
		
		// use arraylist collection framework to store list of bus objects flexibly..
		
//		ArrayList<Bus> buses  = new ArrayList<Bus>();
//		
//		ArrayList<Booking> bookings = new ArrayList<Booking>();
//		
//		
//		// add method in arraylist and directly creating object with following parameter values..
//		
//		buses.add(new Bus(1,true, 2));
//		buses.add(new Bus(2,true, 3));
//		buses.add(new Bus(3,true, 4));
		
		
		int userOption = 1;

		Scanner sc = new Scanner(System.in);
		
		// take object from Bus 
//		for(Bus b : buses) {
//			b.displayBusInfo();
//		}
		
		
		while(userOption == 1) {
			System.out.print("Enter option 1 for booking / enter 2 for exit: ");
			
			userOption = sc.nextInt();
			
			if(userOption == 1) {
				Booking booking = new Booking();
				
				if(booking.isAvailable()) {
					BookingDAO bookingdao =new BookingDAO();
					bookingdao.addBooking(booking);
//					bookings.add(booking);
					System.out.println("Booking confirmed...");
				}
				else {
					System.out.println("Sorry No booking available bus full ");
				}
				
			}
			else {
				System.out.println("Exit");
			}
		}
		
	}
	
	
}
