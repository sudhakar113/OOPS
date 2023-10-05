package oops.com;

import java.util.Scanner;

public class ArrayException {

public static void main(String[] args) {
		
		try
		{
			System.out.println("connection established");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the arraysize");
			int size=sc.nextInt();
			int[]ar=new int[size];
			System.out.println("array created sucessfully");
		}
		catch(Exception e)
		{
			System.out.println("be positive");
		}
		System.out.println("connection terminated");
	}

}


