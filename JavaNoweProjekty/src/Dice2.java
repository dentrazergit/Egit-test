import java.util.Random;


public class Dice2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int rNum;
		int freq[] = new int[13];
		
		for(int row = 0;row<freq.length;row++){
			freq[row] = row;
		}
		
		
		for(int i = 0 ; i<100;i++){
			rNum = roll();
			++freq[rNum];
		}
		int s;
		for(int i = 0;i<freq.length;i++){
			
			s = i+2; 
			System.out.println(i + " "+freq[i]);
		}
	}

	private static int roll() {
		// TODO Auto-generated method stub
		Random randomNum = new Random();
		int s;
		int total = 0;
		for(int i = 0;i<2;i++){
			s = 1+ randomNum.nextInt(6);
			total = total + s;
		}
		return total;
	}
	
	

}
