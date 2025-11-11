package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AbstractBankAccount;
import it.unibo.inheritance.api.AccountHolder;

public class ClassicBankAccount extends AbstractBankAccount {
    protected ClassicBankAccount(AccountHolder holder) {
        super(holder);
    }

    @Override
    protected boolean isWithDrawAllowed(double amount) {
        return false;
    }

    @Override
    protected double computeFee() {
        return 0;
    }
}
