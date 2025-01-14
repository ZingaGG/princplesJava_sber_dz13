package org.example.Model;

import lombok.Getter;

@Getter
public class Order {
    private String productName;
    private double price;

    public Order(String product, double price) {
        this.productName = product;
        this.price = price;
    }

}

