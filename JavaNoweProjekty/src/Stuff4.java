import java.util.Random;
import java.util.Scanner;


public class Stuff4 {

	/**
	 * @param args
	 */
	static enum Coin {HEADS, TAILS};
	static int valueOfHeads;
	static int valueOfTails;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Welcome to coin flipping prog ");
		int k = 0;
		Scanner in = new Scanner(System.in);
		while(k!=3){
		System.out.println("1 - to coin flip");
		System.out.println("2 - to display results");
		System.out.println("3 - exit");
		k = in.nextInt();
		switch(k){
		case 1:
		flipCoin();
		break;
		case 2:
			System.out.println("You flipped : ");
			System.out.println("HEADS: "+valueOfHeads);
			System.out.println("Tails: "+valueOfTails);
			break;
		case 3:
			break;
		default:
			break;
		}
		
			
		
		
	}}

	private static void flipCoin() {
		// TODO Auto-generated method stub
		int d;
		Random random = new Random();
		d = 1 + random.nextInt(2);
		if(d==1){
			System.out.println("You flipped Heads ");
			valueOfHeads +=1;
		}else{
			System.out.println("You flipped Tails ");
			valueOfTails +=1;
		}
	}

}
