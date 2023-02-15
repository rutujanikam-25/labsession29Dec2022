package com.LibraryManagementJDBC.LibraryManagement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class App 
{
	
	static Scanner sc=new Scanner(System.in);
	
	public static void insert(){
		try {
		Connection con=ConnectionJDBC.CreateCon();
		String q="insert into LStudent(Sid,Sname,Book_id,Book_name) values (?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(q);
		System.out.println("Enter Student id number :");
		int Sid=sc.nextInt();
		System.out.println("Enter Student Name :");
		String Sname=sc.next();
		System.out.println("Enter issue book id");
		int Book_id=sc.nextInt();
		System.out.println("Enter issue Book Name");
		String Book_name=sc.next();
		
		pstmt.setInt(1,Sid);
		pstmt.setString(2, Sname);
		pstmt.setInt(3, Book_id);
		pstmt.setString(4, Book_name);
		
		 pstmt.executeUpdate();
		System.out.println("Add student successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
		
	
	
	
		public static void Update() {
			try {
			   Connection con =ConnectionJDBC.CreateCon();
			   String q="update LStudent set Sname=? where Sid=?";
			   PreparedStatement pstmt=con.prepareStatement(q);
			   
				System.out.println("Enter Book");
				String Sname=sc.next();
				pstmt.setString(1, Sname);
				System.out.println("Enter Id");
				String sname=sc.next();
				pstmt.setString(2, sname);	
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
		   		
		   		System.out.println("Id "+Sid+"         Name :"+Sname+"         Book id :"+Book_id+"     Book Name :"+Book_name);
		   				
		   	
			   }}
			   catch(Exception e) {
					 System.out.println(e);
				 }
		   }
		   
		   
		
    public static void main( String[] args )
     { 
    	do {
    	
         System.out.println("\n 1. insert      2. Update   3. Delete          4. Show Data");
         System.out.print("\nChoose no. ");
         int choose=sc.nextInt();

    	
    	
    	switch(choose) {
    	      	      
    	       
    	                       case 1: insert();
    	                       			break;
    	                       case 2:Update();
    	                       			break;
    	                       case 3:delete();
    	                       			break;
    	                       case 4:showData();
    	                       			break;
    	                       default:
    	                    	   	System.out.println("Something wrong");
    	
    	
    	       					}
    	                     }while(true);
    	 
    	
    }
    
    
    
    
}
