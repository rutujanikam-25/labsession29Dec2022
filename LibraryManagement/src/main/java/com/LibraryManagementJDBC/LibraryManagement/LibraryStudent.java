package com.LibraryManagementJDBC.LibraryManagement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class LibraryStudent {
	 static Scanner sc=new Scanner(System.in);
	public static void addStudent(){
		try {
		Connection con=ConnectionJDBC.CreateCon();
		String q="insert into LStudent(Sid,Sname,Book_id,Book_name,issue_date) values (?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(q);
		System.out.println("Enter Student id number :");
		int Sid=sc.nextInt();
		System.out.println("Enter Student Name :");
		String Sname=sc.next();
		System.out.println("Enter issue book id");
		int Book_id=sc.nextInt();
		System.out.println("Enter issue Book Name");
		String Book_name=sc.next();
		System.out.println("Enter Issue Date (yyyy-mm-dd)");
		Date issue_date=Date.valueOf(sc.next());
		//System.out.println("Enter Issue Date (yyyy-mm-dd)");
		//Date Return_date=Date.valueOf(sc.next());
		
		pstmt.setInt(1,Sid);
		pstmt.setString(2, Sname);
		pstmt.setInt(3, Book_id);
		pstmt.setString(4, Book_name);
		pstmt.setDate(5, issue_date);
		//pstmt.setDate(6, Return_date);
		 pstmt.executeUpdate();
		System.out.println("Add student successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
		
		public static void UpdateStudent() {
			try {
			   Connection con =ConnectionJDBC.CreateCon();
			   String q="update LStudent set Return_date=? where Sid=?";
			   PreparedStatement pstmt=con.prepareStatement(q);
			   
				System.out.println("Enter Return Date (yyyy-mm-dd)");
				Date Return_date=Date.valueOf(sc.next());
				pstmt.setDate(1,Return_date);
				System.out.println("Enter update profile Student Id");
				int Sid=sc.nextInt();
				pstmt.setInt(2, Sid);	
				 pstmt.executeUpdate();
				System.out.println("Update profile");
		}catch(Exception e) {
			System.out.println(e);
		}
			
		}
		
		public static void delete() {
			try {
				Connection con=ConnectionJDBC.CreateCon();
				String q="delete from LStudent where Sid=?";
				PreparedStatement pstmt=con.prepareStatement(q);
				System.out.println("Enter Id : ");
				   int Sid=sc.nextInt();
				   pstmt.setInt(1, Sid);
				   pstmt.executeUpdate();
				   System.out.println("Delate data succesfully :");
				
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
		   public static void showData() {
			   try {
			   Connection con =ConnectionJDBC.CreateCon();
			   String q="select * from Lstudent ";
			   PreparedStatement pstmt=con.prepareStatement(q);
			   ResultSet rset=pstmt.executeQuery();
			   while(rset.next()) {
			   int Sid=rset.getInt(1);
			    String Sname=rset.getString(2);
		   		int Book_id=rset.getInt(3);
		   		String Book_name=rset.getString(4);
		   		Date issue_date=rset.getDate(5);
		   		Date Return_date=rset.getDate(6);
		   		System.out.println("Id "+Sid+"         Name :"+Sname+"         Book id :"+Book_id+"     Book Name :"+Book_name+"       issue_date :"+issue_date+"        Return Date :"+Return_date);
		   				
		   	
			   }}
			   catch(Exception e) {
					 System.out.println(e);
				 }
		   }	
		
		
		
	
	
	
}
