package Deck_Of_Cards;

import java.util.ArrayList;

/**
 * Hand class contains a ArrayList of cards called hand, and contains methods to
 * add cards from the deck to hand,
 * discard from the hand to a deck,
 * Check values of cards at each index of the hand,
 * Calculate the total value of cards in the hand.
 * Variables:
 *  ArrayList containing Card objects named Hand
 **/
public class Hand {
    private ArrayList<Card> hand;

    /**
     * Default and only Constructor for Hand, creates
     * Sets the variable hand equal to an empty ArrayList to contain Card objects.
     */
    public Hand() {
        hand = new ArrayList<Card>();
    }

    /**
     * Method to take the top card from the argument deck and adds that card to the hand ArrayList
     * @param deck The deck from which the card is to be taken from
     */
    public void takeCardFromDeck (Deck deck) {
        hand.add(deck.takeCard());
    }

    /**
     * Returns the contents of the hand as a string.
     * For each card in the hand, add it to the string output, with the following " - " added to the end of it.
     * Return the final output string to the method/function that called it.
     * @return Every card in the hand separated by a " - " as a String
     */
    public String toString()
    {
        String output = "";
        for(Card card: hand)
        {
            output += card + " - ";
        }
        return output;
    }

    /**
     * Method to calculate the total value of the hand in the game Blackjack.
     * Created two integer variables called value and aceCount.
     * @return the calculated value of this hand as an integer
     */
    public int calculatedValue()
    {

        //value stores the total value of the hand
        int value = 0;
        // aceCount keeps track of the number of aces that are currently at a value of 11
        int aceCount = 0;

        //For each card in this hand
        for(Card card: hand)
        {
            //Add the card value to the hand
            value += card.getValue();
            //Count how many aces have been added
            if (card.getValue() == 11)
            {
                aceCount++;
            }
        }


        /* If the hand value is over 21, AND there is at least 1 ace.
        For each ace in the hand, reduce the aceCount by 1, and reduce the value by 10 (to simulate 11 -> 1)
        Then check if the hand's value is still over 21 AND if there are more aces to discount.
         */
        if (value > 21 && aceCount > 0)
        {
            while(aceCount > 0 && value > 21)
            {
                aceCount --;
                value -= 10;
            }
        }
        return value;
    }

    /**
     * Method to return the card at the given index of the hand.
     * Used by the dealer class to get the first card of its hand.
     * @param idx The position of the card in the hand ArrayList
     * @return the card object at the given index from this hand
     */
    public Card getCard(int idx) {return hand.get(idx);}

    /**
     * Method to transfer the cards in the given had to a deck, then remove all cards in the hand.
     * In the Blackjack game, it is used to move the dealer and player's hands to the discarded deck, so those cards are
     * removed from the game for the next round.
     * @param discardDeck The discard pile for the current Game
     */
    public void discardHandToDeck(Deck discardDeck)
    {

        // Create copies of the card in the hand in the given deck
        discardDeck.addCards(hand);

        //Remove all cards from this hand
        hand.clear();
    }
}
