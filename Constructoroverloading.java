package oops.com;
class Bank2
{
	private int accountNumber;
	private int Password;
	
	Bank2(int accountNumber,int Password)
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

public class Constructoroverloading {
	Bank2 b2=new Bank2(10,20);
	
	
}
}

	
	


