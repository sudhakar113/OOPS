package oops.com;

class Bank
{
	private int  accountNumber=111;
	private int password=222;
	
	public void setaccountNumber(int x,int y)
	{
		accountNumber=x;
		password=y;
		
	}
	public int getaccountNumber()
	{
		return accountNumber;
		
	}
	public int getpassword()
	{
		return password;
	}
}
public class Encapsulation 
{
	public static void main(String[] args) 
	{
		Bank b=new Bank();
		b.setaccountNumber(101, 202);
		System.out.println(b.getaccountNumber());
		System.out.println(b.getpassword());
		
		
	}

}
