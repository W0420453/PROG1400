package Deck_Of_Cards;

/**
 * enum which contains the 13 card ranks in a typical set of playing cards
 */
public enum Rank {
    /**
     * Connects the ACE Rank to have a rankValue of 11, and a rankName of "Ace"
     */
    ACE("Ace", 11),

    /**
     * Connects the TWO Rank to have a rankValue of 2, and a rankName of "Two"
     */
    TWO("Two", 2),

    /**
     * Connects the THREE Rank to have a rankValue of 3, and a rankName of "Three"
     */
    THREE("Three", 3),

    /**
     * Connects the FOUR Rank to have a rankValue of 4, and a rankName of "Four"
     */
    FOUR("Four",4),

    /**
     * Connects the FIVE Rank to have a rankValue of 5, and a rankName of "Five"
     */
    FIVE("Five",5),

    /**
     * Connects the SIX Rank to have a rankValue of 6, and a rankName of "Six"
     */
    SIX("Six",6),
    /**
     * Connects the SEVEN Rank to have a rankValue of 7, and a rankName of "Seven"
     */
    SEVEN("Seven",7),

    /**
     * Connects the EIGHT Rank to have a rankValue of 2, and a rankName of "Eight"
     */
    EIGHT("Eight",8),

    /**
     * Connects the NINE Rank to have a rankValue of 9, and a rankName of "Nine"
     */
    NINE("Nine",9),

    /**
     * Connects the TEN Rank to have a rankValue of 10, and a rankName of "Ten"
     */
    TEN("Ten",10),

    /**
     * Connects the JACK Rank to have a rankValue of 10, and a rankName of "Jack"
     */
    JACK("Jack",10),

    /**
     * Connects the QUEEN Rank to have a rankValue of 10, and a rankName of "Queen"
     */
    QUEEN("Queen",10),

    /**
     * Connects the KING Rank to have a rankValue of 10, and a rankName of "King"
     */
    KING("King",10);

    String rankName;
    int rankValue;

    /**
     * Constructor for Rank, to set the rankName based on the string passed in as an argument
     * and the rankValue equal to the integer passed in as an argument.
     * @param rankName The name of the card to be created
     * @param rankValue The rankValue of the card to be created,
     */
    Rank(String rankName, int rankValue){
        this.rankName = rankName;
        this.rankValue = rankValue;
    }

    /**
     * Getter for the name of the rank
     * @return The name of the card without the suit
     */
    public String toString(){
        return rankName;
    }
}
