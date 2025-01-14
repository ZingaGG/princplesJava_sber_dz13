package org.example.Repository;

import lombok.Getter;
import org.example.Model.Order;

import java.util.ArrayList;
import java.util.List;

@Getter
public class OrderRepository implements iOrderRepository {

    private final List<Order> orders = new ArrayList<>();

    @Override
    public void saveToDatabase(Order order) {
        this.orders.add(order);
    }

    @Override
    public void deleteFromDatabase(Order order) {
        this.orders.remove(order);
    }
}
