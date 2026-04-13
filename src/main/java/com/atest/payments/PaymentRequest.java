package com.atest.payments;

public class PaymentRequest {
    private double amount;
    private String currency;
    private String cardNumber;
    private String destinationBank;

    public String getDestinationBank() { return destinationBank; }
    public void setDestinationBank(String destinationBank) { this.destinationBank = destinationBank; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }
}