package oops.com;

class Bank1
{
	private int accountNumber;
	private int Password;
	
	Bank1(int accountNumber,int Password)
	{
		this.accountNumber=accountNumber;
		this.Password=Password;
	}
	public int getaccountNumber()
	{
		return accountNumber;
	}
	public int getPassword()
	{
		return Password;
	}
}

public class Constructor 
{
	public static void main(String[] args) 
	{
		Bank1 b=new Bank1(10,20);
		System.out.println(b.getaccountNumber());
		System.out.println(b.getPassword());
		
		
	}

}
