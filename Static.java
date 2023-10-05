package oops.com;

class Test
{
	//Static variable
	static int a;
	static int b;
	
	static 
	{
		a=10;
		b=20;
		System.out.println("inside static block");
	}
	static void Fun1()
	{
		System.out.println("Inside static method");
	}
	int x;
	int y;
	
	{
		System.out.println("Inside instance block");
	}
	void fun()
	{
		System.out.println("Inside instance methods");
	}
	Test()
	{
		x=30;
		y=40;
		System.out.println("Inside constructor" );
	}
}

public class Static {

	public static void main(String[] args) 
	{
		Test.Fun1();
		Test t=new Test();
		t.fun();
	}

}
