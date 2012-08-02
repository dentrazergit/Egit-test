package ATM;

public class BalanceInquiry extends Transaction{

	public BalanceInquiry(int accNum, Screen scr, BankDatabase bdat) {
		super(accNum, scr, bdat);
		
	}

	@Override
	public void execute() {
		
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();
		
		double availableBalance = bankDatabase.getAvalibleBalance(getAccountNumber());
		double totalBalance = bankDatabase.getTotalBalance(getAccountNumber());
		
		screen.displayMessageLine("--Balance Information--");
		screen.displayMessage("\n - Available balance : ");
		screen.displayDolarAmount(availableBalance);
		screen.displayMessage("\n - Total balance : ");
		screen.displayDolarAmount(totalBalance);
		screen.displayMessageLine("");
	}

	
	
}
