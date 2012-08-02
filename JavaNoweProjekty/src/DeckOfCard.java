import java.util.Random;


public class DeckOfCard {

	private Card[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	
	private static final Random randomNumbers = new Random();
	
	public DeckOfCard(){
		String face[] = {"Ace","Deuce","Three","Four","Five","Six","Seven","Eight","Nine",
				"Ten","Jack","Queen","King"};
		String suit[] = {"Hearts","Diamond","Clubs","Spades"};
		
		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;
		
		for(int i = 0;i<deck.length;i++){
			deck[i] = new Card(face[i%13],suit[i/13]);
		}
	}
	public void shuffle(){
		currentCard = 0;
		
		for(int i = 0;i<deck.length;i++){
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			Card temp = deck[i];
			deck[i] = deck[second];
			deck[second] = temp;
		}
	}
	public Card dealCard(){
		if(currentCard<deck.length){
			return deck[currentCard++];
		}else{
			return null;
		}
		
	}
	
}
