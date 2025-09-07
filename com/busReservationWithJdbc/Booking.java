package com.busReservationWithJdbc;
import java.sql.SQLException;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {

	

		String passengerName;
		
		int busNo;
		
		Date date;
		
		Booking(){
		
			Scanner sc = new Scanner(System.in);
	System.out.print("Enter name of Passenger: ");

	     passengerName = sc.next();

	System.out.print("Enter bus no : ");

	busNo = sc.nextInt();

	sc.nextLine();

	System.out.print("Enter date dd-mm-yyyy: ");

	String dateInput = sc.next();

	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	try {
		date = dateFormat.parse(dateInput);  // will change to date object from string
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	 
	 public boolean isAvailable() throws SQLException {
		 
		 BusDataAccessObject busdao = new BusDataAccessObject();
		 
		 BookingDAO bookingdao = new BookingDAO();
		
		int capacity = busdao.getCapacity(busNo);
		
//		for(Bus bus:buses) {
//			if(bus.getBusNo() == busNo)
//				capacity = bus.getCapacity();
//		}
		
		int booked = bookingdao.getBookingCount(busNo, date);
//		for(Booking b : bookings) {
//			if(b.busNo == busNo && b.date.equals(date)) {
//			booked++;	
//			}
//		}
		return (booked < capacity)? true: false;
	}


}
