public class BankAccount {

    int accountNumber;
    String firstName;
    String lastName;
    String address;
    double balance;


    public BankAccount()
    {
        this.accountNumber = 2;
        this.firstName = "empty";
        this.lastName = "empty";
        this.address = "empty";
        this.balance = 2;
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
        this.accountNumber = 2;
        this.balance = 2;
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
        return this.balance;
    }

    public void DisplayAllInformation() {
        System.out.println("BANK ACCOUNT INFORMATION");
        System.out.println("------------------------");
        System.out.println("First Name: "+ this.firstName);
        System.out.println("Last Name: "+ this.lastName);
        System.out.println("Address: "+ this.address);
        System.out.println("Account Number: "+ this.accountNumber);
        System.out.println("Balance: "+ this.balance);
    }


}
