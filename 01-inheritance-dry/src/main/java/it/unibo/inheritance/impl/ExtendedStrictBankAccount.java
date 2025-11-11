package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount{
    public ExtendedStrictBankAccount(int id, double balance) {
        super(id, balance);
    }
    private boolean isWithdrawAllowed(final double amount) {
        return getBalance() >= amount;
    }

    @Override
    public void withdraw(final int id, final double amount) {
        if (isWithdrawAllowed(amount)) {
            withdraw(id, -amount);
        }
    }
}
