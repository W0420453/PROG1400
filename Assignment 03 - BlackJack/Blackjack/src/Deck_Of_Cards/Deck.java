package Deck_Of_Cards;
import java.util.ArrayList;

/**
 * The deck class contains all the functions that would add or remove cards, along with modifying the number or order
 * of the cards inside the deck.
 */
public class Deck {

    /**
     * The Deck object has an ArrayList of card objects named deck.
     */
    private ArrayList<Card> deck;

    /**
     * Constructor for the Deck Class
     * creates a variable called deck, which is set to an empty ArrayList which will contain card objects in the future.
     *
     * This constructor is used for the discarded deck in Game.class, to allow for the storage of discarded cards,
     * which are used to recreate the deck when the deck gets low on cards
     */
    public Deck(){
        deck = new ArrayList<Card>();
    }

    /**
     * Constructor for the Deck Class, with an additional parameter that checks if 52 cards are to be added to the
     * created deck ArrayList.
     *
     * The deck is created via two for loops,
     * The outer for loop iterates a number of times equal to the number of suits inside the Suits.java file (4)
     * The Inner for loop iterates a number of times equal to the number of Ranks inside the Rank.java file (13)
     *
     * The end result is 52 cards, 4 of each suit with each suit having 13 different ranks
     */
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

    /**
     * Method to add individual cards to the deck, not used for the blackjack game
     */
    public void addCard(Card card) {
        deck.add(card);
    }

    /**
     * Method to make a card object that is a copy of the top card of the deck, then removes the top card of the deck
     * Before finally returning the copied card to wherever called takeCard()
     * @return card
     */
    public Card takeCard() {
        Card cardToTake = new Card(deck.get(0));
        deck.remove(0);
        return cardToTake;
    }

    /**
     * Method to turn the entire contents of the deck object as a string, each card printed on a new line and return
     * that string to the function that called it.
     * @return output
     */
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

    /**
     * Method to shuffle the deck of cards.
     * This is done by creating a new empty ArrayList that will contain cards called shuffled.
     * Then while deck still has cards in it. Perform the Following steps
     * 1. Generate a random integer between 0 and the number of cards left in deck - 1
     * 2. Add the card at that index in deck to shuffled
     * 3. Remove the card at that index in deck from deck.
     *
     * After the while loop evaluates to false, set deck to be equal to shuffled.
     */
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

    /**
     * Method to check if the deck has any cards left in it,
     * returns true if it has more than 0 cards left in it.
     * returns false if it has 0 or less cards left in it.
     *
     * @return true or false
     */
    public boolean hasCards(){
        if (deck.size()>0){
            return true;
        }
        else{
            return false;
        }
    }


    /**
     * Method to completely remove all cards from the deck
     */
    public void emptyDeck(){
        deck.clear();
    }

    /**
     * Method to take an argument of an arrayList and then appending them to the current Deck of cards
     * @param ArrayList<card>
     */
    public void addCards(ArrayList<Card> cards){
        deck.addAll(cards);
    }

    /**
     * Returns the Contents of this decl
     * @return this.deck  (Type of deck: ArrayList<Card>)
     */
    public ArrayList<Card> getCards() {
        return this.deck;
    }


    /**
     * Method to take a deck (In this case the discarded deck) , add those cards to the current deck.and then shuffle
     * The current deck is then shuffled, the old discarded deck is emptied.
     * Then a message telling the user that the deck has been reshuffled and reset
     * @param discard which is the discarded deck from game.java
     */
    public void reloadDeckFromDiscard(Deck discard){
        this.addCards(discard.getCards());
        this.shuffle();
        discard.emptyDeck();
        System.out.println("The discard has been added to the deck, and the deck has been reshuffled.");
    }

    /**
     * Method to get the number of cards left in the deck.
     * @return deck.size()
     */
    public int cardsLeft(){
        return deck.size();
    }

}
