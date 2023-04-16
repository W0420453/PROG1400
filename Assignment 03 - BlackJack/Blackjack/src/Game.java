import Deck_Of_Cards.Deck;
import Participants_BlackJack.Dealer;
import Participants_BlackJack.Player;

public class Game {

    private int wins, losses, pushes;
    private Deck deck, discarded;

    private Dealer dealer;
    private Player player;

    /**
     * First function ran in the program, only creates a new game object, which contains the code for the rest of
     * the program
     * @param args is the only parameter, but it is never used
     * @return Nothing
     **/

    public static void main(String[] args) {
        Game blackjack = new Game();
    }

    //Constructor for the Game class

    /**
     * Constructor for the game class, keeps track of the wins, losses, and pushes for the games played.
     * Generates a new Deck apon creation, with 1 of every card (Ace to King) for each of the 4 suits.
     * @param  Nothing
     * @return Nothing
     **/
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
            System.out.println();
            System.out.println("Starting Next Round... Wins: " + wins + " Losses: "+ losses+ " Pushes: "+pushes);
            dealer.getHand().discardHandToDeck(discarded);
            player.getHand().discardHandToDeck(discarded);

            //Check to make sure the deck has at least 20 cards left, to weaken card counting techniques
            if(deck.cardsLeft() < 20){
                deck.reloadDeckFromDiscard(discarded);
            }

            deck = new Deck(true);
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
            System.out.println("You have blackjack!");

            if(dealer.hasBlackjack())
            {
                dealer.printHand();
                System.out.println(dealer.getName()+" ALSO has blackjack... - Push.");
                pushes++;
                startRound();
            }
            else
            {
                System.out.println("You Win!!!");
                wins++;
            }
        }
        /* Checking if the dealer has blackjack, if the player does NOT have blackjack*/
        else if (dealer.hasBlackjack()) {
            dealer.printHand();
            System.out.println("Dealer has BlackJack. You lose.");
        }

        player.makeDecision(deck, discarded);

        //Check if they busted
        if(player.getHand().calculatedValue() > 21){
            System.out.println("You have gone over 21.");
            //count the losses
            losses ++;
            //start the round over
            startRound();
        }

        //Now it's the dealer's turn
        dealer.printHand();
        while(dealer.getHand().calculatedValue()<17){
            dealer.hit(deck, discarded);
        }


        //Check who wins
        if(dealer.getHand().calculatedValue()>21){
            System.out.println("Dealer busts");
            wins++;
        }
        else if(dealer.getHand().calculatedValue() > player.getHand().calculatedValue()){
            System.out.println("You lose.");
            losses++;
        }
        else if(player.getHand().calculatedValue() > dealer.getHand().calculatedValue()){
            System.out.println("You win.");
            wins++;
        }
        else{
            System.out.println("Push.");
        }

        //Start a new round
        startRound();



    }

}
