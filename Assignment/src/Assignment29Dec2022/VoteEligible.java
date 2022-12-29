/*
 * Write a program take the input of age from the user if the age is above 18 print 'You are eligible to Vote' else
 * 'throw an exception that 'age is not correct'.
 */
package Assignment29Dec2022;


import java.util.Scanner;

public class VoteEligible {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age=sc.nextInt();
		if(age<18) {
			//throw exception
			throw new ArithmeticException("Age is not correct");
		}
		else {
			System.out.println("You are eligible to vote");
		}
      sc.close();
	}

}
