package Assignment22Dec2022;

import java.util.Scanner;

public class StringExist {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a,b;
		System.out.println("Enter two String");
		a=sc.nextLine();
		b=sc.next();
		if(a.contains(b)) {
			System.out.println("yes, first string exist in another");
		}
		else {
			System.out.println("no, first string Not exist in another");
		}
	}
}
