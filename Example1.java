package oops.com;

import java.util.Scanner;

abstract class Shape
{
	float area;
	abstract public void acceptInput();
	abstract public void calcArea();
	public void dispArea()
	{
		System.out.println("the are is "+ area);
	}
}


class Square1 extends Shape
{
	private float side;
	public void acceptInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the side length");
		side=scan.nextFloat();
	}
	public void calcArea()
	{
		area=side*side;
	}
}
class Rectangle1 extends Shape
{
	private float length;
	private float breadth;
	
	public void acceptInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");
		length=scan.nextFloat();
		System.out.println("Enter the breadth");
		breadth=scan.nextFloat();
	}
	public void calcArea()
	{
		area=length*breadth;
	}
	
}
class Circle1 extends Shape
{
	private float radius;

public void acceptInput()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the radius");
	radius=scan.nextFloat();

}
public void calcArea()
{
	area=3.142f*(radius*radius);
}
}

class Geometry
{
	void permit(Shape s)
	{
		s.acceptInput();
		s.calcArea();
		s.dispArea();
	}
}


public class Example1 {
	public static void main(String[] args) {
		Square1 s=new Square1();
		Rectangle1 r=new Rectangle1();
		Circle1 c=new Circle1();
		
		Geometry g=new Geometry();
		g.permit(s);
		g.permit(r);
		g.permit(c);
		
	}

}





