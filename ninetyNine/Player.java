import java.util.ArrayList;

public class Player {
	//public boolean aceLow= true;
	//public boolean tenLow=true;
	private String name;
	private int numTokens;

	// the cards in the player's current hand (limit 3)
	public ArrayList<Card> hand = new ArrayList<Card>();

	// player constructor
	public Player(String aName) {

		this.name = aName;

		// set a player's hand to empty
		this.emptyHand();
	}

	// reset the player's hand to have no cards in case of new game
	public void emptyHand() {
            hand.clear();
	}

	// add a card to the player's hand
	public void addCard(Card card) {
            hand.add(card);
	}
        
	public int getTokens(){
            return numTokens;
	}
        
	public void minusToken(){
            numTokens--;
	}
        public String getName(){
           
            return name;
        }
        
	public void discardCard(Card oldCard, Card newCard){
            hand.set(hand.indexOf(oldCard), newCard);
        }
}
