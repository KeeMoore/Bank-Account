public class BankTest {
    public static void main(String[] args) {
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and
        // display the balance each time
        // - each deposit should increase the amount of totalMoney
        account1.deposit(1000, "checking");
        account2.deposit(2000, "savings");
        account3.deposit(1500, "checking");

        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Balance: " + account2.getBalance());
        System.out.println("Account 3 Balance: " + account3.getBalance());
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account
        // and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney

        account1.withdraw(500, "checking");
        account2.withdraw(100, "savings");
        account3.withdraw(500, "checking");

        System.out.println("Account 1 Balance after withdrawal: " + account1.getBalance());
        System.out.println("Account 2 Balance after withdrawal: " + account2.getBalance());
        System.out.println("Account 3 Balance after withdrawal: " + account3.getBalance());

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("Total Accounts: " + BankAccount.getAccounts());
        System.out.println("Total Money in all accounts: " + BankAccount.getTotalMoney());

    }
}
