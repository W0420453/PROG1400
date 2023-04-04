package Participants_BlackJack;

import Deck_Of_Cards.Deck;
import Deck_Of_Cards.Hand;

public class Person {
    private String name;
    private Hand hand;

    public Person() {
        this.hand = new Hand();
        this.name = "";
    }

    public void setHand(Hand hand) {
       this.hand = hand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return this.hand;
    }

    public String getName() {
        return this.name;
    }

    public void hit(Deck deck , Deck discard) {
        this.getHand().takeCardFromDeck(deck);
    }

    public boolean hasBlackjack() {
        if (this.getHand().calculatedValue() == 21) {return true;}
        else {return false;}
    }

    public void printHand(){
        System.out.println(this.name + "'s hand looks like this:");
        System.out.println(this.hand + " Valued at: " + this.hand.calculatedValue());
    }

}
