package oops.com;

abstract class Parent11
{
	abstract void eat();
}
class child11 extends Parent11 
{
	void eat()
	{
		System.out.println("I will eat pizza");
	}
}
class child22 extends Parent11
{
	void eat()
	{
		System.out.println("i will rotti");
	}
}
class child33 extends Parent11
{
	void eat()
	{
		System.out.println("i will eat muddi");
	}
}
class Family1
{
	void food(Parent11 ref)
	{
		ref.eat();
	}

}



public class Abstract {
	public static void main(String[] args) {
		child11 c1=new child11();
		child22 c2=new child22();
		child33 c3=new child33();
		
		Family1 f1=new Family1();
		f1.food(c1);
		f1.food(c2);
		f1.food(c3);
	}

}
