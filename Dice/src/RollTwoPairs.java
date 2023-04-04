public class RollTwoPairs {
    public static void main(String[] args) {

        PairOfDice firstDice;
        firstDice = new PairOfDice();

        PairOfDice secondDice;
        secondDice = new PairOfDice();

        int countRolls = 0;

        int total1 = 0;
        int total2 = 0;

        do {
            countRolls++;

            System.out.println("\n=========================================");
            System.out.println("Current Roll Count: "+ countRolls);
            firstDice.roll();
            total1 += firstDice.die1 + firstDice.die2;
            System.out.println("First pair comes up: " + (firstDice.die1 + firstDice.die2) );
            secondDice.roll();
            total2 += secondDice.die1 + secondDice.die2;
            System.out.println("Second pair comes up: " + (secondDice.die1 + secondDice.die2) );

            System.out.println("Total for First Pair of Dice: " + total1);
            System.out.println("Total for Second Pair of Dice: " + total2);


        } while (total1 != total2);

        System.out.println("\nIt took " + countRolls + " rolls until the totals were the same.");
    } // end main()

} // end class RollTwoPairs
