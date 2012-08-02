import java.util.Random;


public class Guess {

	/**
	 * @param args
	 */
	final int ARRAY_LENGHT = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res[] = {1,2,4,1,5,1,3,1,4,5,5,5,1,1,2,3,3,3,4,3,5,2,2,2,2,8,15,0,6,0};
		int c[] = new int[6];
		
		System.out.println("Rating \tFreq");
		
		Random randomNum = new Random();
		
		for(int i = 0;i<res.length;i++){			
		
		try{
			++c[res[i]];
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("Wrong answer at :["+i+"] = "+res[i]);
		
		}
		
	}
		for(int i = 1;i<c.length;i++){
			System.out.println(i+"\t"+c[i]);
		}
		
		}

}
