package Assignment22Dec2022;

import java.util.Scanner;

public class StringEqual {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a,b;
		System.out.println("Enter two String :");
		a=sc.next();
		b=sc.next();
		if(a.equals(b)) {
			System.out.println("String are equals");
		}
		else {
			System.out.println("String are not equals");
		}
	}
}
