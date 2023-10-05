package oops.com;

import java.util.Scanner;

interface Calculator1
{
	void add();
	void sub();
}
class Mycalculator1 implements Calculator1
{
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
}
class Mycalculator2 implements Calculator1
{
 public void add()
	{
	Scanner sc=new Scanner(System.in);
    System.out.println("eneter the number1");
    int a=sc.nextInt();
    System.out.println("enter the number2");
    int b=sc.nextInt();
    int c=a+b;
    System.out.println(c);
}
	public void sub()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("eneter the number1");
	    int a=sc.nextInt();
	    System.out.println("enter the number2");
	    int b=sc.nextInt();
	    int c=a-b;
	    System.out.println(c);
	}
}
class Mycalculator3 implements Calculator1
{
	public void add()
	{
	Scanner sc=new Scanner(System.in);
    System.out.println("eneter the number1");
    int a=sc.nextInt();
    System.out.println("enter the number2");
    int b=sc.nextInt();
    if(a>b)
    {
    	int c=a+b;
    	System.out.println(c);
    }
    else
    {
    	System.out.println("invalid input");
    }
	}
    
    public void sub()
	{
	Scanner sc=new Scanner(System.in);
    System.out.println("eneter the number1");
    int a=sc.nextInt();
    System.out.println("enter the number2");
    int b=sc.nextInt();
    if(a>b)
    {
    	int c=a-b;
    	System.out.println(c);
    }
    else
    {
    	System.out.println("invalid input");
    }
}
}

//Interface achiecve with polymorphism

class Casio
{
	void permit(Calculator1 ref)
	{
		ref.add();
		ref.sub();
		
	}
}

public class Interface {
	public static void main(String[] args) {
		Mycalculator1 m1=new Mycalculator1();
		Mycalculator2 m2=new Mycalculator2();
		Mycalculator3 m3=new Mycalculator3();
		
		Casio c=new Casio();
		c.permit(m1);
		c.permit(m2);
		c.permit(m3);
		
		/*m1.add();
		m1.sub();
		System.out.println("---------------------------------");
		
		m2.add();
		m2.sub();
		System.out.println("---------------------------------");

		m3.add();
		m3.sub();*/
		
	}

}
