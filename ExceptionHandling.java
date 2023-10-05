package oops.com;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		try
		{
			System.out.println("connection established");
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the first number");
			int a=scan.nextInt();
			System.out.println("enter the second number");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Entre the non-zero denominator");
		}
		System.out.println("connection terminated");
	}

}
