package Participants_BlackJack;
import java.util.Scanner;
import Deck_Of_Cards.Deck;

/**
 * Player class, child of the Person class
 *
 * Variables (inherited from Person):
 *  private String name
 *  private Hand hand
 *
 **/
public class Player extends Person {

    Scanner input = new Scanner(System.in);

    /**
     * Default Constructor for Player, takes no arguments
     **/
    public Player() {
        super.setName("Default Player Name");
    }

    /**
     * Constructor for Player class, takes a string as an argument.
     * calls the setName method of the parent class Person to set the name equal to the given string.
     * @param name The name of the player object.
     **/
    public Player(String name) {
        super.setName(name);
    }

    /**
     * Method to ask the player if they want to hit or stand in the game blackjack.
     * Takes the current Deck and Discard pile as arguments, then asks the user to input a 1 or 2 to hit or stand.
     *
     * If the user wants to hit (inputted 1), it calls the hit method, that was extended from the person class, then...
     *    If the hands calculatedValue is over then 20, return nothing to end the method.
     *    else call makeDecision within itself (Recursively)
     *
     * If user inputs any number that is not 1, then the program tells the user they stand, and completes the function
     *
     *@param deck the deck to be drawn from for cards
     *@param discard the discard pile, only to be used if the deck that is being drawn from runs out of cards
     **/
    public void makeDecision(Deck deck, Deck discard) {

        int decision = 0;
        boolean getNum = true;

        //while were getting a number...
        while(getNum){

            try
            {
                System.out.println("Would you like to: 1) Hit or 2) Stand");
                decision = input.nextInt();

                // Confirming if the user inputted either a 1 or 2, if so, then change getNum to exit the input loop
                if ( (decision == 1) || (decision == 2) )
                {
                    getNum = false;
                }
                else
                {
                    System.out.println("You entered a number other then 1 or 2");
                }
            }
            catch(Exception e)
            {
                System.out.println("Invalid Input, please enter 1 or 2");
                input.next();
            }
        }

        //The user decides to hit
        if (decision == 1)
        {
            // Grab a card from the deck and add it to the players hand
            this.hit(deck, discard);

            //If the player has less than 21, call the makeDecision recursively to allow the user to make another choice
            if(this.getHand().calculatedValue()<21)
            {
                this.makeDecision(deck, discard);
            }
        }
        // The user decides to stand.
        else if (decision == 2)
        {
            System.out.println("You stand.\n");
        }
    }
}
