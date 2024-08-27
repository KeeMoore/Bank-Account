// Group 11
public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // Ninja Bonus 1:

    private String accountNumber;


    // CONSTRUCTOR
    // Be sure to increment the number of accounts and intializes a new bank account 
    public BankAccount(){
        accounts++;
        this.accountNumber = generateAccountNumber(); // ninja Bonus 3 
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance() {
        return checkingBalance;
    }
    
    public double getSavingsBalance() {
        return savingsBalance;
    }
    
    public static int getAccounts() {
        return accounts;
    }
    
    public static double getTotalMoney() {
        return totalMoney;
    }

    // For account number
    public String getAccountNumber() { 
        return accountNumber; 
    } 
    

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void deposit(double amount, String accountType) {
        if (accountType.equals("checking")) {
            checkingBalance += amount;
        } else if (accountType.equals("savings")) {
            savingsBalance += amount;
        }
        totalMoney += amount;
    }
    

    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdraw(double amount, String accountType) {
        if (accountType.equals("checking") && checkingBalance >= amount) {
            checkingBalance -= amount;
            totalMoney -= amount;
        } else if (accountType.equals("savings") && savingsBalance >= amount) {
            savingsBalance -= amount;
            totalMoney -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    

    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public double getBalance() {
        return checkingBalance + savingsBalance;
    }
    // Ninja Bonus 2
    private String generateAccountNumber() {
        StringBuilder accountNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            accountNumber.append((int)(Math.random() * 10));
        }
        return accountNumber.toString();
    }
    

}
