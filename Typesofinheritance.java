//Single level inheritance
package oops.com;
class Parent1
{
	void disp()
	{
		System.out.println("TAP");
	}
}
class baby extends Parent1
{
	
}

public class Typesofinheritance {
public static void main(String[] args) {	
baby b=new baby();
b.disp();
}
}