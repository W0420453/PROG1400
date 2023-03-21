public class TestBankAccount {
    public static void main(String[] args)
    {
        /* Creating BankAccount with default constructor, so default values */
        BankAccount Empty = new BankAccount();

        /* Creating BankAccount with only String Variables */
        BankAccount Nathan = new BankAccount("Nathan", "L'Abbé", "123 Fake Street");

        /* Creating BankAccount with all Variables */
        BankAccount Complete = new BankAccount(31, "FirstName","LastName","456 Fake Street", 100394);

        /* Creating Bank Account List to cycle through later */
        BankAccount[] account_array = new BankAccount[3];

        account_array[0] = Empty;
        account_array[1] = Nathan;
        account_array[2] = Complete;

        for (int i = 0; i < account_array.length; i++) {
            account_array[i].DisplayAllInformation();
        }
        /* Displaying Information for each BankAccount Created */


    }
}