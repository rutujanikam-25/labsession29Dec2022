package com.JDBC.Student;

import java.sql.Connection;
import java.sql.DriverManager;

class Connection_JDBC {
	 static Connection con;
	
	public static Connection ConnectionJDBC() {
		try {
		 con =DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","nikam");
		if(con.isClosed()){
			System.out.println("Connection is close ");
		}
		else {
			System.out.println("Connection is established");
		}
		
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
		
	}
	
	
  
   
  










   
  

}
