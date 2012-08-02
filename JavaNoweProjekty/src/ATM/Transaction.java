package ATM;

public abstract class Transaction {
	
	private int accountNumber;
	private BankDatabase bankDatabase;
	private Screen screen;

	public Transaction(int accNum, Screen scr, BankDatabase bdat)
	{
		accountNumber = accNum;
		screen = scr;
		bankDatabase = bdat;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public Screen getScreen()
	{
		return screen;
	}
	public BankDatabase getBankDatabase()
	{
		return bankDatabase;
	}
	
	public abstract void execute();
	
}
