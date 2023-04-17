package Deck_Of_Cards;

/**
 * enum which contains the 4 suits in a typical set of playing cards
 */
public enum Suit {

    /**
     * Connects the CLUB Suit to the suitName "Clubs"
     */
    CLUB("Clubs"),

    /**
     * Connects the DIAMOND Suit to the suitName "Diamonds"
     */
    DIAMOND("Diamonds"),

    /**
     * Connects the HEART Suit to the suitName "Hearts"
     */
    HEART("Hearts"),

    /**
     * Connects the SPADE Suit to the suitName "Spades"
     */
    SPADE("Spades");

    String suitName;

    /**
     * Constructor for Suit, to set the suitName based on the string passed in as an argument
     * @param suitName Used to determine the suit of the Card when one is created
     */
    Suit(String suitName) {
        this.suitName = suitName;
    }

    /**
     * Getter for the name of the suit
     * @return The suitName to be used when creating the cards name to be printed to the console.
     */
    public String toString(){
        return suitName;
    }
}
