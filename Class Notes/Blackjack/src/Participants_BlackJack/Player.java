package Participants_BlackJack;

import Deck_Of_Cards.Deck;

public class Player extends Person {

    public Player() {
        super.setName("Default Player Name");
    }

    public Player(String name) {
        super.setName(name);
    }

    public void makeDecision(Deck deck, Deck discard) {

    }

}
