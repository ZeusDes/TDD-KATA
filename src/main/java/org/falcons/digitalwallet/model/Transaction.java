package org.falcons.digitalwallet.model;

import java.time.LocalDateTime;

public class Transaction {
    private TransactionType transactionType;
    private double amount;
    private LocalDateTime created_at;
    private String recipient_name;

    public Transaction(TransactionType transactionType, double amount) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.created_at = LocalDateTime.now();
        this.recipient_name = null;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public String getRecipient_name() {
        return recipient_name;
    }

    public void setRecipient_name(String recipient_name) {
        this.recipient_name = recipient_name;
    }
}
