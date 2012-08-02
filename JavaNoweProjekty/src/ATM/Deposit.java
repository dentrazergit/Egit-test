package ATM;

public class Deposit extends Transaction {

	private double amount;
	private Keypad keypad;
	private DepositSlot depositSlot;
	
	private final static int CANCELED = 0;
	public Deposit(int accNum, Screen scr, BankDatabase bdat, Keypad key, DepositSlot depSlot) {
		super(accNum, scr, bdat);
		keypad = key;
		depositSlot = depSlot;
	}

	@Override
	public void execute() {
	
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();
		
		amount = promptForDepositAmount();
		
		if(amount!=CANCELED)
		{
			screen.displayMessage("Please insert deposit");
			screen.displayDolarAmount(amount);
			boolean envelopeRecived = depositSlot.isEnvelopeRecived();
			if(envelopeRecived)
			{
				bankDatabase.credit(getAccountNumber(), amount);
			}else
			{
				screen.displayMessage("\nYou did not insert envelope. Canceling...");
			}
		}else
		{
			screen.displayMessage("Canceling");
			
		}
	}

	private double promptForDepositAmount() {
		
		Screen screen = getScreen();
		screen.displayMessage("Enter amount in Cents. 0 to cancel");
		int input = keypad.getInput();
		
		if(input==CANCELED)
		{
			return CANCELED;
		}
		else
		{
			return (double) input / 100;
		}
	}
	

}
