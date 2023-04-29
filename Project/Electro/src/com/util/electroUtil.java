package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class electroUtil {

	public static Connection createConnection() 
	{
		Connection conn = null;
		try {
			// import the driver
			Class.forName("com.mysql.jdbc.Driver");
			//Establish the connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/electroproject","root","");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
