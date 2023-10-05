package oops.com;

class Heart
{
	private int heartBeat;
	private String dieases;
	
	public Heart(int heartBeat, String dieases) {
		this.heartBeat = heartBeat;
		this.dieases = dieases;	
		
	}
	public int getHeartBeat() {
		return heartBeat;
	}
	public String getDieases() {
		return dieases;
	}
	
}
class Brain
{
	private float IQ;
	private String color;
	public Brain(float IQ, String color) {
		this.IQ = IQ;
		this.color = color;
		
	}
	public float getIQ() {
		return IQ;
	}
	public String getColor() {
		return color;
	}
	
	
}
class Bike
{
	private String name;
	private int mileage;
	public Bike(String name, int mileage) {
		this.name = name;
		this.mileage = mileage;
		
	}
	public String getName() {
		return name;
	}
	public int getMileage() {
		return mileage;
	}
	
	
}
class Books
{
	private String bookName;
	private String authorName;
	public Books(String bookName, String authorName) {
		this.bookName = bookName;
		this.authorName = authorName;
	
	}
	public String getBookName() {
		return bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	
	
}


class Student
{
	Heart h=new Heart(72,"cardologist");
	Brain b=new Brain(9.0f,"brown" );
	
	void hasA(Bike b)
	{
		System.out.println(b.getMileage());
		System.out.println(b.getName());
	}
	void has(Books b1)
	{
		System.out.println(b1.getBookName());
		System.out.println(b1.getAuthorName());
	}
	
}

public class Aggregation {
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.h.getHeartBeat());
		System.out.println(s.h.getDieases());
		System.out.println(s.b.getIQ());
		System.out.println(s.b.getColor());
		Bike b=new Bike("Avenger", 30);
		Books b1=new Books("JAVA", "James Gosaling");
		s.hasA(b);
		s.has(b1);
	}

}







