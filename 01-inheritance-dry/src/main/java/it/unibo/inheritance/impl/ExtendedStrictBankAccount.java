package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount{
    private static final double TRANSACTION_FEE = 0.1;

    public ExtendedStrictBankAccount(int id, double balance) {
        super(id, balance);
    }
    private boolean isWithdrawAllowed(final double amount) {
        return getBalance() >= amount;
    }
    @Override
    public void withdraw(final int id, final double amount) {
        if (isWithdrawAllowed(amount)) {
            transactionOp(id, -amount);
        }
    }
    private void transactionOp(final int id, final double amount) {
        if (checkUser(id)) {
            setBalance( getBalance() + amount);
            this.incrementTransactions();
        }
    }
    @Override
    public void chargeManagementFees(final int id) {
        final double feeAmount = MANAGEMENT_FEE + getTransactionsCount() * ExtendedStrictBankAccount.TRANSACTION_FEE;
        if (checkUser(id) && isWithdrawAllowed(feeAmount)) {
            setBalance(getBalance() - feeAmount);
            resetTransactions();
        }
    }
}
