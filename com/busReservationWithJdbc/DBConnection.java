package com.busReservationWithJdbc;

import java.sql.*;

public class DBConnection {

	private static final String url = "jdbc:mysql://localhost:3306/busreservation";
	
	private static final String userName = "";
	
	private static final String password = "";
	
public static Connection getConnection() throws SQLException{
		
		return DriverManager.getConnection(url,userName,password);
		
		
	}
	
	
}
