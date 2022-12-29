/*
 * Create a thread to find if the number is odd or even
 */
package Assignment29Dec2022;

import java.util.Scanner;

public class MyThread {

	public static void main(String[] args) {
		MyThread1 s=new MyThread1();
		s.run();
	}

}
//Thread is created
class MyThread1 extends Thread{
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
		sc.close();
	}
}