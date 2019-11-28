package org.fasttrackit;

import java.time.LocalDateTime;

public class Food {
    private String name;
    private double price;
    private double amount;
    private LocalDateTime expirationDate;
    private boolean availableStock;

    public Food(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(boolean availableStock) {
        this.availableStock = availableStock;
    }




}
