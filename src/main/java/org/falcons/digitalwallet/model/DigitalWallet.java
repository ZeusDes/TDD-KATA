package org.falcons.digitalwallet.model;

import java.util.ArrayList;
import java.util.List;

public class DigitalWallet {
    private String owner;
    private Double balance;
    private CreditCard creditCard;
    private List<Transaction> transactionsHistory;
    private boolean isActive;

    public DigitalWallet(String owner, CreditCard creditCard) {
        this.owner = owner;
        this.balance = 0D;
        this.creditCard = creditCard;
        this.transactionsHistory = new ArrayList<>();
        this.isActive = true;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public List<Transaction> getTransactionsHistory() {
        return transactionsHistory;
    }

    public void addTransactionToHistory(Transaction transaction) {
        this.transactionsHistory.add(transaction);
    }

    public boolean isActive() {
        return isActive;
    }

    public void deactivate() {
        this.isActive = false;
    }

    public void activate() {
        this.isActive = true;
    }
}
