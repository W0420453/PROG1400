public class PairOfDice {
    public int die1 = 3;
    public int die2 = 4;
    private final int faces = 6;

    public PairOfDice() {
        //Constructor. Rolls the dice when called to have values assigned.
        roll();
    }
    public PairOfDice(int val1, int val2) {
        //Constructor. Creates a pair of dice that are initially showing the values
        //  val1 = die1  |   val2 = die2
        die1 = val1;
        die2 = val2;
    }

    public void roll() {
        die1 = (int)(Math.random()*faces) + 1;
        die2 = (int)(Math.random()*faces) + 1;
    }



}
