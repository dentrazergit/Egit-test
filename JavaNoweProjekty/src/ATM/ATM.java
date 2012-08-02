package ATM;

public class ATM {
	
	private boolean userAutenticated;
	private Keypad keypad;
	private Screen screen;
	private BankDatabase bankDatabase;
	private CashDispenser cashDispenser;
	private DepositSlot depositSlot;
	private int currentAccountNumber;
	
	//Constants
	private static final int BALANCE_INQUIRY = 1;
	private static final int WITHDRAWAL = 2;
	private static final int DEPOSIT = 3;
	private static final int EXIT = 4;
	
	public ATM()
	{
		userAutenticated = false;
		currentAccountNumber = 0;
		screen = new Screen();
		bankDatabase = new BankDatabase();
		depositSlot = new DepositSlot();
		keypad = new Keypad();
		cashDispenser = new CashDispenser();	
	}
	
	public void run()
	{
		while(true)
		{
			while(!userAutenticated)
			{
				screen.displayMessageLine("Welcome");
				autenticateUser();
			}
			
			performTransactions();
			userAutenticated = false;
			currentAccountNumber = 0;
			screen.displayMessageLine("\nThank You! Goodbye");
		}
	}

	private void autenticateUser()
	{
		screen.displayMessageLine("\nEnter your account number : ");
		int accountNumber = keypad.getInput();
		screen.displayMessageLine("\nEnter your  PIN : ");
		int pin = keypad.getInput();
		
		userAutenticated = bankDatabase.autenticateUser(accountNumber, pin);
		if(userAutenticated)
		{
			currentAccountNumber = accountNumber;
		}else
		{
			screen.displayMessageLine("\nWrong account number or pin. Try again");
		}
	}
	private void performTransactions()
	{
		Transaction currentTransaction = null;
		boolean userExited = false;
		
		while(!userExited)
		{
			int mainMenuSelection = displayMenuSelection();
			
			switch(mainMenuSelection)
			{
				case BALANCE_INQUIRY:
				case WITHDRAWAL:
				case DEPOSIT:
					
					currentTransaction = createTransaction(mainMenuSelection);
					currentTransaction.execute();
					break;
				case EXIT:
					screen.displayMessageLine("\nExiting System");
					userExited = true;
					break;
				default:
					screen.displayMessageLine("\nWrong number. Try again");
			}	
		}
	}
	private int displayMenuSelection()
	{
		System.out.println("Main menu:");
		System.out.println("1 - View my balance");
		System.out.println("2 - Withdrawal cash");
		System.out.println("3 - Deposit funds");
		System.out.println("4 - Exit");
		return keypad.getInput();
	}
	private Transaction createTransaction(int type)
	{
		Transaction temp = null;
		
		switch(type)
		{
			case BALANCE_INQUIRY:
				temp = new BalanceInquiry(currentAccountNumber, screen, bankDatabase);
				break;
			case WITHDRAWAL:
				temp = new Withdrawal(currentAccountNumber, screen, bankDatabase, keypad, cashDispenser);
				break;
			case DEPOSIT:
				temp = new Deposit(currentAccountNumber, screen, bankDatabase, keypad, depositSlot);
				break;
		}
		return temp;
	}
}
