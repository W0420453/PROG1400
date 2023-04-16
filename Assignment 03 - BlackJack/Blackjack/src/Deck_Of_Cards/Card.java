package Deck_Of_Cards;

/**
 * The card class contains the suit and rank as variables, it does not contain the name of the card as a variable
 * However the method toString returns a string variable which is made up of the suit and rank of the card.
 */
public class Card {
    //vars
    private Suit suit;
    private Rank rank;

    /**
     * Constructor for the card class when given the suit and rank for each card
     */
    //Creating a Card object when given a suit and rank.
    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Constructor for the card class when given an card object as a paramenter.
     * Copies the given cards attributes to the new card to be created.
     * @param card
     */
    public Card(Card card) {
        this.suit = card.getSuit();
        this.rank = card.getRank();
    }

    /**
     * Getter for the card value for the class, obtained by calling the rankValue method of the rank enum.
     */
    public int getValue(){
        return rank.rankValue;
    }

    /**
     * Getter for suit of the card
     */
    public Suit getSuit(){
        return suit;
    }

    /**
     * Getter for the rank of the card
     */
    public Rank getRank(){
        return rank;
    }

    /**
     * Returns a string which contains the rank of the card and the suit of the card to make the name of the card
     * additionally, the cards value is attached to the end of the name.
     */
    public String toString(){
        return ("["+rank+" of "+ suit + "] ("+this.getValue()+")");
    }
}
