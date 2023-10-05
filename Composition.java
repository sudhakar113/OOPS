package oops.com;

class Heart1
{
	private int heartBeat;
	private float size;
	public Heart1(int heartBeat, float size) {
		super();
		this.heartBeat = heartBeat;
		this.size = size;
	}
	public int getHeartBeat() {
		return heartBeat;
	}
	public float getSize() {
		return size;
	}
	
}
class Brain1
{
	private float IQ;
	private  String color;
	public Brain1(float iQ, String color) {
		super();
		IQ = iQ;
		this.color = color;
	}
	public float getIQ() {
		return IQ;
	}
	public String getColor() {
		return color;
	}
	
}

class Bike1
{
	private String bikename;
	private float mileage;
	public Bike1(String bikename, float mileage) {
		super();
		this.bikename = bikename;
		this.mileage = mileage;
	}
	public String getBikename() {
		return bikename;
	}
	public float getMileage() {
		return mileage;
	}
	public char[] getColor() {
		// TODO Auto-generated method stub
		return null;
	}
	public char[] getIQ() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class Book1
{
	private String authorName;
	private String bookname;
	public Book1(String authorName, String bookname) {
		super();
		this.authorName = authorName;
		this.bookname = bookname;
	}
	public String getAuthorName() {
		return authorName;
	}
	public String getBookname() {
		return bookname;
	}
	
}
class Human
{
	Heart1 h=new Heart1(72, 210);
	Brain1 b=new Brain1(7.0f, "grey");
	void HasA(Bike1 b)
	{
           System.out.println(b.getBikename());	
           System.out.println(b.getMileage());
	}
	void hasA(Book1 b1)
	{
		System.out.println(b1.getAuthorName());
		System.out.println(b1.getBookname());
	}
		}
	
class Student1 extends Human
{
   		
    
    
}

public class Composition {
	public static void main(String[] args) {
     Student1 s1=new Student1();
     System.out.println(s1.h.getHeartBeat());
     System.out.println(s1.h.getSize());
     System.out.println(s1.b.getColor());
     System.out.println(s1.b.getIQ());
     Bike1 b=new Bike1("avenger", 56);
	 Book1 b1=new Book1("james gosaling", "java");
	 s1.HasA(b);
	 s1.hasA(b1);			
	}

}
