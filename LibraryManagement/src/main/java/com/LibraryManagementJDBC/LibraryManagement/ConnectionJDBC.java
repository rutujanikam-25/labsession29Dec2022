package com.LibraryManagementJDBC.LibraryManagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionJDBC {
	static Connection con;
	
	public static Connection CreateCon() {
		try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManagement1","root","nikam");
		if(con.isClosed()) {
			System.out.println("connection is not created ");
		}else {
			System.out.println("Connection is established");
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
	

}
