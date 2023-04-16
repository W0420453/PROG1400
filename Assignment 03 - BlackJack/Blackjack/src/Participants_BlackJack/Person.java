package Participants_BlackJack;
import Deck_Of_Cards.Deck;
import Deck_Of_Cards.Hand;

/**
 * Person class, only used as an abstract class for blackjack,
 * yet will not be declared as one for use in future programs
 *
 * Variables:
 *  private String name
 *  private Hand hand
 **/

public class Person {
    private String name;
    private Hand hand;

    /**
     * Default and only Constructor for Person, sets hand to be a blank arrayList of cards, and name to a empty string
     **/
    public Person() {
        this.hand = new Hand();
        this.name = "";
    }

    /**
     * Setter for the hand ArrayList, takes a Hand for an argument
     * @param Hand
     **/
    public void setHand(Hand hand) {
       this.hand = hand;
    }

    /**
     * Setter for the string Name, takes a string for an argument
     * @param name
     **/
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for the hand variable, Returns the ArrayList<Card>hand
     * @return Hand
     **/
    public Hand getHand() {
        return this.hand;
    }

    /**
     * Getter for the name, Returns the String name
     * @return name
     **/
    public String getName() {
        return this.name;
    }


    /**
     * Method to check if the calculated hand is equal to 21, which is blackjack for the purposes of this program
     * @return true if the hand is equal to 21
     * @return false otherwise
     **/
    public boolean hasBlackjack() {
        if (this.getHand().calculatedValue() == 21) {return true;}
        else {return false;}
    }

    /**
     * Method to Print the Contents of the persons hand, along with the value of the hand.
     * NOTE: The calculatedValue works for the game blackjack, Face cards are all worth 10, Ace's are either 11 or 1.
     **/
    public void printHand(){
        System.out.println(this.name + "'s hand looks like this:");
        System.out.println(this.hand + " Valued at: " + this.hand.calculatedValue());
    }

    /**
     * Method to hit in blackjack,
     * If the deck is empty, shuffle back in the discard pile
     * Take the top card of the deck and add it to Persons hand.
     * Print to the console that the Person got a card
     * Print out the value of the Persons hand
     **/
    public void hit(Deck deck, Deck discard){
        //If there's no cards left in the deck
        if (!deck.hasCards()) {
            deck.reloadDeckFromDiscard(discard);
        }
        this.hand.takeCardFromDeck(deck);
        System.out.println(this.name + " gets a card");
        this.printHand();
    }

}
