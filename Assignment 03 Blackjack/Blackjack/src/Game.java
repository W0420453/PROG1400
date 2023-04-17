import Deck_Of_Cards.Deck;
import Participants_BlackJack.Dealer;
import Participants_BlackJack.Player;
import java.util.Scanner;

/**
 * The main file for the Blackjack program, contains the public static void main(String[] args) function that all java
 * programs require.
 *
 * Variables:
 *  private int wins, losses, pushes, gamesPlayed;
 *  private boolean userContinue;
 *  private Deck playingDeck, discarded;
 *  private Dealer dealer;
 *  private Player player;
 */
public class Game {

    private int wins, losses, pushes, gamesPlayed;

    // Variable used to check if the user wants to keep playing blackjack.
    private boolean userContinue = true;

    private Deck playingDeck, discarded;

    private Dealer dealer;
    private Player player;

    /**
     * First function ran in the program, only creates a new game object, which contains the code for the rest of
     * the program
     * @param args is the only parameter, but it is never used
     **/
    public static void main(String[] args) {
        Game blackjack = new Game();
    }

    /**
     * Constructor for the game class, keeps track of the wins, losses, and pushes for the games played.
     * Generates a new Deck called playingDeck, with 1 of every card (Ace to King) for each of the 4 suits.
     * Generates a new Deck called discarded that is empty, to store all the discarded cards
     * Creates a new Dealer and a new Player.
     * Starts the Round.
     *
     * After the round is completed, the user (player) is asked if they would like to keep playing.
     * If the user wants to continue playing, another round is started
     * Else, a goodbye message is printed and the game is over
     **/
    public Game(){

        Scanner input = new Scanner(System.in);

        // String that gets used to store the users input to check if they want to continue playing blackjack
        /* Unlike how the name of the player is obtained, the user's input needs to be compared against other
        * strings, so a variable needs to be created so the program can use the input multiple times.
        */
        String userInputContinue;

        //Initializing the wins, losses, pushes, gamesPlayed
        wins = 0; losses = 0; pushes = 0; gamesPlayed = 0;

        // Creating a new deck with all 52 cards in it (4 of each of the 13 ranks)
        playingDeck = new Deck(true);

        // Creating an empty deck so cards can be discarded to it, so the playingDeck can be remade when it runs out
        discarded = new Deck();

        // Creating a Dealer
        dealer = new Dealer();

        // Creating a new player, but first asking the user for the name for the player
        System.out.print("Enter your Name: ");
        player = new Player(input.nextLine());

        // Shuffling the playingDeck, then starting a round of blackjack
        playingDeck.shuffle();
        startRound();

        // Loop to check if the user wants to continue playing blackjack after the first round.
        while (userContinue)
        {
            // Asking if the user wants to keep playing blackjack, converting their input to uppercase
            System.out.print("Do you wish to keep playing Blackjack? (Yes/No): ");
            userInputContinue = input.nextLine().toUpperCase();

            // If the user wants to continue, call startRound method.
            if ( userInputContinue.equals("YES") || (userInputContinue.equals("Y") ) )
            {
                startRound();
            }
            // Else if the user wants to leave the blackjack program,
            // print out the final scores, print a goodbye message, and set userContinue to be false to exit the loop.
            else if ( userInputContinue.equals("NO") || (userInputContinue.equals("N") ) )
            {
                System.out.println("FINAL SCORES");
                scoreboard();
                System.out.println("\n Goodbye!");
                userContinue = false;
            }
            // Otherwise, tell the user they entered an invalid input, and let the loop repeat.
            else { System.out.println("Invalid Input, please enter yes (y) or no (n)");}
        }
    }

    /**
     * Method to print the current wins, losses, and pushes of the current game of blackjack
     * If at least 1 game of blackjack has been played, then also display the win, loss and push/tie percentages as well
     **/
    public void scoreboard()
    {
        System.out.println("\n===============================");
        System.out.println("           SCOREBOARD          ");
        System.out.println("===============================");
        System.out.println("Player Wins: " + wins + " | Dealer Wins: " + losses + " | Pushes (Ties): " + pushes);
        System.out.println("Number of Games Played: " + gamesPlayed);

        if (gamesPlayed > 0)
        {
            System.out.println("\nPlayer Win Percentage: " + ((double) wins / (double) gamesPlayed) * 100 + "%");
            System.out.println("Dealer Win Percentage: " + ((double) losses / (double) gamesPlayed) * 100 + "%");
            System.out.println("Push/Tie Percentage: " + ((double) pushes / (double) gamesPlayed) * 100 + "%");
        }
    }

    /**
     * This is the main game loop for the program
     *
     * Starts by checking if there has been at least 1 game played,
     *  If true, then discard the dealers and players hands.
     *  Check if the playingDeck has less than 20 cards left, if so, copy the discarded deck to the playingDeck to played again.
     *
     * Deals 2 cards from the playingDeck to both the player and dealer
     *
     * Prints the first card of the dealers hand to the console.
     * Prints the contents of players hand to the console.
     *
     * IF the player has blackjack
     *      Print to the console that the Player has blackjack.
     *      IF the dealer also has blackjack.
     *          Print to the console that the round was a push / tie,
     *          Increment pushes by 1
     *      ELSE
     *          Print to the console that Player Wins
     *          Increment wins by 1
     *  ELSE IF the dealer has blackjack
     *      Print the dealers entire hand to the console and tell teh user that dealer wins,
     *      Increment Losses by 1
     *  ELSE
     *      Call the makeDecision method of Player to allow the user to decide between hit or stand.
     *
     * IF Players hand > 21
     *  Print to the console that the Player went over 21.
     *
     * Print the all cards in the dealers hand.
     *
     * WHILE Dealers hand less than 17 AND Players hand less than or equal to 21
     *  Dealer calls its hit function to add a card to its hand.
     *
     * WIN CHECKS
     *
     * IF players hand greater than 21
     *  Print Players name has busted to the console.
     *  Increment losses by 1;
     * ELSE IF dealers hand greater than  21
     *  Print Dealer has busted to the console.
     *  Increment wins by 1;
     * ELSE IF players hand greater than dealers hand
     *  Print that Players hand is greater than Dealers Hand
     *  Increments wins by 1;
     * ELSE IF players hand less than dealers hand
     *  Print that Dealers hand is greater than Players Hand
     *  Increment losses by 1;
     * ELSE
     *  Print PUSH / TIE to the console.
     *  Increment pushes by 1;
     *
     * Increment gamesPlayed by 1;
     **/
    public void startRound()
    {

        /* If any games have been played before
           IF True
                Print out the Current Scoreboard
                Discard the Dealer and Player's Hands.
                IF playingDeck has less than 20 cards
                    Add the contents of the discarded to the playingDeck, then empty the discarded deck.
                Shuffle the playingDeck
         */
        if (gamesPlayed > 0)
        {
            scoreboard();
            dealer.getHand().discardHandToDeck(discarded);
            player.getHand().discardHandToDeck(discarded);

            //Check to make sure the playingDeck has less than 20 cards left, to weaken card counting techniques
            if(playingDeck.cardsLeft() < 20)
            {
                playingDeck.reloadDeckFromDiscard(discarded);
            }

            // Shuffling the playingDeck
            playingDeck.shuffle();
        }

        // Dealing the player their first two cards
        player.getHand().takeCardFromDeck(playingDeck);
        player.getHand().takeCardFromDeck(playingDeck);

        // Dealing the dealer their first two cards.
        dealer.getHand().takeCardFromDeck(playingDeck);
        dealer.getHand().takeCardFromDeck(playingDeck);

        // Printing out all known card information to the player to the console.
        dealer.printFirstHand();
        player.printHand();

        // Checking if player has blackjack, players blackjack beats the dealers blackjack
        if (player.hasBlackjack())
        {
            System.out.println("You have blackjack!");

            // Check if the dealer ALSO has blackjack
            if(dealer.hasBlackjack())
            {
                dealer.printHand();
                System.out.println(dealer.getName()+" ALSO has blackjack... - Push.");
                pushes++;
            }
            else // Just the player has blackjack, so they win
            {
                System.out.println("You Win!!!");
                wins++;
            }
        }
        // Checking if the dealer has blackjack, if the player does NOT have blackjack
        else if (dealer.hasBlackjack())
        {
            dealer.printHand();
            System.out.println("Dealer has BlackJack. You lose.");
            losses++;
        }

        // If neither the dealer nor the player has blackjack, continue with the game as normal
        else
        {

            player.makeDecision(playingDeck, discarded);

            //Check if they busted
            if (player.getHand().calculatedValue() > 21)
            {
                System.out.println("You have gone over 21.");
            }

            dealer.printHand();
            /* If the player has not gone over 21. Then it is the dealers turn.
               If the player is over 21, then the dealer wins no matter what, so it can be skipped
            */
            while ( (dealer.getHand().calculatedValue() < 17 ) && ( player.getHand().calculatedValue() <= 21) )
            {
                dealer.hit(playingDeck, discarded);
            }

            System.out.print("\nROUND OUTCOME: ");
            //Determining the winner of the round
            //Player Busts
            if (player.getHand().calculatedValue() > 21)
            {
                System.out.println(player.getName()+" BUSTS");
                losses++;
            }
            //Dealer Busts
            else if (dealer.getHand().calculatedValue() > 21)
            {
                System.out.println(dealer.getName()+" BUSTS");
                wins++;
            }
            //Player's Hand is Better
            else if (dealer.getHand().calculatedValue() > player.getHand().calculatedValue())
            {
                System.out.println(dealer.getName()+" WINS");
                losses++;
            }
            //Player's Hand is Better
            else if (player.getHand().calculatedValue() > dealer.getHand().calculatedValue())
            {
                System.out.println(player.getName()+" WINS");
                wins++;
            }
            //Dealer's Hand and Player's Hand are equal
            else
            {
                System.out.println("PUSH / TIED");
                pushes++;
            }
        }

        //Increasing the counter for the number of games played
        gamesPlayed++;

    }

}
