public class TestBankAccount {
    public static void main(String[] args)
    {
        /* Creating BankAccount with default constructor, so default values */
        BankAccount Empty = new BankAccount();

        /* Creating BankAccount with only String Variables */
        BankAccount Nathan = new BankAccount("Nathan", "L'Abbé", "123 Fake Street");

        /* Creating BankAccount with all Variables */
        BankAccount Complete = new BankAccount(31, "FirstName","LastName","456 Fake Street", 100394);

        /* Testing of looping through an array of object's
        BankAccount[] account_array = new BankAccount[3];
        account_array[0] = Empty;
        account_array[1] = Nathan;
        account_array[2] = Complete;

        // Displaying Information for each BankAccount Created
        for (int i = 0; i < account_array.length; i++) {
            account_array[i].DisplayAllInformation();
        }
        */

        Empty.DisplayAllInformation();
        Nathan.DisplayAllInformation();
        Complete.DisplayAllInformation();

        /* Filling out empty information for the Empty Bank Account */
        Empty.SetAddress("100 Truly Real Street");
        Empty.SetBalance(70500);
        Empty.SetAccountNumber(1);
        Empty.SetFirstName("Super-Real");
        Empty.SetLastName("Last-Name");

        /* Setting values for integer variables for the BankAccount Nathan */
        Nathan.SetBalance(250000);
        Nathan.SetAccountNumber(100);

        System.out.println("\n\nTesting Withdraw and Deposit Methods");
        /* Testing Withdraw and Deposit Methods */
        Nathan.Withdraw(5000);
        Complete.Deposit(5000);

        /* Displaying all individual variables using the accessors/getters of empty Class */
        System.out.println("\nFull Name: "+ Empty.GetFirstName() + " "+Empty.GetLastName());
        System.out.println("Account Number: "+Empty.GetAccountNumber());
        System.out.println("Lives at: "+ Empty.GetAddress());
        System.out.println("Total Balance: $"+String.format("%.2f",Empty.GetBalance()) );




    }
}