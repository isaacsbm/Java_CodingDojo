public class BankTest {
    public static void main(String[] args) {
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount(100, 200);
        BankAccount account2 = new BankAccount(50, 20);
        BankAccount account3 = new BankAccount(500, 350);
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and
        // display the balance each time

        // * Checkings Account Test */
        account1.deposit(200, "checking");
        System.out.println("Account 1 Checking Balance: " + account1.getBalance("checking"));
        account2.deposit(100, "checking");
        System.out.println("Account 2 Checking Balance: " + account2.getBalance("checking"));
        account3.deposit(500, "checking");
        System.out.println("Account 3 Checking Balance: " + account3.getBalance("checking"));

        System.out.println("-----------------");
        // * Savings Account Test */

        account1.deposit(200, "savings");
        System.out.println("Account 1 Savings Balance: " + account1.getBalance("savings"));
        account2.deposit(100, "savings");
        System.out.println("Account 2 Savings Balance: " + account2.getBalance("savings"));
        account3.deposit(500, "savings");
        System.out.println("Account 3 Savings Balance: " + account3.getBalance("savings"));
        // - each deposit should increase the amount of totalMoney
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account
        // and display the remaining balance

        System.out.println("-----------------");
        account1.withdraw(200, "checking");
        System.out.println("Account 1 Checking Account Balance: " + account1.getBalance("checking"));
        account1.withdraw(200, "savings");
        System.out.println("Account 1 Savings Account Balance: " + account1.getBalance("savings"));

        // - each withdrawal should decrease the amount of totalMoney
        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("Bank Accounts: ");
        System.out.println("Amount across all Accounts: ");

        // * Didn't understand how to do this without creating another Class in the file
        // itself.
    }

}
