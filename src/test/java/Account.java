public class Account {
    private String name;
    private double balance;

    /**
     * Creates an account with a user's name and
     * starting balance.
     */
    public Account(String userName, double accountBalance)
    {
        /* to be implemented in part (a) */
        name=userName;
        balance=accountBalance;
    }

    /**
     * Creates an account with just the user's name
     * and sets the account balance to a default value
     * of 0.0
     */
    public Account(String userName)
    {
        /* to be implemented in part (a) */
        name=userName;
        balance=0.0;
    }

    /**
     * Adds the specified amount to the account balance.
     */
    public void deposit(double amount)
    {
        /* to be implemented in part (b) */
        balance += amount;
    }

    /**
     * Removes the specified amount from the account balance.
     */
    public void withdraw(double amount)
    {
        balance -= amount;
        /* to be implemented in part (b) */
    }
}
