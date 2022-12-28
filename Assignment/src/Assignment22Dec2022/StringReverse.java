package Assignment22Dec2022;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		String a=sc.next();
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		System.out.println("Reverse String in UpperCase : "+rev.toUpperCase());
	}

}
