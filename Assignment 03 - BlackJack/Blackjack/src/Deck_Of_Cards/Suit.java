package Deck_Of_Cards;

/**
 * enum which contains the 4 suits in a typical set of playing cards
 */
public enum Suit {
    CLUB("Clubs"),
    DIAMOND("Diamonds"),
    HEART("Hearts"),
    SPADE("Spades");

    String suitName;

    /**
     * Setter to change the suitName to match the string passed in as an argument
     * @param suitName
     */
    Suit(String suitName) {
        this.suitName = suitName;
    }

    /**
     * Getter for the name of the suit
     * @return suitName
     */
    public String toString(){
        return suitName;
    }
}
