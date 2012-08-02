import java.util.Random;


public class Craps {

	private static final Random randomNumbers = new Random();
	
	private enum Status {Continue, Lost, Won}; 
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myPoint = 0;
		int sumOfDice = rollDice();
		
		Status gameStatus;
		
		switch(sumOfDice){

		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.Won;
			break;
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.Lost;
			break;
		default:
			myPoint = sumOfDice;
			gameStatus = Status.Continue;
			System.out.println("Points : "+myPoint);
			break;
		}
		while(gameStatus ==Status.Continue){
			sumOfDice = rollDice();
			if(sumOfDice == myPoint){
				gameStatus = Status.Won;
			}else if(sumOfDice == SEVEN){
				gameStatus = Status.Lost;
			}
		}
		if(gameStatus==Status.Won){
			System.out.println("You won!");
		}else{
			System.out.println("You LOST");
		}
	}



	private static int rollDice() {
		// TODO Auto-generated method stub
		int roll1 = 1 + randomNumbers.nextInt(6);
		int roll2 = 1 + randomNumbers.nextInt(6);
		int sum = roll1 +roll2;
		System.out.println("You rolled "+roll1+" + "+roll2+" = "+sum);
		
		return sum;
	}

}
