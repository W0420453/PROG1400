package Deck_Of_Cards;
import java.util.ArrayList;
public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<Card>();
    }

    public Deck(boolean makeDeck){
        deck = new ArrayList<Card>();
        if(makeDeck){
            //Go through all the suits
            for(Suit suit : Suit.values()){
                //Go through all the ranks
                for(Rank rank : Rank.values()){
                    //add a new card containing each iteration's suit and rank
                    deck.add(new Card(suit, rank));
                }
            }
        }
    }

    public void addCard(Card card) {
        deck.add(card);
    }

    public Card takeCard() {
        Card cardToTake = new Card(deck.get(0));
        deck.remove(0);
        return cardToTake;
    }

    public String toString(){
        //A string to hold everything we're going to return
        String output = "";

        //for each Deck_Of_Cards.Card "card" in the deck
        for(Card card: deck){
            //add the card and the escape character for a new line
            output += card;
            output += "\n";
        }
        return output;
    }

    public void shuffle(){

        ArrayList<Card> shuffled = new ArrayList<Card>();
        //iterate through the size of the deck, so each card can be pulled
        while(deck.size()>0){
            int cardToPull = (int)(Math.random()*(deck.size()-1));
            shuffled.add(deck.get(cardToPull));
            deck.remove(cardToPull);
        }
        deck = shuffled;
    }

    public voi d



}
