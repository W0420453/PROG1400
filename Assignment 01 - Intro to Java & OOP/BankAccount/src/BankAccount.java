public class BankAccount {

    int accountNumber = 2;
    String firstName = "empty";
    String lastName = "empty";
    String address = "empty";
    double balance = 2;


    public BankAccount()
    {
        /* Empty due to the BankAccount Class itself initializing the variables to the default values*/
    }


    public BankAccount(int accountNumber, String firstName, String lastName, String address, double balance)
    {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.balance = balance;
    }

    public BankAccount(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        /* Account Number and Balance have been preset above. */

    }

    public void SetFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void SetLastName(String lastName) {
        this.lastName = lastName;
    }

    public void SetAddress(String address) {
        this.address = address;
    }

    public void SetAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void SetBalance(double balance) {
        this.balance = balance;
    }

    public String GetFirstName() {
        return this.firstName;
    }

    public String GetLastName() {
        return this.lastName;
    }

    public String GetAddress() {
        return this.address;
    }

    public int GetAccountNumber() {
        return this.accountNumber;
    }

    public double GetBalance() {
        return this.balance; /* Not formatting due to balance potentially needed more than 3 digits */
    }

    public void Withdraw(double withdrawAmount) {

        System.out.println("\nAttempting to Withdraw $"+String.format("%.2f",withdrawAmount)+" from "+this.firstName+"'s Bank Account");

        if (this.balance < withdrawAmount)
        {
            System.out.println("You cannot withdraw more then you have in your Bank Account");
            System.out.println("Current Balance: "+ String.format("%.2f",this.balance) +" | Withdraw amount requested: "+ withdrawAmount);
        }
        else
        {
            System.out.println("Old Balance: $"+ String.format("%.2f",this.balance));
            this.balance -= withdrawAmount;
            System.out.println("New Balance: $"+ String.format("%.2f",this.balance));
        }

    }

    public void Deposit(double depositAmount) {
        System.out.println("\nDepositing $"+String.format("%.2f",depositAmount) +" into "+this.firstName+"'s Bank Account");
        this.balance += depositAmount;
        System.out.println("New Balance: $"+ String.format("%.2f",this.balance));
    }

    public void DisplayAllInformation() {
        System.out.println("\nBANK ACCOUNT INFORMATION");
        System.out.println("------------------------");
        System.out.println("First Name: "+ this.firstName);
        System.out.println("Last Name: "+ this.lastName);
        System.out.println("Address: "+ this.address);
        System.out.println("Account Number: "+ this.accountNumber);
        System.out.println("Balance: $"+ String.format("%.2f",this.balance));
    }


}
