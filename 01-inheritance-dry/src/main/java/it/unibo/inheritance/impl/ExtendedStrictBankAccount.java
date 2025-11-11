package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount{
    private static final double TRANSACTION_FEE = 0.1;

    public ExtendedStrictBankAccount(int id, double balance) {
        super(id, balance);
        super.resetTransactions();
    }
    @Override
    public void withdraw(final int id, final double amount) {
        if (isWithdrawAllowed(amount)) {
            transactionOp(id, -amount);
        }
    }
    @Override
    public void chargeManagementFees(final int id) {
        final double feeAmount = MANAGEMENT_FEE + getTransactionsCount() * ExtendedStrictBankAccount.TRANSACTION_FEE;
        if (checkUser(id) && isWithdrawAllowed(feeAmount)) {
            super.setBalance(super.getBalance() - feeAmount);
            super.resetTransactions();
        }
    }
    private boolean isWithdrawAllowed(final double amount) {
        return getBalance() >= amount;
    }
    private void transactionOp(final int id, final double amount) {
        if (checkUser(id)) {
            super.setBalance( super.getBalance() + amount);
            this.incrementTransactions();
        }
    }
}
