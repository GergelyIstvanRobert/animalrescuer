package org.fasttrackit;

import java.time.LocalDateTime;

public class Food {
    String name;
    double price;
    double amount;
    LocalDateTime expirationDate;
    boolean availableStock;

    public Food(String name) {
        this.name = name;
    }
}
