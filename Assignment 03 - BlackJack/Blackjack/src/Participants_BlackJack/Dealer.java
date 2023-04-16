package Participants_BlackJack;

public class Dealer extends Person {
    public void printFirstHand() {
        System.out.println("The "+getName()+" has Revealed \n" + getHand().getCard(0));
        System.out.println("The other card is face down\n");
    }

    public Dealer() {
        super.setName("Dealer");
    }
}
