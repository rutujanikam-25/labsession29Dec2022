package com.LibraryManagementJDBC.LibraryManagement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


//Library book information
public class LibraryBook {
    
	static Scanner sc=new Scanner(System.in);
	public static void addNewBook(){         //add new book information
		try {
		Connection con=ConnectionJDBC.CreateCon();
		String q="insert into LBook(Book_id,Book_name,Author_name) values (?,?,?)";  //insertion query
		PreparedStatement pstmt=con.prepareStatement(q);         
		System.out.println("Enter Book id number :");
		int Book_id=sc.nextInt();
		
		System.out.println("Enter Book Name :");
		String Book_name=sc.next();
		
		System.out.println("Enter Author Name");
		String Author_name=sc.next();
		
		pstmt.setInt(1,Book_id);
		pstmt.setString(2, Book_name);
		pstmt.setString(3, Author_name);
		pstmt.executeUpdate();
		System.out.println("Add student successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void UpdateBookInfo() {
		try {
		   Connection con =ConnectionJDBC.CreateCon();
		   String q="update LBook set Book_name=?,Author_name=? where Book_id=?";
		   PreparedStatement pstmt=con.prepareStatement(q);
		   
			System.out.println("Enter new updated book name :");
			String Book_name=sc.next();
			pstmt.setString(1, Book_name);
			System.out.println("Enter Author name");
			String Author_name=sc.next();
			pstmt.setString(2,Author_name);
			System.out.println("Book id number change information");
			int Book_id=sc.nextInt();
			pstmt.setInt(3, Book_id);
			 pstmt.executeUpdate();
			System.out.println("Update profile");
	}catch(Exception e) {
		System.out.println(e);
	}
		
	}
	
	public static void deleteBook() {
		try {
			Connection con=ConnectionJDBC.CreateCon();
			String q="delete from LBook where Book_id=?";
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
	
	
	public static void showBookData() {
		   try {
		   Connection con =ConnectionJDBC.CreateCon();
		   String q="select * from LBook ";
		   PreparedStatement pstmt=con.prepareStatement(q);
		   ResultSet rset=pstmt.executeQuery();
		   while(rset.next()) {
		   int Book_id=rset.getInt(1);
		    String Book_name=rset.getString(2);
	   		String Author_name=rset.getString(3);
	   		
	   		System.out.println("Book Id "+Book_id+"      Book Name :"+Book_name+"            Author Name :"+Author_name);
	   				
	   	
		   }}
		   catch(Exception e) {
				 System.out.println(e);
			 }
	   }	
	
	
	
	
	
	
	
	
	
}
