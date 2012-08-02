package ATM;

public class Withdrawal extends Transaction{

	private int amount;
	private CashDispenser cashDispenser;
	private Keypad keypad;
	
	private final static int CANCELED = 6;
	public Withdrawal(int accNum, Screen scr, BankDatabase bdat, Keypad key, CashDispenser cash) {
		super(accNum, scr, bdat);
		keypad = key;
		cashDispenser = cash;
	}
	
	@Override
	public void execute()
	{
		double availableBalnace;
		boolean cashDispensed = false;
		
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();
		
		do
		{
		amount = displayMenuOfAmounts();
		
			if(amount!=CANCELED)
			{
				availableBalnace = bankDatabase.getAvalibleBalance(getAccountNumber());
				if(amount<=availableBalnace)
				{
					if(cashDispenser.isSufficientCashAvalible(amount))
					{
						bankDatabase.debit(getAccountNumber(), availableBalnace);
						cashDispenser.dispenseCash(amount);
						cashDispensed = true;
						screen.displayMessageLine("Your cash has been dispensed");
					}else
					{
						screen.displayMessageLine("Insufficent cash available in ATM, choose smaller amount");
					}
				}else
				{
					screen.displayMessageLine("Insufficent funds in your Account, choose smaller amount");
				}
			}else
			{
				screen.displayMessageLine("Canceling operation");
				return;
			}
			
		}while(!cashDispensed);
	}

	private int displayMenuOfAmounts() {
		
		int userChoice = 0;
		
		Screen screen = getScreen();
		
		int amounts[] = {0,20,40,60,100,200};
		
		while(userChoice==0)
		{
			screen.displayMessageLine("Withdrawal Menu: ");
			screen.displayMessageLine("1 - 20$ ");
			screen.displayMessageLine("2 - 40$ ");
			screen.displayMessageLine("3 - 60$ ");
			screen.displayMessageLine("4 - 100$ ");
			screen.displayMessageLine("5 - 200$ ");
			screen.displayMessageLine("6 - CANCEL ");
			screen.displayMessage("\n Choose withdrawal options");
			
			int input = keypad.getInput();
			
			switch(input)
			{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				userChoice = amounts[input];
				break;
			case 0: 
				userChoice = CANCELED;
				break;
			default:
				screen.displayMessageLine("Invalid selection, please try again");
				
			}
		}
		return userChoice;
	}
	
}
