package ATM;

import java.util.Scanner;

public class Keypad {
	
	private Scanner in;
	
	public Keypad()
	{
		in = new Scanner(System.in);
	}
	
	public int getInput()
	{
		return in.nextInt();
	}

}
