package org.example;

import java.util.List;

class Order {
    private String productName;
    private double price;
    private DataBase dataBase = new DataBase();

    public Order(String product, double price) {
        this.productName = product;
        this.price = price;
    }

    public void saveToDatabase(Order order) {
        List<Order> orders = dataBase.getOrders();
        orders.add(order);
    }

    public void deleteFromDatabase(Order order) {
        List<Order> orders = dataBase.getOrders();
        orders.remove(order);
    }
}

