public class DiceGame {
    public static void main(String[] args) {
        PairOfDice dice = new PairOfDice();
        dice.roll();
        System.out.println("Dice 1: "+ dice.die1 + " | Dice 2: "+ dice.die2);
    }
}