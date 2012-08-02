package JHTP9E;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroNoHandlingException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numerator;
		int denumerator;
		boolean continueLoop = true;
		
		do
		{
			try
			{
				System.out.print("Enter Integer numerator: ");
				numerator = in.nextInt();
				System.out.print("Enter Integer denumerator: ");
				denumerator = in.nextInt();
				System.out.println("Result: "+numerator+" / "+denumerator +" = "+quotient(numerator, denumerator));
				continueLoop = false;
			}catch(InputMismatchException inputMismatchException)
			{
				System.out.println("InputMismatchException: "+inputMismatchException);
				in.nextLine();
				System.out.println("You have to use only Integers ");
				continueLoop = true;
			}catch(ArithmeticException arithmeticException)
			{
				System.out.println("ArithmeticException: "+arithmeticException);
				in.nextLine();
				System.out.println("You cant divide by zero");
				continueLoop = true;
			}
			
		}while(continueLoop);
		
		
	}
	
	public static int quotient(int numerator, int denumerator)throws ArithmeticException{
		
		return numerator / denumerator;
	}

}
