package Participants_BlackJack;

/**
 * Dealer class,
 *
 * Variables (Inherited from Person):
 *  private String name
 *  private Hand hand
 **/
public class Dealer extends Person
{

    /**
     * Method to print jsut the first card of the dealers hand, then inform the user that the other card is hidden
     */
    public void printFirstHand()
    {
        System.out.println("The "+getName()+" has Revealed \n" + getHand().getCard(0));
        System.out.println("The other card is face down\n");
    }

    /**
     * Constructor for Dealer class, calls the setName method of the Person class to set name equal to "Dealer"
     */
    public Dealer() {
        super.setName("Dealer");
    }
}
