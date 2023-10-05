package oops.com;

class Father
{
	void eat()
	{
		System.out.println("eat vegetables");
	}
}
class child2 extends Father
{
	void eat()
	{
		System.out.println("child1 eating pizza");
	}
}
class child3 extends Father
{
	void eat()
	{
		System.out.println("child2 eating chicken");
	}
}

class Family
{
	void food(Father ref)
	{
		ref.eat();
		
	}
}





public class Codeflxibility1 {
	public static void main(String[] args) {
		child2 c1=new child2();
		child3 c2=new child3();
		
		Family f1=new Family();
		f1.food(c1);
		f1.food(c2);
		
	}

}
