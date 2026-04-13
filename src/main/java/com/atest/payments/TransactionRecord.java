package com.atest.payments;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TransactionRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Se auto-incrementeaza
    private Long id;

    private double amount;
    private String currency;
    private String maskedCard;
    private String status;
    private String destinationBank;
    private String timestamp;

    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }

    public String getDestinationBank() { return destinationBank; }
    public void setDestinationBank(String destinationBank) { this.destinationBank = destinationBank; }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public String getMaskedCard() { return maskedCard; }
    public void setMaskedCard(String maskedCard) { this.maskedCard = maskedCard; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}