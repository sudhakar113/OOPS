package oops.com;

class  Parent3
{
	void marry()
	{
		System.out.println("parent marry");
	}
}
class childd extends Parent3
{
	void marry()
	{
		System.out.println("I will marry Shradha kapoor");
	}
}
class childd2 extends Parent3
{
	void marry()
	{
		System.out.println("i will marry ashika rangantha ");
	}
}


public class Methodoverriding {
	public static void main(String[] args) {
	childd2	c2=new childd2();
	c2.marry();
	}

}
