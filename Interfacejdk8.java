package oops.com;

interface SeaAnimals
{
	void swim();
	void eat();
	default void communicate()
	{
		System.out.println("Sea animals communicate");
	}
}
class Dolphin implements SeaAnimals
{
	public void swim()
	{
		System.out.println("the seaanimals swims");
	}
	public void eat()
	{
		System.out.println("the seanimals eat small fish");
	}
}
class Seal implements SeaAnimals
{
	public void swim()
	{
		System.out.println("the Seal swims");
	}
	public void eat()
	{
		System.out.println("the Seal eat medium size fish");
	}
	
}
class Shark implements SeaAnimals
{
	public void swim()
	{
		System.out.println("the Shark swims");
	}
	public void eat()
	{
		System.out.println("the Shark eat large size fish");
	}
	
}


public class Interfacejdk8 {
	public static void main(String[] args) {
		Dolphin d=new Dolphin();
		d.swim();
		d.eat();
		d.communicate();
		Seal s=new Seal();
		s.swim();
		s.eat();
		d.communicate();
		Shark sh=new Shark();
		sh.swim();
		sh.eat();
		d.communicate();
	}

}
