//mutilevel inheritance

package oops.com;

class grandParent
{
	void disp()
	{
		System.out.println("TAP");
	}
}
	class Parent2 extends grandParent
	{
		
	}
	class child1 extends Parent2
	{
		
	}

public class Multilevelinheritance {
public static void main(String[] args) {
	child1 c=new child1();
	c.disp();
	c.disp();
	c.disp();
}
}
