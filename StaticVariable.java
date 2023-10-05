package oops.com;

import java.util.Scanner;

class Farmer
{
	float SI;
	float p;
	float t;
static	float r=4.0f;
	
	void acceptInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the prinicipal amount");
		p=scan.nextFloat();
		System.out.println("Enetr the time");
		t=scan.nextFloat();
		
	}
	
	void calculate()
	{
		SI=p*t*r/100;
	}
	
	void display()
	{
		System.out.println("the Simple interest is " + SI);
	}

}

public class StaticVariable {
	
public static void main(String[] args) {
	
	Farmer f1=new Farmer();
	Farmer f2=new Farmer();
	Farmer f3=new Farmer();
	f1.acceptInput();
	f1.calculate();
	f1.display();
	f2.acceptInput();
	f2.calculate();
	f2.display();
	f3.acceptInput();
	f3.calculate();
	f3.display();
	
	
}
}
