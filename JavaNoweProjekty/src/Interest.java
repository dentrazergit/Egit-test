
public class Interest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int amountInvested = 1000;
		double interestRate = 0.04;
		int years = 10;
		double amount;
		
		for(int j = 1; j<=6;j++){
			interestRate = interestRate +0.01;
		
		for(int i = 1; i<=10;i++){
			
			amount = amountInvested * Math.pow((1 + interestRate), i);
			
			System.out.println("Year : "+i +" Amount : "+amount+" $");
		}
		}
		
		
	}

}
