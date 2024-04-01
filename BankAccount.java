/**
 * Bank Account class.
 * @author Vivek Reddy Bhimavarapu.
 * This is a class definition for a BankAccount.
 */
public class BankAccount {

    // Private variables to store account details
    private double accountNumber;        // To store the account number
    private String accountHolderName;    // To store the account holder's name
    private double accountBalance;       // To store the current balance in the account

    // Constructor to initialize the BankAccount object with account number and holder's name
    public BankAccount(double accountNumber, String accountHolderName){
        this.accountNumber = accountNumber;      // Initialize account number
        this.accountHolderName = accountHolderName;  // Initialize account holder's name
        this.accountBalance = 0.0;                // Initialize balance to zero
    }

    // Method to deposit money into the account
    public void deposit(double amount){
        accountBalance = accountBalance + amount;  // Add the deposited amount to the balance
    }

    // Method to withdraw money from the account
    public void widthdraw(double amount) {
        // Check if there's enough balance to withdraw
        if (amount <= accountBalance) {
            accountBalance = accountBalance - amount;  // Subtract the withdrawal amount from the balance
        } else {
            System.out.println("Sorry, insufficient amount");  // Print a message if there's insufficient balance
        }
    }

    // Method to get the current balance of the account
    public double getAccountBalance (){
        return accountBalance;  // Return the current balance
    }

    // Method to display the account information
    public void displayAccountInfo (){
        // Print account details
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("The balance in the account:  $" + accountBalance );
    }
}
