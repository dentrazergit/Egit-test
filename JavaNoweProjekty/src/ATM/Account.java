package ATM;

public class Account {
	
	private int accountNumber;
	private int pin;
	private double availableBalance;
	private double totalBalance;
	
	public Account(int accNum, int pin, double avalBalance, double totBalance)
	{
		accountNumber = accNum;
		this.pin = pin;
		availableBalance = avalBalance;
		totalBalance = totBalance;
	}
	
	public boolean validatePin(int userPin)
	{
		if(userPin==pin)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public double getAvalibleBalance()
	{
		return availableBalance;
	}
	
	public double getTotalBalance()
	{
		return totalBalance;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public void credit(double amount)
	{
		totalBalance = totalBalance + amount;
	}
	
	public void debit(double amount)
	{
		availableBalance = availableBalance - amount;
		totalBalance = totalBalance - amount;
	}
	
}
