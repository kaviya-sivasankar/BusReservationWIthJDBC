package com.busReservationWithJdbc;
import java.util.Date;

import java.sql.*;

public class BookingDAO {

	
	public int getBookingCount(int busNo, Date date) throws SQLException{
		
		
		String query ="select count(passenger_name) from booking where bus_no=? and travel_date=?";
		
		Connection con = DBConnection.getConnection();
		
		PreparedStatement prestmt = con.prepareStatement(query);
		
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		
		prestmt.setInt(1, busNo);
		
		prestmt.setDate(2, sqldate);
		
		ResultSet rs = prestmt.executeQuery();
	rs.next();
	
	return rs.getInt(1);
		
	}
	
	public void addBooking(Booking booking) throws SQLException{
		
		String query = "insert into booking values(?,?,?)";
		
		Connection con = DBConnection.getConnection();
		
		java.sql.Date sqldate = new java.sql.Date(booking.date.getTime());
		
		PreparedStatement prestmt = con.prepareStatement(query);
		
		prestmt .setString(1,booking.passengerName);
		prestmt .setInt(2, booking.busNo);
		prestmt .setDate(3,sqldate);
		
		prestmt.executeUpdate();
		
	}
	
	
}
