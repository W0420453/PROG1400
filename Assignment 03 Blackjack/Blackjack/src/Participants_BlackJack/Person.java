package Participants_BlackJack;
import Deck_Of_Cards.Deck;
import Deck_Of_Cards.Hand;

/**
 * Person class, only used as an abstract class for blackjack,
 * yet will not be declared as one for use in future programs
 *
 **/
public class Person
{
    private String name;
    private Hand hand;

    /**
     * Default and only Constructor for Person, sets hand to be a blank arrayList of cards, and name to a empty string
     **/
    public Person()
    {
        this.hand = new Hand();
        this.name = "";
    }

    /**
     * Setter for the hand ArrayList, takes a Hand for an argument
     * @param hand The contents of the hand to be copied to this Persons hand
     **/
    public void setHand(Hand hand) {
       this.hand = hand;
    }

    /**
     * Setter for the string Name, takes a string for an argument
     * @param name The name to be set for the Persons name
     **/
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for the hand variable, Returns the ArrayList made of cards called hand
     * @return Hand The contents of the Person hand
     **/
    public Hand getHand() {
        return this.hand;
    }

    /**
     * Getter for the name, Returns the String name
     * @return name The Name of the Person object.
     **/
    public String getName() {
        return this.name;
    }


    /**
     * Method to check if the calculated hand is equal to 21, which is blackjack for the purposes of this program
     * @return true if the hand is equal to 21,  false if the hand is less than 21 OR greater than 21
     **/
    public boolean hasBlackjack()
    {
        if (this.getHand().calculatedValue() == 21) {return true;}
        else {return false;}
    }

    /**
     * Method to Print the Contents of the persons hand, along with the value of the hand.
     * NOTE: The calculatedValue works for the game blackjack, Face cards are all worth 10, Ace's are either 11 or 1.
     **/
    public void printHand()
    {
        System.out.print(this.name + "'s hand :" + this.hand);
        System.out.println("\nValued at: " + this.hand.calculatedValue());
    }

    /**
     * Method to hit in blackjack,
     * If the deck is empty, shuffle back in the discard pile
     * Take the top card of the deck and add it to Persons hand.
     * Print to the console that the Person got a card
     * Print out the value of the Persons hand
     * @param deck the deck to be drawn from for cards
     * @param discard the discard pile, only to be used if the deck that is being drawn from runs out of cards
     **/
    public void hit(Deck deck, Deck discard)
    {
        //If there's no cards left in the deck
        if (!deck.hasCards())
        {
            deck.reloadDeckFromDiscard(discard);
        }
        this.hand.takeCardFromDeck(deck);
        System.out.println(this.name + " gets a card");
        this.printHand();
    }

}
