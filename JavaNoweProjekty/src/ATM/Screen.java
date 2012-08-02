package ATM;

public class Screen {

	public void displayMessage(String msg)
	{
		System.out.print(msg);
	}
	
	public void displayMessageLine(String msg)
	{
		System.out.println(msg);
	}
	
	public void displayDolarAmount(double amount)
	{
		System.out.printf("$%,.2f",amount);
	}
	
}
