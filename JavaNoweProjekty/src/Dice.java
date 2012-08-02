import java.util.Random;


public class Dice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random randomNumber = new Random();
		
		int face;
		int freq1 = 0;
		int freq2 = 0;
		int freq3 = 0;
		int freq4 = 0;
		int freq5 = 0;
		int freq6 = 0;
		
		
		
		for(int i = 1; i<=600000;i++){
			face = 1 + randomNumber.nextInt(6);
			
			switch(face){
			case 1:
			freq1++;
			break;
			case 2:
				freq2++;
				break;
			case 3:
				freq3++;
				break;
			case 4:
				freq4++;
				break;
			case 5:
				freq5++;
				break;
			case 6:
				freq6++;
				break;
			}
		}
		System.out.printf(" 1\t%d\n 2\t%d\n 3\t%d\n 4\t%d\n 5\t%d\n 6\t%d\n",freq1,freq2,freq3,freq4,freq5,freq6);
	}

}
