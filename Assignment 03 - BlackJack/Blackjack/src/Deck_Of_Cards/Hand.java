package Deck_Of_Cards;

import java.util.ArrayList;

/**
 * Hand class contains a ArrayList of cards called hand, and contains methods to
 * add cards from the deck to hand,
 * discard from the hand to a deck,
 * Check values of cards at each index of the hand,
 * Calculate the total value of cards in the hand.
 * Variables:
 *  ArrayList<Card> hand
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
     * @param deck
     */
    public void takeCardFromDeck (Deck deck) {
        hand.add(deck.takeCard());
    }

    /**
     * Returns the contents of the hand as a string.
     * For each card in the hand, add it to the string output, with the following " - " added to the end of it.
     * Return the final output string to the method/function that called it.
     * @return output
     */
    public String toString(){
        String output = "";
        for(Card card: hand){
            output += card + " - ";
        }
        return output;
    }

    /**
     * Method to calculate the total value of the hand in the game Blackjack.
     * Created two integer variables called value and aceCount.
     */
    public int calculatedValue(){

        //variable to count number of aces, and current total value
        int value = 0;
        int aceCount = 0;

        //For each card in this hand
        for(Card card: hand){
            //Add the card value to the hand
            value += card.getValue();
            //Count how many aces have been added
            if (card.getValue() == 11){
                aceCount ++;
            }
        }
        //if we have a scenario where we have multiple aces, as may be the case of drawing 10,
        // followed by two or more aces, (10+11+1 > 21)
        //go back and set each ace to 1 until get back under 21, if possible
        if (value > 21 && aceCount > 0){
            while(aceCount > 0 && value > 21){
                aceCount --;
                value -= 10;
            }
        }
        return value;
    }

    public Card getCard(int idx){
        return hand.get(idx);
    }

    public void discardHandToDeck(Deck discardDeck){

        //copy cards from hand to discardDeck
        discardDeck.addCards(hand);

        //clear the hand
        hand.clear();

    }



}
