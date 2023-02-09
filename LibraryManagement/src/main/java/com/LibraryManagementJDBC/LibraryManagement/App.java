package com.LibraryManagementJDBC.LibraryManagement;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	LibraryStudent l=new LibraryStudent();
    	System.out.println("1. purchase book   \n 2. Return book  \n 3. Delete profile \n 4. Show all Student Library Data");
    	Scanner sc=new Scanner(System.in);
    	System.out.println("\n \n Choose no. ");
    	int choose=sc.nextInt();
    	switch(choose) {
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
    }
}
