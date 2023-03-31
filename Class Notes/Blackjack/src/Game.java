import Deck_Of_Cards.Deck;
import Participants_BlackJack.Dealer;
import Participants_BlackJack.Player;

public class Game {

    //Create variables used by the Game class
    private int wins, losses, pushes;
    private Deck deck, discarded;

    private Dealer dealer;
    private Player player;

    public static void main(String[] args) {
        Game blackjack = new Game();
    }
    //Constructor for the Game class
    public Game(){
        //Set the score to 0
        wins = 0; losses = 0; pushes = 0;
        deck = new Deck(true);
        discarded = new Deck();

        dealer = new Dealer();
        player = new Player();

        deck.shuffle();
        startRound();
    }

    public void startRound() {

        if (wins > 0 || losses > 0 || pushes > 0) {

        }
        /* Dealing each player their first two cards */
        player.getHand().takeCardFromDeck(deck);
        player.getHand().takeCardFromDeck(deck);

        dealer.getHand().takeCardFromDeck(deck);
        dealer.getHand().takeCardFromDeck(deck);

        dealer.printFirstHand();
        player.printHand();

        // Checking if player has blackjack, players blackjack beats the dealers blackjack
        if (player.hasBlackjack())
        {
            System.out.print("You have blackjack!");  // NOT PRINTING NEW LINE YET

            if(dealer.hasBlackjack())
            {
                System.out.println("\n"+dealer.getName()+" ALSO has blackjack... - Push.");
                pushes++;
                startRound();
            }
            else
            {
                System.out.println("  You Win!!!");
            }
        }
        if (dealer.hasBlackjack()) {

        }

    }

}
