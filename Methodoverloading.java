package oops.com;

class Calculator
{
	void add(int a)
	{
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	void add(int a,float b)
	{
		float c=a+b;
		System.out.println(c);
	}
	void add(float a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	void add(int a,float b,double c)
	{
		double d=a+b+c;
		System.out.println(d);
	}
}



public class Methodoverloading {
	public static void main(String[] args) 
	{
		Calculator calc=new Calculator();
		calc.add(10);
		calc.add(10.0f, 1000);
		calc.add(10, 0.0f);
		calc.add(10, 10);
		calc.add(10, 20.0f, 2000);
		calc.add(10, 30, 40);
		
	}

}
