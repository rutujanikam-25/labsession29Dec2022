package com.JDBC.Student;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class method {
	 static Scanner sc=new Scanner(System.in);
	 public static void insertData(){
		 try {
			Connection con =Connection_JDBC.ConnectionJDBC();
			String q="insert into students(Id,sName,Age,BOD) values(?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			System.out.print("Enter Id :");
			int id=sc.nextInt();
			System.out.print("\n Enter name :");
			String name=sc.next();
			System.out.print("\n Enter age :");
			int Age=sc.nextInt();
			System.out.println("\n Enter Birth of Date (yyyy-mm-dd) :");
			Date date=Date.valueOf(sc.next()); 
			pstmt.setInt(1,id);
			pstmt.setString(2, name);
			pstmt.setInt(3, Age);
			pstmt.setDate(4, date);
			pstmt.executeUpdate();
			System.out.println("Data insert Succesfully");
		  }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	 }
	 
	 
	 
	 public static void updateData()  {
		 try {
		   Connection con =Connection_JDBC.ConnectionJDBC();
		   String q="update students set sName=?,Age=?,BOD=? where Id=?";
		   PreparedStatement pstmt=con.prepareStatement(q);
		   System.out.print("Enter name : ");
		   String sName=sc.next();
		   System.out.print("\n Enter Age : ");
		   int Age=sc.nextInt();
		   System.out.print("Enter Birth of date (yyyy-mm-dd)");
		   Date date=Date.valueOf(sc.next());
		   System.out.println("Enter ID number ");
		   int Id=sc.nextInt();
		   
		   pstmt.setString(1, sName);
		   pstmt.setInt(2, Age);
		   pstmt.setDate(3, date);
		   pstmt.setInt(4, Id);
		   pstmt.executeUpdate();
		   System.out.println("Update data succefully");
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		 
	   }
	 public static void deleteData() {
		 try {
		   Connection con =Connection_JDBC.ConnectionJDBC();
		   String q="delete from students where Id=?";
		   PreparedStatement pstmt=con.prepareStatement(q);
		   System.out.println("Enter Id : ");
		   int Id=sc.nextInt();
		   pstmt.setInt(1, Id);
		   pstmt.executeUpdate();
		   System.out.println("Delate data succesfully :");
	   }
		 catch(Exception e) {
			 System.out.println(e);
		 }}
	 
		
	   public static void showData() {
		   try {
		   Connection con =Connection_JDBC.ConnectionJDBC();
		   String q="select * from students ";
		   PreparedStatement pstmt=con.prepareStatement(q);
		   ResultSet rset=pstmt.executeQuery();
		   while(rset.next()) {
		   int Id=rset.getInt(1);
		    String name=rset.getString(2);
	   		int age=rset.getInt(3);
	   		Date date=rset.getDate(4);
	   		System.out.println("Id "+Id+"         Name :"+name+"          Age:"+age+"             BOD:"+date);
	   	
		   }}
		   catch(Exception e) {
				 System.out.println(e);
			 }
	   }	
	}


