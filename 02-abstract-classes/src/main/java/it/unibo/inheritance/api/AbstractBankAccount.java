package it.unibo.inheritance.api;

public abstract class AbstractBankAccount implements BankAccount{
    @Override
    public void chargeManagementFees(int id) {

    }

    @Override
    public void deposit(int id, double amount) {

    }

    @Override
    public void depositFromATM(int id, double amount) {

    }

    @Override
    public AccountHolder getAccountHolder() {
        return null;
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public int getTransactionsCount() {
        return 0;
    }

    @Override
    public void withdraw(int id, double amount) {

    }

    @Override
    public void withdrawFromATM(int id, double amount) {

    }

    protected abstract boolean isWithDrawAllowed( double amount){
    }
}
