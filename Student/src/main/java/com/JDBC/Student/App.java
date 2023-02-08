package com.JDBC.Student;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	System.out.println("1. Insert Data  \n 2. Update Data \n 3. Delete Data \n 4. Show all data");
    	Scanner sc=new Scanner(System.in);
    	System.out.println("choose any one operation :");
    	int choose=sc.nextInt();
    	
    	switch(choose) {
    	case 1:method.insertData();
    	       break;
    	case 2:method.updateData();
    	        break;
    	case 3:method.deleteData();
        break;
    	case 4:method.showData();
        break;
        default:
        	System.out.println("something wrong");
    	}
    }
}

