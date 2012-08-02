package ATM;

public class BankDatabase {

	private  Account accounts[];
	
	
	public BankDatabase()
	{
		accounts = new Account[2];
		accounts[0] = new Account(12345, 56789, 1000.0, 1200.0);
		accounts[1] = new Account(98765, 54321, 1200.0, 1400.0);
	}
	
	public Account getAccount(int number)
	{
		for(Account currentNumber : accounts)
		{
			if(currentNumber.getAccountNumber() == number)
			{
				return currentNumber;
			}
		}
		return null;
	}
	public boolean autenticateUser(int autenticateNumber, int autenticatePin)
	{
		Account userAccount = getAccount(autenticateNumber);
		
		if(userAccount!=null)
		{
			return userAccount.validatePin(autenticatePin);
		}else
		{
			return false;
		}
	}
	public double getAvalibleBalance(int userAccNumber)
	{
		return getAccount(userAccNumber).getAvalibleBalance();
	}
	
	public double getTotalBalance(int userAccNumber)
	{
		return getAccount(userAccNumber).getTotalBalance();
	}
	
	public void credit(int userAccNumber, double amount)
	{
		getAccount(userAccNumber).credit(amount);
	}
	
	public void debit(int userAccNumber, double amount)
	{
		getAccount(userAccNumber).debit(amount);
	}
	
}
