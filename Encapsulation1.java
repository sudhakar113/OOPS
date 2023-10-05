package oops.com;


class Demo
{
	private int heart;
	private float brain;
	
	public void setheart(int x,float y)
	{
		heart=x;
		brain=y;
	}
	public int getheart()
	{
		return heart;
	}
	public float getbrain()
	{
		return brain;
	}
}

public class Encapsulation1 {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.setheart(72, 0.07f);
		System.out.println(d.getheart());
		System.out.println(d.getbrain());
	}

}
