package oops.com;

/*interface Calci
{
	void add();
	void sub();
}
class Mycalcalci implements Calci
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
	public void mul()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
		
	}
}
*/
interface Cal
{
	public void add();
	public void sub();
}
abstract class Mycal implements Cal
{
	public void add()
	{
		int a=20;
		int b=30;
		System.out.println(a+b);
	}
}

public class Rulesofinterface {
public static void main(String[] args) {
	//Mycalcalci m=new Mycalcalci();
	 //Calci ref;
	 //ref=m;
	 //ref.add();
	 //ref.sub();
	 //downcasting
	 //((Mycalcalci)(ref)).mul();
}
}
