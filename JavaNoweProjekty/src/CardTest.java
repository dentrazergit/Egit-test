
public class CardTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeckOfCard myDeckOfCard = new DeckOfCard();
		myDeckOfCard.shuffle();
		
		for(int i = 1;i<=52;i++){
			System.out.print(myDeckOfCard.dealCard()+"\t    ");
			if(i%4==0){
				System.out.println();
			}
		}
	}

}
