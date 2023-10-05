package oops.com;

class Shivasharanappa
{
	void disp()
	{
		System.out.println("TAP");
	}
}
class sudhakar extends Shivasharanappa
{
	
}
class sanjeevakumar extends Shivasharanappa
{
	
}
class usharani extends Shivasharanappa
{
	
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		sudhakar s1=new sudhakar();
		sanjeevakumar s2=new sanjeevakumar();
		usharani u1=new usharani();
		s1.disp();
		s2.disp();
		u1.disp();
	}
}
