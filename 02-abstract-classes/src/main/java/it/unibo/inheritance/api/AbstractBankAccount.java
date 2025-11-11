package it.unibo.inheritance.api;

import it.unibo.inheritance.impl.SimpleBankAccount;

public abstract class AbstractBankAccount implements BankAccount{
    protected static final double ATM_TRANSACTION_FEE = 1;
    protected static final double MANAGEMENT_FEE = 5;
    private final AccountHolder holder;
    private double balance;
    private int transactions;

    protected AbstractBankAccount(AccountHolder holder) {
        this.holder = holder;
    }

    @Override
    public void chargeManagementFees(int id) {

    }

    @Override
    public void deposit(int id, double amount) {
        this.transactionOp(id, amount);
    }

    @Override
    public void depositFromATM(int id, double amount) {
        this.deposit(id, amount - AbstractBankAccount.ATM_TRANSACTION_FEE);

    }

    @Override
    public AccountHolder getAccountHolder() {
        return this.holder;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public int getTransactionsCount() {
        return this.transactions;
    }

    @Override
    public void withdraw(int id, double amount) {

    }

    @Override
    public void withdrawFromATM(int id, double amount) {

    }

    protected abstract boolean isWithDrawAllowed( double amount);
    protected abstract double computeFee();

}
