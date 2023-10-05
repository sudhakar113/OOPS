package oops.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		System.out.println("coonection established");
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Eneter the numerator");
			int a=scan.nextInt();
			System.out.println("Enter the denominator");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
			
		//-----------------------------------------------------
			System.out.println("Eneter the size of an array");
			int n=scan.nextInt();
			int []arr=new int[n];
			System.out.println("Enetr the element to be inserted");
			int ele=scan.nextInt();
			System.out.println("Eneter the index where data to be inserted");
			int index=scan.nextInt();
			arr=null;
			arr[index]=ele;
			System.out.println(arr[index]);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Enter non-zero denominator ");
		}
		catch(NegativeArraySizeException b)
		{
			System.out.println("privide postive array size");
		}
		catch(InputMismatchException c)
		{
			System.out.println("provide integer data");
		}
		catch(ArrayIndexOutOfBoundsException d)
		{
			System.out.println("be in your limits");
		}
		catch(Exception e)
		{
			System.out.println("Invalid input try again");
		}
		System.out.println("connectoin terminated");
		
		
		
	}
}
