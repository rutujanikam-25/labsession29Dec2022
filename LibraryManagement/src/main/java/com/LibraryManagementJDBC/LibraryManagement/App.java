package com.LibraryManagementJDBC.LibraryManagement;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("1.Student Information  	  2: Book Information \n");
    	Scanner sc=new Scanner(System.in);
    	System.out.print("choose one number :");
    	int choose=sc.nextInt();
    	switch(choose) {
    	    case 1:LibraryStudent l=new LibraryStudent();
    	             System.out.println("\n 1. purchase book      2. Return book   3. Delete profile          4. Show all Student Library Data");
    	             System.out.print("\nChoose no. ");
    	             int choose1=sc.nextInt();
    	             switch(choose1) {
    	       
    	                       case 1: l.addStudent();
    	                       			break;
    	                       case 2:l.UpdateStudent();
    	                       			break;
    	                       case 3:l.delete();
    	                       			break;
    	                       case 4:l.showData();
    	                       			break;
    	                       default:
    	                    	   	System.out.println("Something wrong");
    	
    	
    	       					}
    	                      break;
    	       
    	    case 2:LibraryBook s=new LibraryBook();
    	       System.out.println("1. Add new Book \n 2. Upadate Book Information  \n 3. All Book Information \n 4.Delete Book");
               System.out.println("choose any number :");
    	       int choose2=sc.nextInt();
    	       switch(choose2) {
    	       			case 1:s.addNewBook();
    	       			 		break;
    	       			case 2:s.UpdateBookInfo();
    	       					break;
    	       			case 3:s.showBookData();
    	       			       break;
    	       			case 4:s.deleteBook();
    	       			       break;
    	       			 default:
    	       				 System.out.println("Something went wrong");
    	       			
    	       }
    	       
    	}   
    	 
    	
    }
    
    
    
}
