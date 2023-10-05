//Inheritance is a Process of one class acquiring the properties and behavior of the another class

//Simple inheritance Program

//Accquiring the properties
package oops.com;

/*class Parent
{
	String color="blue";
}
class child extends Parent
{
	
}


public class Inheritance {
 public static void main(String[] args) {
	child c=new child();
	System.out.println(c.color);
}
}*/


//Accquiring the behaviour

class Parent
{
	void nosmoke()
	{
		System.out.println("i will not smoke");
	}
}
class child extends Parent
{
	
	
}


public class Inheritance
{
 public static void main(String[] args)
 {
	 child c1=new child();
	 c1.nosmoke();
 }
}

