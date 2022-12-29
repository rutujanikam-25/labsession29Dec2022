/*
 * Write down a program where you take input of 2 number(i,j) from the user and divide the first number with second include exception
 * handing mechanism
 */
package Assignment29Dec2022;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Number : ");
		int i=sc.nextInt();
		int j=sc.nextInt();
		//Exception handling mechanism
		try {
			int c=i/j;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println("Exception is throw : "+e);
		}
         sc.close();
	}

}
