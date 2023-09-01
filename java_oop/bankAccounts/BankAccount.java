public class BankAccount {
    // MEMBER VARIABLES

    // *
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    // CONSTRUCTOR
    // Be sure to increment the number of accounts

    public BankAccount(double startingCheckingBalance, double startingSavingsBalance) {
        this.checkingBalance = startingCheckingBalance;
        this.savingsBalance = startingSavingsBalance;
        accounts++;
        totalMoney += (startingCheckingBalance + startingSavingsBalance);
    }
    // GETTERS
    // for checking, savings, accounts, and totalMoney

    public double getChecking() {
        return checkingBalance;
    }

    public double getSavings() {
        return savingsBalance;
    }

    public double getAccounts() {
        return accounts;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings
    public void deposit(double amount, String accountType) {
        if ("checking".equals(accountType)) {
            checkingBalance += amount;
        } else if ("savings".equals(accountType)) {
            savingsBalance += amount;
        }
        totalMoney += amount;
    }

    // account
    // withdraw
    // - users should be able to withdraw money from their checking or savings
    // account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public Boolean withdraw(double amount, String accountType) {
        if ("checking".equals(accountType)) {
            // remove money from the account -= check that you have enough in the account
            // return the totalamount
            if (checkingBalance >= amount) {
                checkingBalance -= amount;
                totalMoney -= amount;
                return true;
            } else {
                return false; // You don't have enought money.
            }
        } else if ("savings".equals(accountType)) {
            if (savingsBalance >= amount) {
                savingsBalance -= amount;
                totalMoney -= amount;
                return true;
            } else {
                return false; // You don't have enought money.
            }
        } else {
            return false; // You don't have enought money.
        }
    }

    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public double getBalance(String accountType) {
        if ("checking".equals(accountType)) {
            return checkingBalance;
        } else if ("savings".equals(accountType)) {
            return savingsBalance;
        } else {
            return 0; // You don't have enough money.
        }
    }
}
