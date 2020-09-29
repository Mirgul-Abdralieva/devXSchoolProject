package mirgulHomeWorkAugust;
// The Account class models a bank account with a balance.
// use data encapsulation to hide the data and use getter and setter methods?

public class AccountEncapsulationToHideTheData {

    // The private instance variables
    private int accountNumber;
    private double balance;

    // The constructors (overloaded)

    public AccountEncapsulationToHideTheData(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public AccountEncapsulationToHideTheData(int accountNumber) {        // with default balance
        this.accountNumber = accountNumber;
    }


     // The public getters/setters for the private instance variables.
    // No setter for accountNumber because it is not designed to be changed.

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    // Add the given amount to the balance.
    public void credit(double amount){
        balance += amount;
    }


}
