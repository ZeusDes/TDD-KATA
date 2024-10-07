package org.falcons.digitalwallet.model;

public class CreditCard {
    private final String cardNumber;
    private Double balance;
    private String cvv;

    public CreditCard(String cardNumber, String cvv, Double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.cvv = cvv;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
