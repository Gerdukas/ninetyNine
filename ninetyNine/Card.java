
// an implementation of a card type
public class Card  {

	// one of the four valid suits for this card
	private Suit mySuit;
	//the number of this card, where ace: 1, jack-king: 11-13
	private int myNumber;
	
	// card constructor
	public Card(Suit aSuit, int aNumber) {
		
		//the suit of the card
		this.mySuit = aSuit;
		
		if (aNumber >=1 && aNumber <=13){
			this.myNumber = aNumber;
		} else {
			System.err.println(aNumber + " is not a valid Card number");
			System.exit(1);
		}
		
		//the number of the card
		this.myNumber  = aNumber;
	}
	
	// return the number of the card
	public int getNumber() {
            int ruleNumber=0;
            switch(this.myNumber){
                case 2:
			ruleNumber= 2;
			break;
		case 3: 
			ruleNumber= 3;
			break;
		case 4:
			ruleNumber= 0;
			break;
		case 5: 
			ruleNumber= 5;
			break;
		case 6:
			ruleNumber= 6;
			break;
		case 7: 
			ruleNumber= 7;
			break;
		case 8:
			ruleNumber= 8;
			break;
		case 9: 
			ruleNumber= 99;
			break;
		case 10:
			ruleNumber=10;
			break;
		case 11: 
			ruleNumber= 10;	
			break;
		case 12:
			ruleNumber= 10;
			break;
		case 13: 
			ruleNumber= 0;
			break;
		case 1:
			ruleNumber= 11;
                        break;
            }
            
		return ruleNumber;
	}
	
	public String toString() {
		
		String numStr = "Error";
		
		switch(this.myNumber){
		
		case 2:
			numStr = "2";
			break;
			
		case 3: 
			numStr = "3";
			break;
			
		case 4:
			numStr = "4";
			break;
			
		case 5: 
			numStr = "5";
			break;
			
		case 6:
			numStr = "6";
			break;
			
		case 7: 
			numStr = "7";
			break;
			
		case 8:
			numStr = "8";
			break;
			
		case 9: 
			numStr = "9";
			break;
			
		case 10:
			numStr = "Ten";
			break;
			
		case 11: 
			numStr = "Jack";
			break;	
			
		case 12:
			numStr = "Queen";
			break;
			
		case 13: 
			numStr = "King";
			break;
			
		case 1:
			numStr = "Ace";
			break;

		
		}
		
		return numStr + " of " + mySuit.toString();
		
	}
	
}
