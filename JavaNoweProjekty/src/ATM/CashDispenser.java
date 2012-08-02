package ATM;

public class CashDispenser {

	private static final int INITIAL_COUNT = 500;
	private int count;
	
	public CashDispenser()
	{
		count = INITIAL_COUNT;
	}
	
	public void dispenseCash(int amount)
	{
		int billsRequired = amount / 20;
		count = count - billsRequired;
	}
	public boolean isSufficientCashAvalible(int amount)
	{
		int billsRequired = amount / 20;
		if(count>=billsRequired)
		{
			return true;
		}else
		{
			return false;
		}
	}
}
