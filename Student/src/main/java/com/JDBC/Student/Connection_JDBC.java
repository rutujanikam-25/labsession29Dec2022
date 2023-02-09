package com.JDBC.Student;

import java.sql.Connection;
import java.sql.DriverManager;

//JDBC connection
class Connection_JDBC {
	 static Connection con; 
	// create function for JDBC connection
	public static Connection ConnectionJDBC() {
		try {
		 con =DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","nikam");  //connection
		if(con.isClosed()) //check connection established  or not
		{
			System.out.println("Connection is close ");
		}
		else {
			System.out.println("Connection is established");
		}
		
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		return con;    //return connection object 
		
	}
	
	
  
   
  










   
  

}
