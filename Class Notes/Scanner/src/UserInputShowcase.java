import java.util.Scanner;

public class UserInputShowcase
{
    public static void main(String[] args)
    {
        int x = intUserInputValidation("x");
        int y = intUserInputValidation("y");

        System.out.println("X = "+ x +" | Y = "+ y);

        if (x == y)
        {
            System.out.println("x is equal to y!!!");
        } else if ( x > y ) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("y is greater than x");
        }
    }

    private static int intUserInputValidation(String intVarName)
    {
        boolean validInput = false;
        String userInput = "Not An Integer";
        int integerToReturn = 90874313; /*IF this number shows up, an major error occurred */
        Scanner myObj = new Scanner(System.in);

        while (!validInput)
        {
            System.out.print("Enter the value for "+ intVarName +": ");
            userInput = myObj.nextLine();

            try
            {
                integerToReturn = Integer.parseInt(userInput);
                validInput = true;
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("\nError: Input was not an integer");
            }
        }
        return integerToReturn;
    }

}