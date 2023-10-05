package oops.com;   

import java.util.Scanner;

class Square
{
	float side;
	float area;
	
	void acceptInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the side length");
		side=scan.nextFloat();
	}
	void calcArea()
	{
		area=side*side;
	}
	void dispArea()
	{
		System.out.println("the area is"+area);
	}
}
class Rectangle
{
	float length;
	float breadth;
	float area;
	
	void acceptInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");
		length=scan.nextFloat();
		System.out.println("Enter the breadth");
		breadth=scan.nextFloat();
	}
	void calcArea()
	{
		area=length*breadth;
	}
	void dispArea()
	{
		System.out.println("the area is"+area);
	}
}
class Circle
{
	float radius;
	float area;

void acceptInput()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the radius");
	radius=scan.nextFloat();

}
void calcArea()
{
	area=3.142f*(radius*radius);
}
void dispArea()
{
	System.out.println("the area is" + area);
}
}

public class Example2 {
	public static void main(String[] args) {
		Square s=new Square();
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		s.acceptInput();
		s.calcArea();
		s.dispArea();
		
		r.acceptInput();
		r.calcArea();
		r.dispArea();
		
		c.acceptInput();
		c.calcArea();
		c.dispArea();
		
	}

}



