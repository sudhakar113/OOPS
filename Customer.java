package oops.com;

class Customer
{
	private int cID;
	private String cName;
	private int cNum;
	
public void setcID(int cID) {
		this.cID = cID;
	}

public void setcName(String cName) {
		this.cName = cName;
	}

public void setcNum(int cNum) {
		this.cNum = cNum;

}
public int getcID() {
	return cID;
}

public String getcName() {
	return cName;
}

public int getcNum() {
	return cNum;
}



public class Demo {
	public static void main(String[] args) 
	{
	Customer c1=new Customer();
	c1.setcID(10);
	c1.setcName("sudhakar");
	c1.setcNum(725964510);
	System.out.println(c1.getcID());
	System.out.println(c1.getcName());
	System.out.println(c1.getcNum());
		
		
	}

	
}
}


