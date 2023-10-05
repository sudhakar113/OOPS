package oops.com;

class Launch
{
	private int AccountNumber;
	private int password;
	
	public void setAccountNumber(int AccountNumber)
	{
		this.AccountNumber=AccountNumber;
	}
	public void setpaswword(int password)
	{
		this.password=password;
	}
	public int getAccountNumber()
	{
		return AccountNumber;
	}
	public int getpassword()
	{
		return password;
	}
}

public class Thiskeyword {
	public static void main(String[] args) {
		Launch l=new Launch();
		l.setAccountNumber(111);
		l.setpaswword(112);
		System.out.println(l.getAccountNumber());
		System.out.println(l.getpassword());
	}

}
