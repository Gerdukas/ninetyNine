
public class Player extends NinetyNine {
	public boolean aceLow= true;
	public boolean tenLow=true;
	private String name;
	private int numTokens;

	// the cards in the player's current hand (limit 3)
	private Card[] hand = new Card[2];

	// the number of cards in the player's hands
	private int numCards;

	// player constructor
	public Player(String aName) {

		this.name = aName;

		// set a player's hand to empty
		this.emptyHand();
	}

	// reset the player's hand to have no cards in case of new game
	public void emptyHand() {

		for (int c = 0; c < 10; c++) {
			this.hand[c] = null;
		}

		this.numCards = 0;
	}

	// add a card to the player's hand
	public void addCard() {

		// print error if we already have the max number of cards

		if (this.numCards == 3) {
			System.err.printf("%s's hand already has 3 cards; " + "cannot add another\n", this.name);

			System.exit(1);
		}

		// add new card in next slot and increment number of cards counter
		this.hand[this.numCards] = myDeck.dealNextCard();
		this.numCards++;


	}
	public int getTokens(){
		return numTokens;
	}
	public void minusToken(){
		numTokens--;
	}
	public void discard(int i, Card[] hand){
		int number= hand[i].getNumber();
		switch (number){
		//EDIT
		//change when we have GUI
		//ask user which value to add
		case 1:
			if(aceLow==true)
				canvas.addTotal(1);
			else
				canvas.addTotal(11);
			break;
		case 2: canvas.addTotal(2);
			break;
		case 3: canvas.addTotal(3);
			//add skip player
			break;
		case 4: clockwise= false;
			break;
		case 5: canvas.addTotal(5);
			break;
		case 6: canvas.addTotal(6);
			break;
		case 7: canvas.addTotal(7);
			break;
		case 8: canvas.addTotal(8);
			break;
		case 9: canvas.addTotal(99);
			break;
		case 10: 
			if (tenLow=true)
				canvas.addTotal(-10);
			else
				canvas.addTotal(10);
			break;
		case 11: canvas.addTotal(10);
			break;
		case 12: canvas.addTotal(10);
			break;
		case 13: canvas.addTotal(0);
			break;
		}
	}
	
}
